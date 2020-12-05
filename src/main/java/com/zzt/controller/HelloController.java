package com.zzt.controller;


import com.zzt.config.GlobalVarConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;
import com.alibaba.fastjson.*;

@Slf4j
@RestController
public class HelloController {
    @Autowired
    GlobalVarConfig globalVarConfig;

    @GetMapping("/")
    public JSONObject hello(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("helloValue", globalVarConfig.helloValue);
        log.info(globalVarConfig.helloValue);
        return jsonObject;
    }

    @PostMapping("/post")
    public JSONObject post(@RequestParam("i") Integer i){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("post", "success");
        return jsonObject;
    }
}
