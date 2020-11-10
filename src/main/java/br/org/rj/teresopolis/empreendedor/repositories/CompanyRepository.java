package br.org.rj.teresopolis.empreendedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.rj.teresopolis.empreendedor.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
