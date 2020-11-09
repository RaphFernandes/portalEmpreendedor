package br.org.rj.teresopolis.empreendedor.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Company implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeEmpresarial;
	private	String nomeFantasia;
	private String cnpj;
	private LocalDate dataAbertura;
	private String inscMunicipal;
	private String protocoloAndamento;
	@JoinColumn(name = "endereco_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	private String telefone;
	@ManyToOne
	@JoinColumn(name = "businessman_id")
	private User businessman;
	
	public Company(){
		
	}

	public Company(Long id, String nomeEmpresarial, String nomeFantasia, String cnpj, LocalDate dataAbertura,
			String inscMunicipal, String protocoloAndamento, Endereco endereco, String telefone, User businessman) {
		super();
		this.id = id;
		this.nomeEmpresarial = nomeEmpresarial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.dataAbertura = dataAbertura;
		this.inscMunicipal = inscMunicipal;
		this.protocoloAndamento = protocoloAndamento;
		this.endereco = endereco;
		this.telefone = telefone;
		this.businessman = businessman;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeEmpresarial() {
		return nomeEmpresarial;
	}

	public void setNomeEmpresarial(String nomeEmpresarial) {
		this.nomeEmpresarial = nomeEmpresarial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getInscMunicipal() {
		return inscMunicipal;
	}

	public void setInscMunicipal(String inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
	}

	public String getProtocoloAndamento() {
		return protocoloAndamento;
	}

	public void setProtocoloAndamento(String protocoloAndamento) {
		this.protocoloAndamento = protocoloAndamento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public User getBusinessman() {
		return businessman;
	}

	public void setBusinessman(User businessman) {
		this.businessman = businessman;
	}
	
}
