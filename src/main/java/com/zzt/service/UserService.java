package com.zzt.service;

import com.alibaba.fastjson.*;
import com.zzt.config.VehicleType;

public interface UserService {
    JSONObject startTravel(Long userId, VehicleType vehicleType);
    JSONObject endTravel(Long userId);

    JSONObject beginExchange(Long userId, Long objectId, Integer amount);
}
