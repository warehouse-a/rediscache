package com.rediscache.mapper;

import com.rediscache.bean.TestBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by liwk
 * Date:2018/8/6 11:06
 */
@Mapper
@Component
public interface TestMapper {

    TestBean getBeanId(Integer id);
}
