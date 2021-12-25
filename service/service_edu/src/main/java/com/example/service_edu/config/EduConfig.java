package com.example.service_edu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName EduConfig
 * @Descriptin TODO
 * @Author gouge
 * @Date 2021/12/25  18:14
 **/
@Configuration
@MapperScan("com.example.service_edu.edu.mapper")
public class EduConfig {

}
