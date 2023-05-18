package br.com.cayena.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cayena.apirest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
