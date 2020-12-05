package com.zzt.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zzt.config.VehicleType;
import com.zzt.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public JSONObject startTravel(Long userId, VehicleType vehicleType) {
        JSONObject ret = new JSONObject();
        ret.put("startTravel", "success");
        return ret;
    }

    @Override
    public JSONObject endTravel(Long userId) {
        JSONObject ret = new JSONObject();
        ret.put("endTravel", "success");
        return ret;
    }

    @Override
    public JSONObject beginExchange(Long userId, Long objectId, Integer amount) {
        JSONObject ret = new JSONObject();
        ret.put("beginExchange", "success");
        return ret;
    }
}
