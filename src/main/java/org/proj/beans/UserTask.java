package org.proj.beans;

import java.util.ArrayList;


public class UserTask{
	ArrayList<Task> taskList = new ArrayList<Task>();
	Task task;
	
	public String create_task(Task task) {
		this.task = task;
		return "tache crée avec succés !";
		
	}
	
	public String ajouter_taskalalistede_task(Task task) {
		 taskList.add(task);
		 return "tache ajouté à la liste de tache avec succés !";

		
	}
	
	public String supprimer_task() {
		
	taskList.remove(task);
	return "tache supprimée avec succés !";

	}
	
	public String modifier_task(Task task_a_modifier , Task nouvelle_task) {
		
		for(int i =0; i < taskList.size(); i++) {
			Task task_courante = taskList.get(i);
			
			if(task_courante.equals(task_a_modifier)) {
				taskList.set(i, nouvelle_task);
				return "tache modifiée avec succés !";

				return;
			}
			
		}
	}
		
		public String afficher_listede_taches() {
			for(int i =0; i < taskList.size(); i++) {
				Task task = taskList.get(i);
				
				return "task value : " + i + " " +  task.getValueTask();
				
			}
			
			
		}
}
		
		
		public static void main(String[] args) {
			
			/*int nbjoursEstimee, int pourcentageReussite,
			String dateDebut, ArrayList<String> taskList)*/
	
			
			String domaine = "informatique";
			String idee1 = "test";
			boolean courage = true;
			int nb_jours = 15;
			int pourcentageReussite = 60;
			String dateDebut = "2023-11-03";
			
			
			Task task1 = new Task(domaine, idee1, courage, nb_jours, pourcentageReussite, dateDebut);
			Task task2 = new Task(domaine, idee1, courage, nb_jours, pourcentageReussite, dateDebut);

			UserTask user_task1 = new UserTask();
			user_task1.create_task(task1);
			user_task1.create_task(task2);

			user_task1.ajouter_taskalalistede_task(task1);
			user_task1.ajouter_taskalalistede_task(task2);

			user_task1.afficher_listede_taches();
			user_task1.supprimer_task();
			user_task1.afficher_listede_taches();

			
		}
}
