package com.ecomerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.dominio.Produto;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Integer> {

}
