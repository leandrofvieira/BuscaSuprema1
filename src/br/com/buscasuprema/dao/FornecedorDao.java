package br.com.buscasuprema.dao;

import java.util.List;

import br.com.buscasuprema.modelo.Cotacao;
import br.com.buscasuprema.modelo.Fornecedor;
import br.com.buscasuprema.util.Persist;

public class FornecedorDao {
	Fornecedor fornecedor;
	Persist<Fornecedor> persist = new Persist<Fornecedor>();

	public void setFornecedor(Fornecedor fornecedor) {
		persist.inserirObjeto(fornecedor);
	}

	public void removeFornecedor(Fornecedor fornecedor) {
		persist.removerObjeto(fornecedor);

	}

	
	public List<Fornecedor> listaFonecedor() {
		return persist.consultarObjetos(Fornecedor.class);
	}
	
	public Fornecedor buscaFornecedor(int id) {
		return persist.getObjetoById(id, Fornecedor.class);
	}
	
	public List<Fornecedor> listaFornecedorPorContacao (Cotacao cotacao){
		
		
		return listaFonecedor();
	}
}
