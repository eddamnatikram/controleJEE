package EddamnatiIkram.Controle.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="employee")
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String nom;
	 private String prenom;
	@Temporal(TemporalType.DATE)
	 private Date dateNaissance;
	 private String photo;
	 @ManyToOne
	  private Service service;
	 @OneToMany 
	 @JoinTable(name = "Chef_Emplyee",
     joinColumns = @JoinColumn(name = "Chef_id"),
     inverseJoinColumns = @JoinColumn(name = "employee_id"))	
	 private List<Employe> employees;
	 

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	 
	

}
