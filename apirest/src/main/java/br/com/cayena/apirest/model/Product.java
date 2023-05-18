package br.com.cayena.apirest.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;



@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = IDENTITY)
    private Long id;
		
    @NotBlank(message = "informe o nome")
    @Column(nullable = false)
	private String name;
	
    @NotNull(message = "Informe o estoque")
	@Column(nullable = false)
	private Integer quantStock;
	
    @NotNull(message = "Informe a unidade de preço")
	@Column(nullable = false)
	private BigDecimal unitPrice;
	
    @NotNull(message = "Informe a Supplier")
	@ManyToOne
	@JoinColumn(name = "supplier_id", nullable = false)
	private Supplier supplier_id;
	
	private Date dateCreation;

	private Date lastUpdate;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	
}