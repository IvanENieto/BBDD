package application;

import java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TestConexion {

	private String bd;
	private String url= "jdbc:oracle:thin:@localhost:1521:XE";
	private String usr = "SYSTEM";
	private String pwd = "Manzana111";
	private static Connection conexion;
	

	public TestConexion()  {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, usr, pwd);
			
			if(!conexion.isClosed()) {
				System.out.println("Conexión establecida");
				//conexion.close();
			}
			else
				System.out.println("Fallo en Conexión");	
			

		}catch (Exception e) {
			System.out.println("ERROR en conexión con ORACLE");	
			e.printStackTrace();
		}
		
	}
	
		
	public ObservableList<Armario> Consulta() {
		
		 final ObservableList<Armario> data = FXCollections.observableArrayList();
		
		
		
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM PRUEBA.ARMARIO" );
			while(rset.next()) {
				data.add(new Armario(rset.getString(1),rset.getString(2)));
				
				
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		return data;
		
	}
	
	public ObservableList<Armario> Consultaarmario(String e) {
		
		 final ObservableList<Armario> data = FXCollections.observableArrayList();
		
		
		
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM PRUEBA.ARMARIO WHERE AM " );
			while(rset.next()) {
				data.add(new Armario(rset.getString(1),rset.getString(2)));
				
				
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		return data;
		
	}
	
	public ObservableList<Armario> Consultatamaño() {
		
		 final ObservableList<Armario> data = FXCollections.observableArrayList();
		
		
		
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM PRUEBA.ARMARIO" );
			while(rset.next()) {
				data.add(new Armario(rset.getString(1),rset.getString(2)));
				
				
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		return data;
		
	}
	
	

}
