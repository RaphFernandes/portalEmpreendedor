package br.org.rj.teresopolis.empreendedor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.rj.teresopolis.empreendedor.entities.Adress;
import br.org.rj.teresopolis.empreendedor.repositories.AdressRepository;

@Service
public class AdressService {

	@Autowired
	private AdressRepository repository;
	
	public List<Adress> findAll(){
		return repository.findAll();
	}
	
	public Adress findById(Long id) {
		Optional<Adress> obj = repository.findById(id);
		return obj.get();
	}
}
