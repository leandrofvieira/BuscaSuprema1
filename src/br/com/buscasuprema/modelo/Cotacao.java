package br.com.buscasuprema.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cotacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Cotacao;
	private BigDecimal quantidade;
	@Temporal(TemporalType.DATE)
	private Calendar data_Inicial = Calendar.getInstance();
	@Temporal(TemporalType.DATE)
	private Calendar data_Final;
	private String descItem;
	private String unidadeMedida;
	private String categoriaFornecedor;

	public Calendar getData_Inicial() {
		return data_Inicial;
	}

	public void setData_Inicial(Calendar data_Inicial) {
		this.data_Inicial = data_Inicial;
	}

	public Calendar getData_Final() {
		return data_Final;
	}

	public void setData_Final(Calendar data_Final) {
		this.data_Final = data_Final;
	}

	public String getCategoriaFornecedor() {
		return categoriaFornecedor;
	}

	public void setCategoriaFornecedor(String categoriaFornecedor) {
		this.categoriaFornecedor = categoriaFornecedor;
	}

	public int getId_Cotacao() {
		return id_Cotacao;
	}

	public void setId_Cotacao(int id_Cotacao) {
		this.id_Cotacao = id_Cotacao;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getDescItem() {
		return descItem;
	}

	public void setDescItem(String descItem) {
		this.descItem = descItem;
	}

}
