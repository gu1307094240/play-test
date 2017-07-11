package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class FamilyMember extends Model {

	public String appellation;
	public String name;
	public String age;
	public String employer;
	public String duties;
	public boolean isEmergencyContact;
	public String phone;
	
	@ManyToOne
    public UserBasic user;

	public FamilyMember(String appellation, String name, String age, String employer, String duties,
			boolean isEmergencyContact, String phone, UserBasic user) {
		super();
		this.appellation = appellation;
		this.name = name;
		this.age = age;
		this.employer = employer;
		this.duties = duties;
		this.isEmergencyContact = isEmergencyContact;
		this.phone = phone;
		this.user = user;
	}
}
