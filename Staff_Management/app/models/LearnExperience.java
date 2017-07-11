package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class LearnExperience extends Model {

	public String learnTime;
	public String schoolName;
	public String professionName;
	public String performance;
	public String witness;
	
	@ManyToOne
    public UserBasic user;
	
	public LearnExperience(UserBasic user, String learnTime, String schoolName, String professionName, String performance,
			String witness) {
		super();
		this.user = user;
		this.learnTime = learnTime;
		this.schoolName = schoolName;
		this.professionName = professionName;
		this.performance = performance;
		this.witness = witness;
	}
}
