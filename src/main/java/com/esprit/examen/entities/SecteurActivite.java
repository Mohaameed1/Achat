package com.esprit.examen.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ALLArgsConstructor;
@Entity

@AllArgsConstructor

public class SecteurActivite implements Serializable{
	
	public SecteurActivite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdSecteurActivite() {
		return idSecteurActivite;
	}
	public void setIdSecteurActivite(Long idSecteurActivite) {
		this.idSecteurActivite = idSecteurActivite;
	}
	public String getCodeSecteurActivite() {
		return codeSecteurActivite;
	}
	public void setCodeSecteurActivite(String codeSecteurActivite) {
		this.codeSecteurActivite = codeSecteurActivite;
	}
	public String getLibelleSecteurActivite() {
		return libelleSecteurActivite;
	}
	public void setLibelleSecteurActivite(String libelleSecteurActivite) {
		this.libelleSecteurActivite = libelleSecteurActivite;
	}
	public Set<Fournisseur> getFournisseurs() {
		return fournisseurs;
	}
	public void setFournisseurs(Set<Fournisseur> fournisseurs) {
		this.fournisseurs = fournisseurs;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSecteurActivite;
	private String codeSecteurActivite;
	private String libelleSecteurActivite;
	@ManyToMany(mappedBy="secteurActivites")
	@JsonIgnore
	private Set<Fournisseur> fournisseurs;
}
