package com.pokepok.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Table(name="Produits")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Produits {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="IdProduit")
		private Long id;
		
		@Column(name="ref")
		private String ref;
		
		@Column(name="designation")
		private String designation;
		
		@Column(name="descriptif")
		private String descriptif;
		
		@Column(name="prixUHT")
		private String prixVenteHT;
		
		

		
		public Produits() {
			super();
		}
		
		public Produits(Long id, String ref, String designation, String descriptif, String prixVenteHT) {
			super();
			this.id = id;
			this.ref = ref;
			this.designation = designation;
			this.descriptif = descriptif;
			this.prixVenteHT = prixVenteHT;
		}


		public Produits(String ref, String designation, String descriptif, String prixVenteHT) {
			super();
			this.ref = ref;
			this.designation = designation;
			this.descriptif = descriptif;
			this.prixVenteHT = prixVenteHT;
		}

		@Override
		public String toString() {
			return "Produits [id=" + id + ", ref=" + ref + ", designation=" + designation + ", descriptif=" + descriptif
					+ ", prixVenteHT=" + prixVenteHT + "]";
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getRef() {
			return ref;
		}

		public void setRef(String ref) {
			this.ref = ref;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getDescriptif() {
			return descriptif;
		}

		public void setDescriptif(String descriptif) {
			this.descriptif = descriptif;
		}

		public String getPrixVenteHT() {
			return prixVenteHT;
		}

		public void setPrixVenteHT(String prixVenteHT) {
			this.prixVenteHT = prixVenteHT;
		}
		
		

		
		
		
		
}
