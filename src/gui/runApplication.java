package gui;

import dbMySQL.TableMovies;
import dbMySQL.db;

import java.time.LocalDateTime;
import java.sql.Date;

public class runApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		db mysql = new db();
		TableMovies tbmovies = new TableMovies(mysql.getConnection());
		Date date = new Date(0);
		
		tbmovies.Insert(2, "Lion King", "ok", 1, date, date, date);
		
		mainWindow m = new mainWindow();

	}

}
