package org.proj.projects;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.proj.beans.Task;
import org.proj.beans.UserTask;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		this.getServletContext().getRequestDispatcher("/WEB-INF/first.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id = 0;
	String domaine = request.getParameter("domain_choice");
	String idee1 = request.getParameter("FirstIdeaInfo");
	boolean courage = Boolean.parseBoolean(request.getParameter("courage"));
	int  nbjoursEstimee = Integer.parseInt(request.getParameter("estimPeriod"));
	int pourcentageReussite = Integer.parseInt(request.getParameter("estimPoucentageReussite"));
	String dateDebut = request.getParameter("dateDebut");
	InsertDataInDB insertion1 = new  InsertDataInDB();
	insertion1.insertData(id, domaine, idee1, courage,nbjoursEstimee, pourcentageReussite, dateDebut );

	//Task task1 = new Task(domaine, idee1,courage, nbjoursEstimee, pourcentageReussite,  dateDebut );	
	//String task_formater = task1.getValueTask();
	//request.setAttribute("task_formater", task_formater);
	//UserTask gerer_task1 = new UserTask();
	//gerer_task1.create_task(task1);
	//PrintWriter out = response.getWriter();
	//out.println(gerer_task1.afficher_listede_taches());
	
	
	//gerer_task1.supprimer_task();
	this.getServletContext().getRequestDispatcher("/WEB-INF/user_confirmation_data.jsp").forward(request, response);

	}

}
