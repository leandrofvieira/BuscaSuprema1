package br.com.buscasuprema.dao;

import java.util.List;

import br.com.buscasuprema.modelo.Cotacao;
import br.com.buscasuprema.util.Persist;

public class CotacaoDao {
	Cotacao cotacao;
	Persist<Cotacao> persist = new Persist<Cotacao>();

	public void gravaCotacao(Cotacao cotacao) {
		persist.inserirObjeto(cotacao);
		System.out.println("Cotação inserida:" + "ID:" + cotacao.getId_Cotacao());
	}

	public void removeCotacao(Cotacao cotacao) {
		persist.removerObjeto(cotacao);
	}

	public List<Cotacao> getCotacoes() {
		return persist.consultarObjetos(Cotacao.class);
	}

	public void alteraCotação(Cotacao cotacao) throws NoSuchFieldException, SecurityException {

		persist.alterarObjeto(cotacao.getId_Cotacao(), cotacao);

	}

	public CotacaoDao() {
	}

}
