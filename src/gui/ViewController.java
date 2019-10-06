package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable { // implementa a interface initialazable para utilizar o public void initialize

	@FXML
	private TextField txtNumber1; //o campo o texto no SceneBiulder
	@FXML
	private TextField txtNumber2; //o campo o texto no SceneBiulder
	
	@FXML
	private Label labelResult;//o campo o texto no SceneBiulder
	
	
	@FXML
	private Button btSum; //o campo botão no SceneBiulder
	
	@FXML
	public void onBtSumAction() {
		try {
			
				Locale.setDefault(Locale.US);
				double number1 = Double.parseDouble(txtNumber1.getText()); // passa o atributo numero de texto para double
				double number2 = Double.parseDouble(txtNumber2.getText());// passa o atributo numero de texto para double
				double sum = number1 + number2; // soma os atributos recebdos e convertidos
				labelResult.setText(String.format("%.2f", sum)); // mostra o valor da soma setando uym texto no valor lebelresult
				//joga para o SceneBiulder o valor da soma setando em texto o resultado
		}
		catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse Error", e.getMessage(), AlertType.ERROR); // captura o erro e mostra em um showAlert
			//titulo, cabeçalo, msg...
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) { // url =  caminho da tela
		Constraints.setTextFieldDouble(txtNumber1); // Constraints é a classe nova criada, chamada quando o contolador é chamado
		Constraints.setTextFieldDouble(txtNumber2); // set que somente numeros double podem ser escritos, nem letras
		Constraints.setTextFieldMaxLength(txtNumber1, 12); // aqui seta no máximo 12 campos
		Constraints.setTextFieldMaxLength(txtNumber2, 12); // aqui seta no máximo 12 campos
		
	}
	

}
