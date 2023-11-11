package br.com.alugalegal.aluguel.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alugalegal.aluguel.entity.Multa;
import br.com.alugalegal.aluguel.pojo.MultaPojo;
import br.com.alugalegal.aluguel.repository.MultaRepository;

@RestController
@RequestMapping("/multas")
public class MultaController {

	private final MultaRepository multaRepository;
	
	public MultaController(MultaRepository multaRepository) {
		this.multaRepository = multaRepository;
	}	
	
	@GetMapping
	public List<MultaPojo> getAll() {
		List<Multa> listMulta = multaRepository.findAll();
		List<MultaPojo> listMultaPojos = new ArrayList<>();
		for (Multa multa: listMulta) {
			listMultaPojos.add(new MultaPojo(multa));
		}
		return listMultaPojos;
	}
	
	@GetMapping(path = "/{id}")
	public MultaPojo get(@PathVariable Long id) {
		Optional<Multa> multaOptional = multaRepository.findById(id);
		if (multaOptional.isPresent()) {
			return new MultaPojo(multaOptional.get());
		}
		return new MultaPojo();
	}
	
	@PostMapping
	public MultaPojo create(@RequestBody MultaPojo multaPojo) {
		return new MultaPojo(multaRepository.save(multaPojo.toEntity()));
	}
	
	@PutMapping
	public MultaPojo update(@RequestBody MultaPojo multaPojo) {
		return new MultaPojo(multaRepository.save(multaPojo.toEntity()));
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Long id) {
		multaRepository.deleteById(id);
	}
	
}
