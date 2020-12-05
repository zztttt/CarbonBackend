package com.zzt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalVarConfig {
    @Value("${helloValue}")
    public String helloValue;
}
