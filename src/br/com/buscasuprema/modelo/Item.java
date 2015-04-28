package br.com.buscasuprema.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Item {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Item;
	private String descItem;
	private String unidadeMedida;
	private String categoriaItem;
	
	public int getId_Item() {
		return id_Item;
	}
	public void setId_Item(int id_Item) {
		this.id_Item = id_Item;
	}

	public String getDesc_2() {
		return descItem;
	}
	public void setDesc_2(String desc_2) {
		this.descItem = desc_2;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public String getCategoria() {
		return categoriaItem;
	}
	public void setCategoria(String categoria) {
		this.categoriaItem = categoria;
	}

}
