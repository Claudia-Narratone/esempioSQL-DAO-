package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import it.polito.tdp.esempioSQL.db.BabsDAO;

public class LeggiBabs {
	
	public void run() {
	
		BabsDAO dao=new BabsDAO();
		
		List<Station> tutte=dao.listStation();
		
		for(Station s:tutte) {
			System.out.println(s.getName());
		}
		
	}
	
	public static void main(String[] args) {
		LeggiBabs babs=new LeggiBabs();
		babs.run();
	}

}
