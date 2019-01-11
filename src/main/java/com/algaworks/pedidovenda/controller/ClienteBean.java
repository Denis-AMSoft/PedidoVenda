package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.algaworks.pedidovenda.model.Cliente;

@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String telefone;
	private Cliente selectedCliente = new Cliente();
	private List<Cliente> clientes = new ArrayList<>();

	public void incluirCliente() {

		selectedCliente.setNome(nome);
		selectedCliente.setTelefone(telefone);

		clientes.add(selectedCliente);
		
		

	}

	

	public void excluirCliente() {
		
		clientes.remove(selectedCliente);
	}
	
	

	public List<Cliente> getClientes() {
		return clientes;
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



}
