package br.org.rj.teresopolis.empreendedor.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.org.rj.teresopolis.empreendedor.entities.Adress;
import br.org.rj.teresopolis.empreendedor.entities.Company;
import br.org.rj.teresopolis.empreendedor.entities.User;
import br.org.rj.teresopolis.empreendedor.repositories.AdressRepository;
import br.org.rj.teresopolis.empreendedor.repositories.CompanyRepository;
import br.org.rj.teresopolis.empreendedor.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private AdressRepository adressRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		Adress a1 = new Adress(null, "Rua do usuario", "numero 100", "casa", "Meu bairro", "259500000", "Minha cidade", "UF", "BR");
		Adress a2 = new Adress(null, "Rua do usuario2", "numero 200", "predio", "Meu bairro2", "259500000", "Minha cidade2", "UF", "BR");
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456", a1);
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456", a1);
		
		Company c1 = new Company(null, "BusinessmanName", "CompanyName", "12345678910111", LocalDate.parse("2020-11-10"), "123456789", "123456789", "21999999999", a1 , u1);
		Company c2 = new Company(null, "BusinessmanName", "CompanyName", "12345678910111", LocalDate.parse("2020-11-10"), "123456789", "123456789", "21999999999", a2, u2);
		Company c3 = new Company(null, "BusinessmanName", "CompanyName", "12345678910111", LocalDate.parse("2020-11-10"), "123456789", "123456789", "21999999999", a1, u1);
		
		adressRepository.saveAll(Arrays.asList(a1,a2));
		userRepository.saveAll(Arrays.asList(u1, u2));
		companyRepository.saveAll(Arrays.asList(c1,c2,c3));
		
	}
	
	
}
