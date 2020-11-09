package br.org.rj.teresopolis.empreendedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.rj.teresopolis.empreendedor.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
