package it.polito.tdp.alien;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	AlienDictionary dizionario= new AlienDictionary();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtArea;

    @FXML
    private Button btnClear;
    
    @FXML
    void doTranslate(ActionEvent event) {
    	
    	String [] parola=txtParola.getText().split(" ");
    	if(parola.length==2) {
    		if(dizionario.getParole().containsKey(parola[0])==false) {
    		dizionario.addWord(parola[0], parola[1]);
    		}else {
    			dizionario.getParole().get(parola[0]).setTranslation(parola[1]);
    		}
    	
    			
    		
    	}
    	if(parola.length==1) {
    		for(Word w:dizionario.getParole().values()) {
    			if(w!=null && w.getAlienWord().equals(parola[0])) {
    				txtArea.setText(w.getTranslation());
    			}
    		}
    	}
    	
    	

      
    }

    @FXML
    void doClear(ActionEvent event) {
    	txtParola.clear();
    	txtArea.clear();

    }


    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
