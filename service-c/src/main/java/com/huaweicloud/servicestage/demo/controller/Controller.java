package com.huaweicloud.servicestage.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * controller
 *
 * @author provenceee
 * @since 2023-07-25
 */
@RestController
public class Controller {
    @Value("${spring.application.name}")
    private String name;

    @Value("${service_meta_version:${SERVICE_META_VERSION:${service.meta.version:1.0.0}}}")
    private String version;

    /**
     * 测试方法
     *
     * @return msg
     */
    @GetMapping("service-c/hello")
    public Map<String, Object> hello() {
        Map<String, Object> map = new HashMap<>();
        map.put("version", version);
        Map<String, Object> result = new HashMap<>();
        result.put(name, map);
        return result;
    }
}
