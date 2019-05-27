package com.sodacar.deer.service.model.BaseUserVo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bosong
 * @date 2019-05-27
 */

public class Updater {

    @JsonProperty("id")
    private Long updaterId;

    @JsonProperty("name")
    private String updaterName;

    @JsonProperty("type")
    private String updaterType;

    public Updater(Long updaterId, String updaterName, String updaterType) {
        this.updaterId = updaterId;
        this.updaterName = updaterName;
        this.updaterType = updaterType;
    }
}
