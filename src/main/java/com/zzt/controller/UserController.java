package com.zzt.controller;

import com.alibaba.fastjson.JSONObject;
import com.zzt.domain.request.BeginEchangeRequest;
import com.zzt.domain.request.EndTravelRequest;
import com.zzt.domain.request.StartTravelRequest;
import com.zzt.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user/startTravel")
    public JSONObject startTravel(@RequestBody StartTravelRequest startTravelRequest){
        log.info("startTravel:" + startTravelRequest.toString());
        return userService.startTravel(startTravelRequest.getUserId(), startTravelRequest.getVehicleType());
    }

    @PostMapping("/user/endTravel")
    public JSONObject endTravel(@RequestBody EndTravelRequest endTravelRequest){
        log.info("endTravel:" + endTravelRequest.toString());
        return userService.endTravel(endTravelRequest.getUserId());
    }

    @PostMapping("/user/beginExchange")
    public JSONObject beginExchange(@RequestBody BeginEchangeRequest beginEchangeRequest){
        log.info("beginExchange:" + beginEchangeRequest.toString());
        return userService.beginExchange(beginEchangeRequest.getUserId(), beginEchangeRequest.getObjectId(), beginEchangeRequest.getAmount());
    }
}
