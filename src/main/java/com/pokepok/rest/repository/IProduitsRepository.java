package com.pokepok.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokepok.rest.entity.Produits;

//connection à la DB
public interface IProduitsRepository  extends JpaRepository<Produits, Long>{// va chercher les methodes pour modifier la DB grace au extends

}
