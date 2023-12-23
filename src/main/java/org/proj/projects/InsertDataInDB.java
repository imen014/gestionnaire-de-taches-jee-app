package org.proj.projects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataInDB {
	ConnectionClass connect = new ConnectionClass();
	
	void insertData(int id, String domaine, String firstidea, boolean courage, int nb_jours_estimer, int pourcentageReussite_estimer, String dateDebut) {
		Connection connection = connect.open_connection();
		
		if(connection != null) {
			String monrequete = "INSERT INTO ideas( id,  domaine, firstidea,  courage,  nb_jours_estimer, pourcentageReussiteEstimer,  dateDebut)VALUES(?,?,?,?,?,?,?)";
			
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(monrequete);
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, domaine);
				preparedStatement.setString(3, firstidea);
				preparedStatement.setBoolean(4, courage);
				preparedStatement.setInt(5, nb_jours_estimer);
				preparedStatement.setInt(6, pourcentageReussite_estimer);
				preparedStatement.setString(7, dateDebut);
				
				int rowsAffected = preparedStatement.executeUpdate();
				if(rowsAffected  > 0) {
					 System.out.println("Data inserted successfully.");
					
				}else {
					System.out.println("Failed to insert data.");
					
				}
				
				preparedStatement.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	
	
	
}

	
	
	