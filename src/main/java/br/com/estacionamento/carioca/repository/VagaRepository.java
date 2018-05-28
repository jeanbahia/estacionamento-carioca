package br.com.estacionamento.carioca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estacionamento.carioca.model.Vaga;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long>{
	Vaga save(Vaga vaga);
}
