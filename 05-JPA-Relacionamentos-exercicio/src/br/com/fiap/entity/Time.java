package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_TIME")
@SequenceGenerator(name="seqTime",sequenceName="SQ_TB_TIME",allocationSize=1)
public class Time {

	@Id
	@Column(name="CD_TIME")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTime")
	private int codigo;
	
	@Column(name="NM_TIME")
	private String nome;
	
	@Column(name="DT_FUNDACAO")
	@Temporal(TemporalType.DATE)
	private Calendar dataFundacao;
	
	@Column(name="NR_TITULO")
	private int titulo;
	
	@OneToOne(cascade=CascadeType.PERSIST,fetch=FetchType.LAZY)
	@JoinColumn(name="CD_TECNICO")
	private Tecnico tecnico;
	
	@ManyToMany(cascade=CascadeType.PERSIST,fetch=FetchType.LAZY)
	@JoinTable(name="TB_TIME_CAMPEONATO",
		joinColumns=@JoinColumn(name="CD_TIME"),
		inverseJoinColumns=@JoinColumn(name="CD_CAMPEONATO"))
	private List<Campeonato> campeonatos;
	
	@OneToMany(mappedBy="time",cascade=CascadeType.PERSIST)
	private List<Jogador> jogadores = new ArrayList<>();

	//OneToMany -> cadastrar em cascata
	public void addJogador(Jogador jogador){
		jogadores.add(jogador);
		jogador.setTime(this);
	}
	
	public Time(int codigo, String nome, Calendar dataFundacao, int titulo, Tecnico tecnico,
			List<Campeonato> campeonatos) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataFundacao = dataFundacao;
		this.titulo = titulo;
		this.tecnico = tecnico;
		this.campeonatos = campeonatos;
	}

	public Time() {
		super();
		// TODO Auto-generated constructor stub
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

	public Calendar getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Calendar dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public int getTitulo() {
		return titulo;
	}

	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
}
