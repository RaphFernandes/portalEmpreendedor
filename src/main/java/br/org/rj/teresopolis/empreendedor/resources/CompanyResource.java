package br.org.rj.teresopolis.empreendedor.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.rj.teresopolis.empreendedor.entities.Company;
import br.org.rj.teresopolis.empreendedor.services.CompanyService;

@RestController
@RequestMapping(value = "/Companies")
public class CompanyResource {
	
	@Autowired
	private CompanyService service;
	
	@GetMapping
	public ResponseEntity<List<Company>> findAll(){
		List<Company> listAll = service.findAll();
		return ResponseEntity.ok().body(listAll);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Company> findById(@PathVariable Long id){
		Company obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
