package br.com.buscasuprema.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFornecedor;
	private String nomeFornecedor;
	private String email;
	private String email_2;
	private String telefone;
	private String categoriaFornecedor;

	public long getCodFornecedor() {
		return idFornecedor;
	}

	public void setCodFornecedor(int codFornecedor) {
		this.idFornecedor = codFornecedor;
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

	public String getEmail_2() {
		return email_2;
	}

	public void setEmail_2(String email_2) {
		this.email_2 = email_2;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCategoriaFornecedor() {
		return categoriaFornecedor;
	}

	public void setCategoriaFornecedor(String categoriaFornecedor) {
		this.categoriaFornecedor = categoriaFornecedor;
	}

}
