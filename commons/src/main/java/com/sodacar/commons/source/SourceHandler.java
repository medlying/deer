package com.sodacar.commons.source;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bosong
 * @date 2019-05-25
 */

@Component
public class SourceHandler {

    private Locale defaultLocale;

    private final Map<Locale, Resource> cache = new ConcurrentHashMap();

    public SourceHandler() {
        defaultLocale = Locale.SIMPLIFIED_CHINESE;
    }

    public SourceHandler(Locale locale) {
        this.defaultLocale = locale;
    }

    public Resource resource(HttpServletRequest httpServletRequest) {
        return locals(getLocalByRequest(httpServletRequest));
    }

    private Locale getLocalByRequest(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getLocale();
    }

    private Resource locals(Locale locale) {
        if (!cache.containsKey(locale)) {
            cache.put(locale, new Resource(locale));
        }
        return cache.get(locale);
    }

    public class Resource {

        private final Locale locale;

        private volatile Properties properties;

        public Resource(Locale locale) {
            this.locale = locale;
        }

        public Optional<String> property(String code) {
            return Optional.ofNullable(properties().getProperty(code));
        }

        private Properties properties() {
            if (properties == null) {
                synchronized (this) {
                    if (properties == null) {
                        try(InputStreamReader inputStreamReader = new InputStreamReader(getPropertyInputStream(locale), Charset.forName("UTF-8"))) {
                            properties = new Properties();
                            properties.load(inputStreamReader);
                        } catch (IOException e) {
                            e.printStackTrace();
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
            return properties;
        }

        private InputStream getPropertyInputStream(Locale locale) {
            InputStream inputStream = ClassLoader.getSystemResourceAsStream(propertiesByLocale(locale));
            if (inputStream == null) {
                return ClassLoader.getSystemResourceAsStream(propertiesByLocale(defaultLocale));
            }
            return inputStream;
        }

        private String propertiesByLocale(Locale defaultLocale) {
            return locale.toString() + ".properties";
        }
    }
}
