package br.com.buscasuprema.dao;

import java.util.List;

import br.com.buscasuprema.modelo.Item;
import br.com.buscasuprema.util.Persist;

public class ItemDao {
	Item item;
	Persist<Item> persist = new Persist<Item>();

	public void setFornecedor(Item item) {
		persist.inserirObjeto(item);
	}

	public void removeFornecedor(Item Item) {
		persist.removerObjeto(Item);

	}

	public List<Item> listaFonecedor() {
		return persist.consultarObjetos(Item.class);
	}

	public Item buscaFornecedor(int id) {
		return persist.getObjetoById(id, Item.class);
	}
}
