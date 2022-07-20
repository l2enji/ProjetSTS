package com.pokepok.rest.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ProduitAppro")
public class ProduitAppro extends Produits{
	@Column(name="PRIXACHATUHT")
	private int prixAchatUHT;

	@ManyToMany(fetch=FetchType.LAZY, mappedBy="produitAppro")
	private List<Fournisseur> fournisseur = new ArrayList<>();
	
	
	public ProduitAppro() {
		super();
	}

	public ProduitAppro(int prixAchatUHT) {
		super();
		this.prixAchatUHT = prixAchatUHT;
	}

	public ProduitAppro(Long id, String ref, String designation, String descriptif, String prixVenteHT) {
		super(id, ref, designation, descriptif, prixVenteHT);
		// TODO Auto-generated constructor stub
	}

	public ProduitAppro(String ref, String designation, String descriptif, String prixVenteHT) {
		super(ref, designation, descriptif, prixVenteHT);
		// TODO Auto-generated constructor stub
	}

	public int getPrixAchatUHT() {
		return prixAchatUHT;
	}

	public void setPrixAchatUHT(int prixAchatUHT) {
		this.prixAchatUHT = prixAchatUHT;
	}
	
	
}
