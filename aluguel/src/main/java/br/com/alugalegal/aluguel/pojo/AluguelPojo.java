package br.com.alugalegal.aluguel.pojo;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.alugalegal.aluguel.entity.Aluguel;
import br.com.alugalegal.aluguel.entity.Pagamento;

public class AluguelPojo {

	private Long id;
	private ClientePojo cliente;
	private List<VeiculoPojo> veiculos;
	private Pagamento pagamento;
	private Date dataAluguel;
	private Date dataDevolucao;

	public AluguelPojo() {
		super();
	}

	public AluguelPojo(Aluguel aluguel) {
		this.id = aluguel.getId();
		this.cliente = new ClientePojo(aluguel.getCliente());
		this.veiculos = aluguel.getVeiculos().stream().map(VeiculoPojo::new).collect(Collectors.toList());
		this.pagamento = aluguel.getPagamento();
		this.dataAluguel = aluguel.getDataAluguel();
		this.dataDevolucao = aluguel.getDataDevolucao();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ClientePojo getCliente() {
		return cliente;
	}

	public void setCliente(ClientePojo cliente) {
		this.cliente = cliente;
	}

	public List<VeiculoPojo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<VeiculoPojo> veiculos) {
		this.veiculos = veiculos;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Date getDataAluguel() {
		return dataAluguel;
	}

	public void setDataAluguel(Date dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	@JsonIgnore
	public Aluguel toEntity() {
		Aluguel aluguel = new Aluguel();
		aluguel.setId(id);
		aluguel.setCliente(cliente.toEntity());
		aluguel.setVeiculos(veiculos.stream().map(VeiculoPojo::toEntity).collect(Collectors.toList()));
		return aluguel;
	}
}
