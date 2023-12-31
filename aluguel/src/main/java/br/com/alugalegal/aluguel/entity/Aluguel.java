package br.com.alugalegal.aluguel.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluguel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Cliente cliente;
	private List<Veiculo> veiculos;
	private Pagamento pagamento;
	private Date dataAluguel;
	private Date dataDevolucao;

	public Aluguel() {
		super();
	}

	public Aluguel(Long id, Cliente cliente, List<Veiculo> veiculos, Pagamento pagamento, Date dataAluguel,
			Date dataDevolucao) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.veiculos = veiculos;
		this.pagamento = pagamento;
		this.dataAluguel = dataAluguel;
		this.dataDevolucao = dataDevolucao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
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

}
