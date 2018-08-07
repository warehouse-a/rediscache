package com.rediscache.service;

import com.rediscache.bean.TestBean;
import com.rediscache.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;

/**
 * Created by liwk
 * Date:2018/8/6 11:27
 */
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private RedisCacheManager cacheManager;


    /**
     * 控制器  cache方式加缓存
     * @param id
     * @return
     */
    @Cacheable(value = "testBean")
    public TestBean getBeanId(Integer id){
        return testMapper.getBeanId(id);
    }
    /**
     * 获得控制器获得缓存
     * @param id
     */
    public void cacheController(Integer id){
        Cache cache = cacheManager.getCache("testBean");
        TestBean testBean = cache.get(id, TestBean.class);
        System.out.println(testBean);
    }




    /**
     * redis方式加缓存
     * @param id
     */
    public void redisIns(Integer id){
        TestBean testBean = testMapper.getBeanId(id);
        redisTemplate.opsForValue().set("redis", testBean);
    }
    /**
     * redis方式获得缓存
     */
    public void redisGet(String redisName){
        TestBean testBean = (TestBean) redisTemplate.opsForValue().get(redisName);
        System.out.println(testBean);
    }


}
