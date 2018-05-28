package br.com.estacionamento.carioca.resource;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.estacionamento.carioca.model.Vaga;
import br.com.estacionamento.carioca.service.VagaService;

@RestController
@RequestMapping(value = "/vagas")
public class VagaController {

	@Autowired
	private VagaService vagaService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Vaga> find(@PathVariable Long id) {
		return ResponseEntity.ok().body(vagaService.find(id));
	}

	/**
	 * @param vaga
	 * @return Retorna o caminho do recurso criado como especificado na documentação dos metodos HTTP em:
	 * https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Vaga vaga) {
		
		vaga = vagaService.insert(vaga);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(vaga.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}

}
