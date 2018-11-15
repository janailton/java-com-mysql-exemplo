package dbMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.*;
import java.sql.Date;


public class TableMovies {
	private Connection conn = null;
	
	public TableMovies(Connection connection) {
		conn = connection;
		
	}
	

	
	public boolean Insert( int id_movie, String mov_title, String mov_rating, int mov_list_cine_is_playing, 
			Date mov_show_time_1, Date mov_show_time_2, Date mov_show_time_3 ) {
		
		String query = "INSERT INTO tb_movies (id_movie, mov_title, mov_rating, mov_list_cine_is_playing, mov_show_time_1,mov_show_time_2, mov_show_time_3) VALUES (?, ?, ?, ?, ?, ?, ?);";
		
        try {
            PreparedStatement insertStatement = conn.prepareStatement(query);
            insertStatement.setInt(1, id_movie);
            insertStatement.setString(2, mov_title);
            insertStatement.setString(3, mov_rating);
            insertStatement.setInt(4, mov_list_cine_is_playing);
            insertStatement.setDate(5, (java.sql.Date) mov_show_time_1);
            insertStatement.setDate(6, (java.sql.Date) mov_show_time_2);
            insertStatement.setDate(7, (java.sql.Date) mov_show_time_3);
            insertStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
		
	}

}

