package br.com.buscasuprema.dao;

import java.util.List;

import br.com.buscasuprema.modelo.RespostaCotacao;
import br.com.buscasuprema.util.Persist;

public class RespostaCotacaoDao {
	RespostaCotacao respCotacao;
	Persist<RespostaCotacao> persist = new Persist<RespostaCotacao>();

	public void gravaRespostaCotacao(RespostaCotacao respCotacao) {
		persist.inserirObjeto(respCotacao);

	}

	public void removeRespostaCotacao(RespostaCotacao respostaCotacao) {
		persist.removerObjeto(respostaCotacao);
	}

	public List<RespostaCotacao> getRespostaCotacao() {
		return persist.consultarObjetos(RespostaCotacao.class);

	}

	public void alteraRespostaCotacao(RespostaCotacao respostaCotacao) {
		try {
			persist.alterarObjeto(respostaCotacao.getCotacao().getId_Cotacao(), respostaCotacao);
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public RespostaCotacaoDao() {

	}

}
