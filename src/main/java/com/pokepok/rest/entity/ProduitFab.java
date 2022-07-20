package com.pokepok.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ProduitFab")
public class ProduitFab extends Produits{
	@Column(name="NBHEURESMOY")
	private int nbHeuresMoy;
	
	
	public ProduitFab() {
		super();
	}

	public ProduitFab(int nbHeuresMoy) {
			super();
			this.nbHeuresMoy = nbHeuresMoy;
		}
	

	public ProduitFab(Long id, String ref, String designation, String descriptif, String prixVenteHT) {
		super(id, ref, designation, descriptif, prixVenteHT);
		// TODO Auto-generated constructor stub
	}

	public ProduitFab(String ref, String designation, String descriptif, String prixVenteHT) {
		super(ref, designation, descriptif, prixVenteHT);
		// TODO Auto-generated constructor stub
	}

	public int getNbHeuresMoy() {
		return nbHeuresMoy;
	}

	public void setNbHeuresMoy(int nbHeuresMoy) {
		this.nbHeuresMoy = nbHeuresMoy;
	}

	
	
	
	
}
