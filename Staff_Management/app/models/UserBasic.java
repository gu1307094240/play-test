package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class UserBasic extends Model {

	public String name;
	public String sex;
	public Date birthday;
	public String nativePlace;
	public String nationalities;
	public String heightWeight;
	public String politicalStatus;
	public String health;
	public String marriage;
	public String bloodType;
	public Date dutyTime;
	public String specialty;
	public String account;
	// 职业资格证
	public String pqc;
	public String professionalTitle;
	public Date assessTime;
	public Long cardId;
	public String education;
	public String profession;
	public Date graduateTime;
	public String graduatedScool;
	public String email;
	public Date injoyJobTime;
	public String phone;
	public String address;

	public UserBasic(String name, String sex, Date birthday, String nativePlace, String nationalities,
			String heightWeight, String politicalStatus, String health, String marriage, String bloodType,
			Date dutyTime2, String specialty, String account, String pqc, String professionalTitle, Date assessTime,
			Long cardId, String education, String profession, Date graduateTime2, String graduatedScool, String email,
			Date injoyJobTime, String phone, String address) {
		super();
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.nativePlace = nativePlace;
		this.nationalities = nationalities;
		this.heightWeight = heightWeight;
		this.politicalStatus = politicalStatus;
		this.health = health;
		this.marriage = marriage;
		this.bloodType = bloodType;
		this.dutyTime = dutyTime2;
		this.specialty = specialty;
		this.account = account;
		this.pqc = pqc;
		this.professionalTitle = professionalTitle;
		this.assessTime = assessTime;
		this.cardId = cardId;
		this.education = education;
		this.profession = profession;
		this.graduateTime = graduateTime2;
		this.graduatedScool = graduatedScool;
		this.email = email;
		this.injoyJobTime = injoyJobTime;
		this.phone = phone;
		this.address = address;
	}

}
