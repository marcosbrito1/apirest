package br.com.api.apirest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.apirest.dto.ProductCreateDto;
import br.com.api.apirest.dto.ProductUpdateDto;
import br.com.api.apirest.model.Product;
import br.com.api.apirest.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
private ProductService productService;	
public ProductController(ProductService productService) {
	this.productService = productService;
}

@GetMapping
public ResponseEntity<List<Product>> listProduct(){
	return ResponseEntity.status(200).body(productService.listProduct());
}

@GetMapping("/{id}")
public ResponseEntity<Product> listProductById(@PathVariable Long id){
	return ResponseEntity.status(200).body(productService.listProductById(id));
}

@PostMapping
public ResponseEntity<Product> createProduct(@Valid @RequestBody ProductCreateDto productCreateDto){
	Product product = new Product();
	BeanUtils.copyProperties(productCreateDto, product);
	return ResponseEntity.status(201).body(productService.createProduct(product));
}

@PutMapping
public ResponseEntity<Product> updateProduct(@Valid @RequestBody ProductUpdateDto productUpdateDto){
	Product product = new Product();
	BeanUtils.copyProperties(productUpdateDto, product);
	return ResponseEntity.status(200).body(productService.updateProduct(product));
}

@PutMapping("/{id}/{type}/{quantity}")
public ResponseEntity<Product> updateStock(@PathVariable Long id, @PathVariable String type, @PathVariable Integer quantity){
	return ResponseEntity.status(200).body(productService.updateStock(id, type, quantity));
}

@DeleteMapping("/{id}")
public ResponseEntity<?> deleteProduct(@PathVariable Long id){
	productService.deleteProduct(id);
	return ResponseEntity.status(204).build();
}



}
