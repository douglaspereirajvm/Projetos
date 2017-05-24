package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CLIENTE")
@SequenceGenerator(name="seqCliente",sequenceName="SQ_T_CLIENTE",allocationSize=1)
public class Cliente {

	@Id
	@Column(name="CD_CLIENTE")
	@GeneratedValue(generator="seqCliente",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NM_CLIENTE",nullable=false)
	private String nome;
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public Cliente() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
