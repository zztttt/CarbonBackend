package com.zzt.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.zzt.config.VehicleType;

public class StartTravelRequest {
    @JSONField(ordinal = 1)
    private Long userId;

    @JSONField(ordinal = 2)
    private VehicleType vehicleType;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}
