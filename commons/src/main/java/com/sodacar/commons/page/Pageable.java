package com.sodacar.commons.page;

import java.util.List;
import java.util.function.BiFunction;

public class Pageable<T> {

    private static int MAX_PER_PAGE = 100;

    private static int MIN_PER_PAGE = 5;

    private long size;

    private BiFunction<Long, Long, List<T>> provider;

    public Pageable(long size, BiFunction<Long, Long, List<T>> provider) {
        this.size = size;
        this.provider = provider;
    }

    public List<T> page(long page, long perPage) {
        return provider.apply((getConsolidatedPage(page) - 1) * perPage, getConsolidatedPerPage(perPage));
    }

    public long size() {
        return size;
    }

    private long getConsolidatedPage(long page) {
        return page < 1 ? 1 : page;
    }

    private long getConsolidatedPerPage(long perPage) {
        if (perPage > MAX_PER_PAGE) {
            return MAX_PER_PAGE;
        }
        if (perPage < MIN_PER_PAGE) {
            return MIN_PER_PAGE;
        }
        return perPage;
    }

    public Page<T> toPage(long page, long perPage) {
        long consolidatedPage = getConsolidatedPage(page);
        long consolidatedPerPage = getConsolidatedPerPage(perPage);
        return new Page<>(size,
                consolidatedPage,
                consolidatedPerPage,
                page(consolidatedPage, consolidatedPerPage));
    }

    public Page<T> toReferencePage(long page, long perPage) {
        long consolidatedPage = getConsolidatedPage(page);
        long consolidatedPerPage = getConsolidatedPerPage(perPage);
        return new Page<>(size,
                consolidatedPage,
                consolidatedPerPage,
                new ReferenceList<>(
                        page(consolidatedPage, consolidatedPerPage)));
    }
}