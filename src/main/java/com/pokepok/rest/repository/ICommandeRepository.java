package com.pokepok.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokepok.rest.entity.Commande;

public interface ICommandeRepository extends JpaRepository<Commande, Long>{

//pour faire des ajouts ou suppressions
}
