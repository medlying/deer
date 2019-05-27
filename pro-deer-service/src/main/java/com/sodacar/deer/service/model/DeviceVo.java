package com.sodacar.deer.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sodacar.deer.dao.model.Device;
import com.sodacar.deer.service.model.BaseUserVo.Creator;
import com.sodacar.deer.service.model.BaseUserVo.Updater;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.joda.time.DateTime;

/**
 * @author bosong
 * @date 2019-05-27
 */

@Data
@AllArgsConstructor
public class DeviceVo {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("number")
    private String number;

    @JsonProperty("card_number")
    private String cardNumber;

    @JsonProperty("status")
    private String status;

    @JsonProperty("is_deleted")
    private Boolean isDeleted;

    @JsonProperty("created_at")
    private DateTime createdAt;

    @JsonProperty("creator")
    private Creator creator;

    @JsonProperty("updated_at")
    private DateTime updatedAt;

    @JsonProperty("updater")
    private Updater updater;

    public static DeviceVo generator(Device device) {
        return new DeviceVo(device.getId(), device.getNumber(), device.getCardNumber(), device.getStatus(),
                device.getIsDeleted(), device.getCreatedAt(), new Creator(device.getCreatorId(), device.getCreatorName(), device.getCreatorType()),
                device.getUpdatedAt(), new Updater(device.getUpdaterId(), device.getUpdaterName(), device.getUpdaterType()));
    }
}
