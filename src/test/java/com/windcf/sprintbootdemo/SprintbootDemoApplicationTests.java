package com.windcf.sprintbootdemo;

import com.windcf.sprintbootdemo.model.entity.SysUser;
import com.windcf.sprintbootdemo.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"dev", "mysql"})
@SpringBootTest
class SprintbootDemoApplicationTests {

    @Autowired
    private RedisService redisService;

    @Test
    void contextLoads() {
    }

    @Test
    void testRedis() {
        System.out.println(redisService.get("dsaf", SysUser.class));
    }

}
