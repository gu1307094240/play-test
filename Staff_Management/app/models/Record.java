package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Record extends Model{

	public String applyPosition;
	public Date applyDate;
	
	public Record(String applyPosition, Date applyDate) {
		super();
		this.applyPosition = applyPosition;
		this.applyDate = applyDate;
	}
}
