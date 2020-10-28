package com.gcc.app.usuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.gcc.app.common.usuarios.entity.Usuario;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{
	
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class);
	}

}
