package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;

@Entity
public class Section {
	
	@Id
	@GeneratedValue
	int idSection;
	@Column
	String titleSection;
	@Column
	String descriptionSection;
	
	public void insertNewSection(String title, String description) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Forum");
		EntityManager em = factory.createEntityManager();
		
		Section section = new Section();
		section.setTitleSection(title);
		section.setDescriptionSection(description);
		
		em.getTransaction().begin();
		em.persist(section);
		em.getTransaction().commit();
	}
	
	public int getIdSection() {
		return idSection;
	}
	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}
	public String getTitleSection() {
		return titleSection;
	}
	public void setTitleSection(String titleSection) {
		this.titleSection = titleSection;
	}
	public String getDescriptionSection() {
		return descriptionSection;
	}
	public void setDescriptionSection(String descriptionSection) {
		this.descriptionSection = descriptionSection;
	}
}
