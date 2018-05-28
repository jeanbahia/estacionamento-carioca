package br.com.estacionamento.carioca.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estacionamento.carioca.model.Vaga;
import br.com.estacionamento.carioca.repository.VagaRepository;

@Service
public class VagaService {
	
	@Autowired
	private VagaRepository vagaRepository;
	
	public Vaga find(Long id) {
		Optional<Vaga> vaga = vagaRepository.findById(id);
		return vaga.orElse(null);
	}

	public Vaga insert(Vaga vaga) {
		vaga.setId(null);
		return vagaRepository.save(vaga);
	}
}
