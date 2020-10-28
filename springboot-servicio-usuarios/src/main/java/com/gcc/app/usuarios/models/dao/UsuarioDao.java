package com.gcc.app.usuarios.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.gcc.app.common.usuarios.entity.Usuario;

@RepositoryRestResource(path = "usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {
	/**
	 *  por defecto genera una consulta rest localhost:8090/api/usuarios/usuarios/search/findByUsername?username=gabi
	 *  alcambiarlo con la anotacion genera localhost:8090/api/usuarios/usuarios/search/buscar-username?username=gabi (Necesario @Param para que funcione @RestResource)
	 * @param username
	 * @return
	 */
	@RestResource(path = "buscar-username")
	public Usuario findByUsername(@Param("username")String username);

}
