package com.mba.pizzaria.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mba.pizzaria.model.entity.Usuario;

/**
 * @author Ivan Pagoto
 */

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
