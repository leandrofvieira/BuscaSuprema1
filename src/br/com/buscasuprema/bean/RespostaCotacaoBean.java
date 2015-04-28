package br.com.buscasuprema.bean;

import java.math.BigDecimal;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.buscasuprema.dao.RespostaCotacaoDao;
import br.com.buscasuprema.modelo.RespostaCotacao;

@ManagedBean
public class RespostaCotacaoBean {
	private RespostaCotacao respostaCotacao = new RespostaCotacao();

	public RespostaCotacao getRespostaCotacao() {
		return respostaCotacao;
	}

	public List<RespostaCotacao> getRespostaCotacoes() {
		return new RespostaCotacaoDao().getRespostaCotacao();
	}

	public void grava() {

		RespostaCotacaoDao dao = new RespostaCotacaoDao();
		long longValue = respostaCotacao.getValor_Frete().longValue() + respostaCotacao.getValor_Impostos().longValue();
		BigDecimal valorTotal = new BigDecimal(longValue);
		respostaCotacao.setValor_Total(valorTotal);
		dao.gravaRespostaCotacao(respostaCotacao);

		System.out.println("Gravando Resposta de Cotação!" + respostaCotacao.getIdResp_Cotacao());

		this.respostaCotacao = new RespostaCotacao();
	}
}
