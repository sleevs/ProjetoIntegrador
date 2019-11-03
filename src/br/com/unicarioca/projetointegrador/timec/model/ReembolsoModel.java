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
@Table(name = "reembolso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReembolsoModel.findAll", query = "SELECT r FROM ReembolsoModel r")})
public class ReembolsoModel implements Serializable{

	/*reembolso_id
nm_beneficiario
dt_data
sn_status
ds_motivo
ds_email
ds_logradouro
data_nascimento
telefone
ds_nome
ds_sexo
	 * */
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "reembolso_id")
	private Integer reembolsoId ;
    @Column(name = "nm_beneficiario")
	private Integer nmBeneficiario ;
    @Column(name = "dt_data")
    @Temporal(TemporalType.DATE)
	private Date dataReembolso ;
    @Size(max = 45)
    @Column(name = "sn_status")
	private String status ;
    @Size(max = 45)
    @Column(name = "ds_motivo")
	private String motivo ;
    @Size(max = 45)
    @Column(name = "ds_email")
	private String email ;
    @Size(max = 45)
    @Column(name = "ds_logradouro")
	private String logradouro ;
    @Size(max = 45)
    @Column(name = "telefone")
	private String telefone ;
	
	
	
	public ReembolsoModel() {
		// TODO Auto-generated constructor stub
	}



	public Integer getReembolsoId() {
		return reembolsoId;
	}



	public void setReembolsoId(Integer reembolsoId) {
		this.reembolsoId = reembolsoId;
	}



	public Integer getNomeBeneficiario() {
		return nmBeneficiario;
	}



	public void setNomeBeneficiario(Integer nomeBeneficiario) {
		this.nmBeneficiario = nomeBeneficiario;
	}



	public Date getDataReembolso() {
		return dataReembolso;
	}



	public void setDataReembolso(Date dataReembolso) {
		this.dataReembolso = dataReembolso;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getMotivo() {
		return motivo;
	}



	public void setMotivo(String motivo) {
		this.motivo = motivo;
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



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	@Override
	public String toString() {
		return " [ N�mero da Solicita��o de Reembolso :" + reembolsoId + ", N�mero do Benefici�rio :" + nmBeneficiario + ", Data da Solicita��o :="
				+ dataReembolso + ", Status da Solicita��o :" + status + ", Motivo :" + motivo + ", Email Solicitante :" + email + ", Endere�o :"
				+ logradouro + ", Telefone :" + telefone + "]";
	}



	
	
	
	

}
