package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controladora {
	
	@FXML
	Button boton1;
	
	@FXML
	CheckBox chkfutbol;
	
	
	@FXML
	CheckBox chkbasket;
	
	@FXML
	RadioButton hombre;
	
	@FXML
	RadioButton mujer;
	
	@FXML
	ToggleGroup sexo;
	
	@FXML
	ChoiceBox<String> talla;
	
	ObservableList<String> tshirtList = FXCollections.observableArrayList("XS", "S", "M", "L", "XL", "XXL");
	
	@FXML
	public void initialize(){
		talla.setValue("M");
		talla.setItems(tshirtList);
		
		
	}
	
	public void accion(ActionEvent e){
		
		System.out.println("Se ha pulsado");
		if(chkfutbol.isSelected() == true)
			System.out.println("Te gusta el futbol");
		if(chkbasket.isSelected() == true)
			System.out.println("Te gusta el baloncesto");
		
		if(hombre.isSelected() == true)
			System.out.println("eres un " + hombre.getText());
		
		if(mujer.isSelected() == true)
			System.out.println("eres un " + mujer.getText());
		
		System.out.println("tu talla de camiseta es la  " + talla.getSelectionModel().getSelectedItem());
	}
	

}
