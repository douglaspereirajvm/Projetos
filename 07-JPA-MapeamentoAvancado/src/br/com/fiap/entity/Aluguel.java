package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(AluguelPK.class)
@Table(name="T_ALUGUEL")
public class Aluguel {

	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_CLIENTE")
	private Cliente cliente;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_AUTOMOVEL")
	private Automovel automovel;
	
	@Id
	@Column(name="DT_ALUGUEL")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataAluguel;
	
	@Column(name="DT_DEVOLUCAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataDevolucao;
	
	@Column(name="VL_ALUGUEL",nullable=false)
	private double valor;

	public Aluguel() {
		super();
	}

	public Aluguel(Cliente cliente, Automovel automovel, Calendar dataAluguel, Calendar dataDevolucao, double valor) {
		super();
		this.cliente = cliente;
		this.automovel = automovel;
		this.dataAluguel = dataAluguel;
		this.dataDevolucao = dataDevolucao;
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	public Calendar getDataAluguel() {
		return dataAluguel;
	}

	public void setDataAluguel(Calendar dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
