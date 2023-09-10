package br.com.api.apirest.dto;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.api.apirest.model.Supplier;

import java.math.BigDecimal;


public class ProductCreateDto {		
    @NotBlank(message = "informe o nome")
	private String name;
	
    @NotNull(message = "Informe o estoque")
	private Integer quantStock;
	
    @NotNull(message = "Informe a unidade de preço")
	private BigDecimal unitPrice;
	
    @NotNull(message = "Informe o fornecedor")
	private Supplier supplier_id;





	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantStock() {
		return quantStock;
	}
	public void setQuantStock(Integer quantStock) {
		this.quantStock = quantStock;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Supplier getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(Supplier supplier_id) {
		this.supplier_id = supplier_id;
	}	
	
}