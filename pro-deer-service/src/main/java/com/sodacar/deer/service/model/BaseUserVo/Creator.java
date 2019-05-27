package com.sodacar.deer.service.model.BaseUserVo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author bosong
 * @date 2019-05-27
 */

@Data
@AllArgsConstructor
public class Creator {
    @JsonProperty("id")
    private Long creatorId;

    @JsonProperty("name")
    private String creatorName;

    @JsonProperty("type")
    private String creatorType;
}
