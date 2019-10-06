package gui.util;

import javafx.scene.control.TextField;

public class Constraints { // Constraints = Limita��es
	//

	public static void setTextFieldInteger(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> { //aqui em addListner passa como argumento uma fubn��o
			if (newValue != null && !newValue.matches("\\d*")) { // quando caixa de texto sofra alguma altera��o
				txt.setText(oldValue); // se novo valor for diferente de nulo e novo valor atende a express�o regular \\d*
			} // \\d* representa numero inteiro que tem UM digito e * qualquer quantidade
		}); // n�o aceita modifica��o esse mn�todo
	}

	public static void setTextFieldMaxLength(TextField txt, int max) { // teste de tamanho m�ximo
		txt.textProperty().addListener((obs, oldValue, newValue) -> { //
			if (newValue != null && newValue.length() > max) { // tamannho do novo valor � maior que o maximo?
				txt.setText(oldValue);
			}
		});
	}

	public static void setTextFieldDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) { // se novo valor for diferente de nulo e novo valor atende a express�o regular \\d*([\\.]\\d*)?
				txt.setText(oldValue); // \\d*([\\.]\\d*)? = numeros Double
			}
		});
	}
}
