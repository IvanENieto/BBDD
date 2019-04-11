package application;


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
import javafx.scene.control.cell.PropertyValueFactory;

public class Controladora {

   @FXML
   private Button Introducir;
   
   @FXML
   private Button Buscar;

   @FXML
   private TextArea Armario;
   
   @FXML
   private TextArea Tamaño;
   
   @FXML
   private ChoiceBox Filtro;
   
   @FXML
	private TableView<Armario> Tabla;

	@FXML
	private TableColumn<Armario,String> Amariocol;

	@FXML
	private TableColumn<Armario,String> Tamañocol;
	
	private final ObservableList<Armario> data = FXCollections.observableArrayList();
	ObservableList<String> filtroarmario = FXCollections.observableArrayList("Armario", "Tamaño", "Sin filtros");

  
   public void filtrar(ActionEvent event) {
	   
   }
   
   public void introducir(ActionEvent event) {
	   
   }
   
   public void buscar(ActionEvent event) {
	      TestConexion conexionBBDD = new TestConexion();
	 
		
		if(Filtro.getValue().equals("Sin filtros")) {
		conexionBBDD.Consulta();	
		}else if(Filtro.getValue().equals("Amario")) {
			
		}else if(Filtro.getValue().equals("Tamaño")) {
			
		}
			
	
	   
   }
   
   
   @FXML
   public void initialize() {
	   
	   Filtro.setValue("Sin filtros");
	   Filtro.setItems(filtroarmario);
		
		Amariocol.setCellValueFactory(new PropertyValueFactory<Armario,String>("Amario"));
		Tamañocol.setCellValueFactory(new PropertyValueFactory<Armario,String>("Tamaño"));

   }

}
