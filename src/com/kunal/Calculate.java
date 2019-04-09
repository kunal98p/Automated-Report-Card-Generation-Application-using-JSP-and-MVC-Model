package com.kunal;

public class Calculate {
	int grade;
	Float percentage;
	

	public String getGrade(int grade) {
		
		if(grade>=90) {
			return "AA";
		}
		else if(grade>=80 && grade<90) {
			return "AB";
		}
		else if(grade>=70 && grade<80) {
			return "BB";
		}
		else if(grade>=60 && grade<70) {
			return "BC";
		}
		else return "FF";
	
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Float getPercentage(int aj, int se, int wt, int dcdr) {
		
		return  (float) (((aj+se+wt+dcdr)*100)/400);
	}

}
