package com.zzt.entity.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class EndTravelRequest {
    @JSONField(ordinal = 1)
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}
