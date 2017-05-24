package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_TDSF_DEPENDENTE")
@IdClass(DependentePK.class)
public class Dependente {

	@Id
	@Column(name="CD_DEPENDENTE")
	@SequenceGenerator(name="seqDep",sequenceName="SQ_T_DEPENDENTE",allocationSize=1)
	@GeneratedValue(generator="seqDep",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Id
	@JoinColumn(name="CD_FUNCIONARIO")
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Funcionario funcionario;
	
	@Column(name="NM_DEPENDENTE",nullable=false)
	private String nome;
	
	public Dependente() {
		super();
	}

	public Dependente(Funcionario funcionario, String nome) {
		super();
		this.funcionario = funcionario;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
