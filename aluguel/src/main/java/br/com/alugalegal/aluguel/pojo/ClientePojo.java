package br.com.alugalegal.aluguel.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.alugalegal.aluguel.entity.Cliente;

public class ClientePojo {

	private Long id;
	private String nome;
	private String telefone;
	private String email;

	public ClientePojo() {
		super();
	}

	public ClientePojo(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.telefone = cliente.getTelefone();
		this.email = cliente.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@JsonIgnore
	public Cliente toEntity() {
		Cliente cliente = new Cliente();
		cliente.setId(id);
		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		cliente.setEmail(email);
		return cliente;
	}

}
