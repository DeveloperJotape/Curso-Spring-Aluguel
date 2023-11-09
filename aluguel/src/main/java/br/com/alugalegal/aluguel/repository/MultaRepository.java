package br.com.alugalegal.aluguel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alugalegal.aluguel.entity.Multa;

@Repository
public interface MultaRepository extends JpaRepository<Multa, Long>{

}
