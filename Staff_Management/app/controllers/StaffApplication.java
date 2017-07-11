package controllers;

import play.*;
import play.data.validation.Required;
import play.mvc.*;

import java.util.*;

import models.*;

public class StaffApplication extends Controller {

	public static void index() {
		render();
	}

	public static void postInfo(@Required String applyPosition, @Required Date applyDate, @Required String name,
			@Required String sex, @Required Date birthday, @Required String nativePlace, @Required String nationalities,
			@Required String heightWeight, @Required String politicalStatus, @Required String health,
			@Required String marriage, @Required String bloodType, @Required Date dutyTime,
			@Required String specialty, @Required String account, @Required String pqc,
			@Required String professionalTitle, @Required Date assessTime, @Required Long cardId,
			@Required String education, @Required String profession, @Required Date graduateTime,
			@Required String graduatedScool, @Required String email, @Required Date injoyJobTime,
			@Required String phone, @Required String address) {
		if (validation.hasErrors()) {
			render("StaffApplication/index.html");
		}
		Record record = new Record(applyPosition, applyDate);
		record.save();
		new UserBasic(name, sex, birthday, nativePlace, nationalities, heightWeight, politicalStatus, health, marriage,
				bloodType, dutyTime, specialty, account, pqc, professionalTitle, assessTime, cardId, education,
				profession, graduateTime, graduatedScool, email, injoyJobTime, phone, address).save();
		flash.success("提交成功 %s", applyPosition);
		index();
	}
	
	public static void postLearnExperience(@Required String learnTime, @Required String schoolName, @Required String professionName, @Required String performance, @Required String witness){
		System.out.println("learnTime"+learnTime);
		if (validation.hasErrors()) {
			render("StaffApplication/index.html");
		}
		new LearnExperience(null, learnTime, schoolName, professionName, performance, witness).save();
		flash.success("提交成功 %s", schoolName);
		index();
	}
	
	public static void postJobExperience(@Required String workTime, @Required String companyName, @Required String duties, @Required String jobDutie, @Required String leaveReason, @Required String witnessPhone){
		if (validation.hasErrors()) {
			render("StaffApplication/index.html");
		}
		new JobExperience(workTime, companyName, duties, jobDutie, leaveReason, witnessPhone, null).save();
		flash.success("提交成功 %s", companyName);
		index();
	}
	
	public static void postFamilyExperience(@Required String appellation, @Required String name, @Required String age, @Required String employer, @Required String duties, @Required boolean isEmergencyContact, @Required String phone){
		if (validation.hasErrors()) {
			render("StaffApplication/index.html");
		}
		new FamilyMember(appellation, name, age, employer, duties, isEmergencyContact, phone, null).save();
		flash.success("提交成功 %s", appellation);
		index();
	}
}