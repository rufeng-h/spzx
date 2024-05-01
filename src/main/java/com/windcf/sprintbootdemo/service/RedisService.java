package com.windcf.sprintbootdemo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisService {
    private final StringRedisTemplate redisTemplate;
    private final ObjectMapper objectMapper;

    public RedisService(StringRedisTemplate redisTemplate, ObjectMapper objectMapper) {
        this.redisTemplate = redisTemplate;
        this.objectMapper = objectMapper;
    }


    public void set(String key, Object value) {
        try {
            redisTemplate.opsForValue().set(key, objectMapper.writeValueAsString(value));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    public <T> T get(String key, Class<T> requiredType) {
        String s = redisTemplate.opsForValue().get(key);
        if (s == null) {
            return null;
        }
        try {
            return objectMapper.readValue(s, requiredType);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void setEx(String key, Object value, int seconds) {
        try {
            redisTemplate.opsForValue().set(key, objectMapper.writeValueAsString(value), seconds, TimeUnit.SECONDS);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}