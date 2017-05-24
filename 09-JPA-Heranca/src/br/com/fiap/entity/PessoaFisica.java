package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_PESSOA_FISICA")
//@DiscriminatorValue("PF")
public class PessoaFisica extends Pessoa {

	@Column(name="NR_RG")
	private String rg;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, String rg) {
		super(nome);
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
