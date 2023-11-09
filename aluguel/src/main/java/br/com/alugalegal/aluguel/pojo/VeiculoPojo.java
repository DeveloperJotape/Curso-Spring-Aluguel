package br.com.alugalegal.aluguel.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.alugalegal.aluguel.entity.Veiculo;

public class VeiculoPojo {

	private Long id;
	private String modelo;
	private Integer ano;
	private String placa;
	private String status;

	public VeiculoPojo() {
		super();
	}

	public VeiculoPojo(Veiculo veiculo) {
		this.id = veiculo.getId();
		this.modelo = veiculo.getModelo();
		this.ano = veiculo.getAno();
		this.placa = veiculo.getPlaca();
		this.status = veiculo.getStatus();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@JsonIgnore
	public Veiculo toEntity() {
		Veiculo veiculo = new Veiculo();
		veiculo.setId(id);
		veiculo.setModelo(modelo);
		veiculo.setAno(ano);
		veiculo.setPlaca(placa);
		veiculo.setStatus(status);
		return veiculo;
	}

}
