package com.mba.pizzaria.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mba.pizzaria.model.entity.Pedido;

/**
 * @author Ivan Pagoto
 */

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
