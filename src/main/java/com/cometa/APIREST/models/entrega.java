package com.cometa.APIREST.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TB_ENTREGAS")
public class entrega implements Serializable{

	private static final long  serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long idEntregador;
	private long idDestinatario;
	
	private long cnpj;
	private long cnpjDestinatario;
	private String razaoSocial;
	private String endereçoDestinatario;
	private String endereçoRemetente;
	private String nomeDestinatario;
	private String nomeProduto;
	private Double peso;
	private Double volume;
	private BigDecimal valor;

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdEntregador() {
		return idEntregador;
	}
	public void setIdEntregador(long idEntregador) {
		this.idEntregador = idEntregador;
	}
	public long getIdDestinatario() {
		return idDestinatario;
	}
	public void setIdDestinatario(long idDestinatario) {
		this.idDestinatario = idDestinatario;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public long getCnpjDestinatario() {
		return cnpjDestinatario;
	}
	public void setCnpjDestinatario(int cnpjDestinatario) {
		this.cnpjDestinatario = cnpjDestinatario;
	}
	public String getEndereçoDestinatario() {
		return endereçoDestinatario;
	}
	public void setEndereçoDestinatario(String endereçoDestinatario) {
		this.endereçoDestinatario = endereçoDestinatario;
	}
	public String getEndereçoRemetente() {
		return endereçoRemetente;
	}
	public void setEndereçoRemetente(String endereçoRemetente) {
		this.endereçoRemetente = endereçoRemetente;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getNomeDestinatario() {
		return nomeDestinatario;
	}
	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
