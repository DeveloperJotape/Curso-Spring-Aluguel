package br.com.alugalegal.aluguel.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.alugalegal.aluguel.entity.Pagamento;

public class PagamentoPojo {

	private Long id;
	private MultaPojo multa;
	private Double valor;
	private Date dataPagamento;

	public PagamentoPojo() {
		super();
	}

	public PagamentoPojo(Pagamento pagamento) {
		this.id = pagamento.getId();
		this.multa = new MultaPojo(pagamento.getMulta());
		this.valor = pagamento.getValor();
		this.dataPagamento = pagamento.getDataPagamento();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MultaPojo getMulta() {
		return multa;
	}

	public void setMulta(MultaPojo multa) {
		this.multa = multa;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	@JsonIgnore
	public Pagamento toEntity() {
		Pagamento pagamento = new Pagamento();
		pagamento.setId(id);
		pagamento.setMulta(multa.toEntity());
		pagamento.setValor(valor);
		pagamento.setDataPagamento(dataPagamento);
		return pagamento;
	}

}
