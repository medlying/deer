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
public class Updater {

    @JsonProperty("id")
    private Long updaterId;

    @JsonProperty("name")
    private String updaterName;

    @JsonProperty("type")
    private String updaterType;
}
