package com.smartbi.app.log.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;


/**
 *
 * @author L99
 * @createDate 2019/7/14
 *
 */
@Configuration
public class ImageConfig {

    @Bean
    public BufferedImageHttpMessageConverter bufferedImageHttpMessageConverter(){
        return new BufferedImageHttpMessageConverter();
    }
}
