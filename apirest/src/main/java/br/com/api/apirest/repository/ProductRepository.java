package br.com.api.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.apirest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
