package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class JobExperience extends Model{

	public String workTime;
	public String companyName;
	public String duties;
	public String jobDutie;
	public String leaveReason;
	public String witnessPhone;
	
	@ManyToOne
    public UserBasic user;

	public JobExperience(String workTime, String companyName, String duties, String jobDutie, String leaveReason,
			String witnessPhone, UserBasic user) {
		super();
		this.workTime = workTime;
		this.companyName = companyName;
		this.duties = duties;
		this.jobDutie = jobDutie;
		this.leaveReason = leaveReason;
		this.witnessPhone = witnessPhone;
		this.user = user;
	}
}
