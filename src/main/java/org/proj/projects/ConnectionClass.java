package org.proj.projects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClass {

	Connection connection;
	Statement statement;
	ResultSet resultset;
	PreparedStatement preparedStatement;
	
	String username="root";
	String password="root";
	String db_name="firstidea";
	
	public void open_connection() {
		try {
			//charger le pilote JDBC pour mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//etablir la connexion à la base de données
			connection = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name , username , password);
			
			if(connection != null) {
				System.out.println("connexion établie avec succés !");
			}
				
		}catch(ClassNotFoundException e) {
			System.out.println("Driver JDBC introuvable !" + e.getMessage());
			
		}catch(SQLException e) {
			System.out.println("erreur de connection à la base de données " + e.getMessage());
			
		}
	
}
	
	public void closeConnection() {
		try {
			if(connection != null && !connection.isClosed()) {
				connection.close();
				System.out.println("connexion fermée avec succées !");
				
			}
			
		}catch(SQLException e) {
			System.out.println("erreur lors de dermeture de connection  " + e.getMessage());
			
		}
	}
}

