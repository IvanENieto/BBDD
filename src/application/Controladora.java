package application;


import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controladora {

   @FXML
   private Button Introducir;
   
   @FXML
   private Button Buscar;

   @FXML
   private TextField Armario;
   
   @FXML
   private TextField Tamano;
   
   @FXML
   private TextField Filtro;
   
   @FXML
	private TableView<Armario> Tabla;

	@FXML
	private TableColumn<Armario,String> Amariocol;

	@FXML
	private TableColumn<Armario,String> Tamanocol;
	
	private ObservableList<Armario> data = FXCollections.observableArrayList();
	
	TestConexion conexionBBDD = new TestConexion();
  
   
   
   public void introducir(ActionEvent event) throws SQLException {	
	  
	   conexionBBDD.InsertArmario(Armario.getText(),Tamano.getText());
	   data = conexionBBDD.Consulta();
	   Tabla.setItems(data);
	  
		Amariocol.setCellValueFactory(new PropertyValueFactory<Armario,String>("Numero"));
		Tamanocol.setCellValueFactory(new PropertyValueFactory<Armario,String>("Tamaño"));
	   
	   
	   
   }
   
   public void buscar(ActionEvent event) {
	      
	 
		
		if(Filtro.getText().equals("Sin filtros")) {
			
		conexionBBDD.Consulta();
		
		data = conexionBBDD.Consulta();
		 Tabla.setItems(data);
		  
			Amariocol.setCellValueFactory(new PropertyValueFactory<Armario,String>("Numero"));
			Tamanocol.setCellValueFactory(new PropertyValueFactory<Armario,String>("Tamaño"));
		
		
		
		}else if(Filtro.getText().equals("Armario")) {
			data = conexionBBDD.Consultaarmario(Armario.getText());
			 Tabla.setItems(data);
			  
				Amariocol.setCellValueFactory(new PropertyValueFactory<Armario,String>("Numero"));
				Tamanocol.setCellValueFactory(new PropertyValueFactory<Armario,String>("Tamaño"));
			
			
		}else if(Filtro.getText().equals("Tamaño")) {
			data = conexionBBDD.Consultatamaño(Tamano.getText());
			 Tabla.setItems(data);
			  
				Amariocol.setCellValueFactory(new PropertyValueFactory<Armario,String>("Numero"));
				Tamanocol.setCellValueFactory(new PropertyValueFactory<Armario,String>("Tamaño"));
			
		}
			
	
	   
   }
   
   
   @FXML
   public void initialize() {
	   data = conexionBBDD.Consulta();
	   Tabla.setItems(data);
	  
		Amariocol.setCellValueFactory(new PropertyValueFactory<Armario,String>("Numero"));
		Tamanocol.setCellValueFactory(new PropertyValueFactory<Armario,String>("Tamaño"));

   }

}
