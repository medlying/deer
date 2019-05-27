package com.sodacar.deer.service.model.BaseUserVo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bosong
 * @date 2019-05-27
 */

public class Creator {
    @JsonProperty("id")
    private Long creatorId;

    @JsonProperty("name")
    private String creatorName;

    @JsonProperty("type")
    private String creatorType;

    public Creator(Long creatorId, String creatorName, String creatorType) {
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.creatorType = creatorType;
    }
}
