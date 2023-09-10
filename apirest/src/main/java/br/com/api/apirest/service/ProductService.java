package br.com.api.apirest.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.api.apirest.model.Product;
import br.com.api.apirest.repository.ProductRepository;


@Service
public class ProductService {
	private ProductRepository repository;
	public ProductService(ProductRepository repository) {
		this.repository = repository;
	}
	
	
	
	public List<Product> listProduct(){
		List<Product> listProducts = repository.findAll();
		return listProducts;
	}
	
	public Product listProductById(Long id){
		Product listProducts = repository.getReferenceById(id);
		return listProducts;
	}
	
	public Product createProduct(Product product) {
		product.setDateCreation(new Date());
		Product newProduct = repository.save(product);
		return newProduct;
	}
	
	public Product updateProduct(Product product) {
		product.setLastUpdate(new Date());
		Product productUpdated = repository.save(product);	
		return productUpdated;
	}
	
	public Product updateStock(Long id, String type, Integer quantity) {
		Product product = repository.getReferenceById(id);
		product.setLastUpdate(new Date());
		if(type.equals("increase")) {
			product.setQuantStock(product.getQuantStock()+quantity);
		}else if(type.equals("decrease")) {
			product.setQuantStock(product.getQuantStock()-quantity);
		}
		Product productUpdated = repository.save(product);	
		return productUpdated;
	}
	
	public Boolean deleteProduct(Long id) {
		
		repository.deleteById(id);
		return true;
	}

}
