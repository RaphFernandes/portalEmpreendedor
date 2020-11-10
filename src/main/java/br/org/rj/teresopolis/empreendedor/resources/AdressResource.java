package br.org.rj.teresopolis.empreendedor.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.rj.teresopolis.empreendedor.entities.Adress;
import br.org.rj.teresopolis.empreendedor.services.AdressService;

@RestController
@RequestMapping(value = "/Adresses")
public class AdressResource {
	
	@Autowired
	private AdressService service;
	
	@GetMapping
	public ResponseEntity<List<Adress>> findAll(){
		List<Adress> listAll = service.findAll();
		return ResponseEntity.ok().body(listAll);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Adress> findById(@PathVariable Long id){
		Adress obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
