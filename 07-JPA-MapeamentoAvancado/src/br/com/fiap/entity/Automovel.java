package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_AUTOMOVEL")
@SequenceGenerator(name="seqAuto",sequenceName="SQ_T_AUTOMOVEL",allocationSize=1)
public class Automovel {

	@Id
	@Column(name="CD_AUTOMOVEL")
	@GeneratedValue(generator="seqAuto",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="DS_MODELO",nullable=false)
	private String modelo;
	
	@Column(name="DS_MARCA",nullable=false)
	private String marca;
	
	public Automovel(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}

	public Automovel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
