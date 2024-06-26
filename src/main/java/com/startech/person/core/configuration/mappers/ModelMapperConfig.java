package com.startech.person.core.configuration.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.startech.person.core.utils.mappers.ModelMapperImp;
import com.startech.person.core.utils.mappers.ModelMapperService;

@Configuration
public class ModelMapperConfig {
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

	@Bean
	public ModelMapperService getModelMapperService(ModelMapper mapper) {
		return new ModelMapperImp(mapper);
	}
}