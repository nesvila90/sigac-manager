package com.digitallab.sigac.configuration;

import com.digitallab.sigac.commons.enums.IdentityType;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

    @Bean
    public ModelMapper modelMapper() {

        ModelMapper model = new ModelMapper();
        model.createTypeMap(Integer.class, IdentityType.class);
        model.addConverter(mappingContext -> mappingContext.getSource());
        return new ModelMapper();
    }
}
