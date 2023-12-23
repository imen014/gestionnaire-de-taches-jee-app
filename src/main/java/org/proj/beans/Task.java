package org.proj.beans;

import java.sql.Date;

public class Task {
	String domaine;
	String firstIdea;
	boolean courage;
	int nbjoursEstimee , pourcentageReussite;
	String dateDebut;
	
public Task(String domaine, String firstIdea, boolean courage, int nbjoursEstimee, int pourcentageReussite,
			String dateDebut) {
		super();
		this.domaine = domaine;
		this.firstIdea = firstIdea;
		this.courage = courage;
		this.nbjoursEstimee = nbjoursEstimee;
		this.pourcentageReussite = pourcentageReussite;
		this.dateDebut = dateDebut;
	}

	public String getValueTask() {
		return "domaine:"+ this.domaine + " firstIdea:" + this.firstIdea + " courage:" + this.courage + ""  + " nbjoursEstimee:" + this.nbjoursEstimee + " pourcentageReussite:" + this.pourcentageReussite + " dateDebut:" + this.dateDebut;
	
	}
}
	
