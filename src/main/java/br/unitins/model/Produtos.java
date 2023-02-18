package br.unitins.model;


import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Produtos extends PanacheEntity {

    private String nome;
    private String marca;
    private String codBarras;
    private float preco;
    private String fornecedora;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCodBarras() {
		return this.codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public float getPreco() {
		return this.preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getFornecedora() {
		return this.fornecedora;
	}

	public void setFornecedora(String fornecedora) {
		this.fornecedora = fornecedora;
	}


    

}