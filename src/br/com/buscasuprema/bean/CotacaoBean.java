package br.com.buscasuprema.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.buscasuprema.dao.CotacaoDao;
import br.com.buscasuprema.modelo.Cotacao;


public class CotacaoBean {

	private Cotacao cotacao = new Cotacao();

	public Cotacao getCotacao() {
		return cotacao;
	}
	
	public void setCotacao(Cotacao cotacao) {
		this.cotacao = cotacao;
	}

	public List<Cotacao> getCotacoes() {
		return new CotacaoDao().getCotacoes();
	}

	public void gravar() {

		CotacaoDao dao = new CotacaoDao();

		dao.gravaCotacao(this.cotacao);

		System.out.println("Gravando Cotação!" + cotacao.getDescItem() + cotacao.getId_Cotacao());

		this.cotacao = new Cotacao();
	}
	
	public void formRespostaCotacoes(Cotacao cotacao) {
		System.out.println(cotacao.getId_Cotacao());
		System.out.println(cotacao.getCategoriaFornecedor());
	}
	
	
	

}
