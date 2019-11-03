package br.com.unicarioca.projetointegrador.timec.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "beneficiario")
@XmlRootElement
@NamedQueries({
@NamedQuery(name = "BeneficiarioModel.findAll", query = "SELECT b FROM BeneficiarioModel b")})
public class BeneficiarioModel implements Serializable{

	
/*nr_matricula
nm_beneficiario
nr_cpf
dt_nascimento
sn_ativo
sexo
ds_email
tp_logradouro
ds_endereco
nr_endereco
ds_bairro
ds_cidade
cd_uf
nr_cep*/
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nr_matricula")
	private Integer numeroMatricula ;
	@Size(max = 45)
	@Column(name = "nm_beneficiario")
	private String nomeBeneficiario ;
	@Column(name = "nr_cpf")
	private Integer cpf;
	@Column(name = "dt_nascimento")
    @Temporal(TemporalType.DATE)
	private Date dataNascimento ;
	@Column(name = "sn_ativo")
	private String status;
	@Column(name = "sexo")
	private String sexo ;
	@Size(max = 45)
	@Column(name = "ds_email")
	private String email ;
	@Size(max = 45)
	@Column(name = "tp_logradouro")
	private String logradouro ;
	@Size(max = 45)
	@Column(name = "ds_endereco")
	private String descricaoEndereco ;
	@Column(name = "nr_endereco")
	private Integer numeroEndereco ;
	@Size(max = 45)
	@Column(name = "ds_bairro")
	private String descricaoBairro ;
	@Size(max = 45)
	@Column(name = "ds_cidade")
	private String descricaoCidade ;
	@Size(max = 45)
	@Column(name = "cd_uf")
	private String uf;
	@Size(max = 45)
	@Column(name = "nr_cep")
	private Integer cep ;
	
	
	
	
	public BeneficiarioModel() {
		// TODO Auto-generated constructor stub
	}




	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}




	public void setNumeroMatricula(Integer numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}




	public String getNomeBeneficiario() {
		return nomeBeneficiario;
	}




	public void setNomeBeneficiario(String nomeBeneficiario) {
		this.nomeBeneficiario = nomeBeneficiario;
	}




	public Integer getCpf() {
		return cpf;
	}




	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}




	public Date getDataNascimento() {
		return dataNascimento;
	}




	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public String getSexo() {
		return sexo;
	}




	public void setSexo(String sexo) {
		this.sexo = sexo;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getLogradouro() {
		return logradouro;
	}




	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}




	public String getDescricaoEndereco() {
		return descricaoEndereco;
	}




	public void setDescricaoEndereco(String descricaoEndereco) {
		this.descricaoEndereco = descricaoEndereco;
	}




	public Integer getNumeroEndereco() {
		return numeroEndereco;
	}




	public void setNumeroEndereco(Integer numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}




	public String getDescricaoBairro() {
		return descricaoBairro;
	}




	public void setDescricaoBairro(String descricaoBairro) {
		this.descricaoBairro = descricaoBairro;
	}




	public String getDescricaoCidade() {
		return descricaoCidade;
	}




	public void setDescricaoCidade(String descricaoCidade) {
		this.descricaoCidade = descricaoCidade;
	}




	public String getUf() {
		return uf;
	}




	public void setUf(String uf) {
		this.uf = uf;
	}




	public Integer getCep() {
		return cep;
	}




	public void setCep(Integer cep) {
		this.cep = cep;
	}




	@Override
	public String toString() {
		return "BeneficiarioModel [numeroMatricula=" + numeroMatricula + ", nomeBeneficiario=" + nomeBeneficiario
				+ ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", status=" + status + ", sexo=" + sexo
				+ ", email=" + email + ", logradouro=" + logradouro + ", descricaoEndereco=" + descricaoEndereco
				+ ", numeroEndereco=" + numeroEndereco + ", descricaoBairro=" + descricaoBairro + ", descricaoCidade="
				+ descricaoCidade + ", uf=" + uf + ", cep=" + cep + "]";
	}
	
	
	
	
	
	

}
