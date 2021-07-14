package com.example.api.configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class BeansConfiguration {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
