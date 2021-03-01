package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: TODO
 * @author: 33711.
 * @date: 2020/6/22 12:10.
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule () {
        return new RandomRule();
    }
}
