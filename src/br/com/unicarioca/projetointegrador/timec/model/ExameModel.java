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

/*enginner: jeison muniz
 * backlog: 
 * Background:  
 * Scenario: 
* Given:
  Then:
   And:
*/

@Entity
@Table(name = "exame")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExameModel.findAll", query = "SELECT e FROM ExameModel e")})
public class ExameModel implements Serializable{

	
	/*
	 * exame_id
ds_tipo
ex_descricao
dt_data_solicitacao
sn_status
beneficiario_beneficiario_id
dt_data_conclusao
	 * */
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "exame_id")
	private Integer exameId ;
	@Size(max = 45)
	@Column(name = "ex_descricao")
	private String descricao ;
	@Column(name = "dt_data_solicitacao")
    @Temporal(TemporalType.DATE)
	private Date datSolicitacao ;
	@Size(max = 45)
	@Column(name = "sn_status")
	private String status ;
	@Column(name = "beneficiario_beneficiario_id")
	private Integer idBeneficiario ;
	@Column(name = "dt_data_conclusao")
    @Temporal(TemporalType.DATE)
	private Date dataConclusao ;
	@Size(max = 20)
	@Column(name = "ds_notificacao")
	private String dsNotificacao ;
	
	
	
	
	public ExameModel() {
		// TODO Auto-generated constructor stub
	}




	public Integer getExameId() {
		return exameId;
	}




	public void setExameId(Integer exameId) {
		this.exameId = exameId;
	}




	public String getDescricao() {
		return descricao;
	}




	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}




	public Date getDatSolicitacao() {
		return datSolicitacao;
	}




	public void setDatSolicitacao(Date datSolicitacao) {
		this.datSolicitacao = datSolicitacao;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public Integer getIdBeneficiario() {
		return idBeneficiario;
	}




	public void setIdBeneficiario(Integer idBeneficiario) {
		this.idBeneficiario = idBeneficiario;
	}




	public Date getDataConclusao() {
		return dataConclusao;
	}




	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}


	


	public String getDsNotificacao() {
		return dsNotificacao;
	}




	public void setDsNotificacao(String dsNotificacao) {
		this.dsNotificacao = dsNotificacao;
	}




	@Override
	public String toString() {
		return "ExameModel [exameId=" + exameId + ", descricao=" + descricao + ", datSolicitacao=" + datSolicitacao
				+ ", status=" + status + ", idBeneficiario=" + idBeneficiario + ", dataConclusao=" + dataConclusao
				+ ", dsNotificacao=" + dsNotificacao + "]";
	}

    
	

	
	
	
	
}
