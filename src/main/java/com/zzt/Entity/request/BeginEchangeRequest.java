package com.zzt.entity.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class BeginEchangeRequest {
    @JSONField(ordinal = 1)
    private Long userId;

    @JSONField(ordinal = 2)
    private Long objectId;

    @JSONField(ordinal = 3)
    private Integer amount;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}
