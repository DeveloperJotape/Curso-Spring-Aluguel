package br.com.alugalegal.aluguel.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.alugalegal.aluguel.entity.Multa;

public class MultaPojo {

	private Long id;
	private Double valor;
	private String motivo;

	public MultaPojo() {}

	public MultaPojo(Multa multa) {
		this.id = multa.getId();
		this.valor = multa.getValor();
		this.motivo = multa.getMotivo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	@JsonIgnore
	public Multa toEntity() {
		Multa multa = new Multa();
		multa.setId(id);
		multa.setValor(valor);
		multa.setMotivo(motivo);
		return multa;
	}

}
