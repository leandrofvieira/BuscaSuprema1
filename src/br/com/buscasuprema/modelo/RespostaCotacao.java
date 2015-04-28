package br.com.buscasuprema.modelo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RespostaCotacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idResp_Cotacao;
	@ManyToOne
	private Cotacao cotacao;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_Resposta;
	private String tipo_Frete;
	private BigDecimal valor;
	private BigDecimal valor_Total;
	private BigDecimal valor_Frete;
	private BigDecimal valor_Impostos;
	@Temporal(TemporalType.DATE)
	private Date data_Entrega;
	private String nomeFornecedor;
	private String email;
	private String email2;
	private String telefone;
	
	public RespostaCotacao() {
		// TODO Auto-generated constructor stub
	}

	public int getIdResp_Cotacao() {
		return idResp_Cotacao;
	}

	public void setIdResp_Cotacao(int idResp_Cotacao) {
		this.idResp_Cotacao = idResp_Cotacao;
	}

	public Date getData_Resposta() {
		return data_Resposta;
	}

	public void setData_Resposta(Date data_Resposta) {
		this.data_Resposta = data_Resposta;
	}

	public String getTipo_Frete() {
		return tipo_Frete;
	}

	public void setTipo_Frete(String tipo_Frete) {
		this.tipo_Frete = tipo_Frete;
	}

	public BigDecimal getValor_Total() {
		return valor_Total;
	}

	public void setValor_Total(BigDecimal valor_Total) {
		this.valor_Total = valor_Total;
	}

	public BigDecimal getValor_Frete() {
		return valor_Frete;
	}

	public void setValor_Frete(BigDecimal valor_Frete) {
		this.valor_Frete = valor_Frete;
	}

	public BigDecimal getValor_Impostos() {
		return valor_Impostos;
	}

	public void setValor_Impostos(BigDecimal valor_Impostos) {
		this.valor_Impostos = valor_Impostos;
	}

	public Date getData_Entrega() {
		return data_Entrega;
	}

	public void setData_Entrega(Date data_Entrega) {
		this.data_Entrega = data_Entrega;
	}

	public Cotacao getCotacao() {
		return cotacao;
	}

	public void seCotacao(Cotacao cotacao) {
		this.cotacao = cotacao;
	}


	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

}
