package gui.util;

import javafx.scene.control.TextField;

public class Constraints { // Constraints = Limitações
	//

	public static void setTextFieldInteger(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> { //aqui em addListner passa como argumento uma fubnção
			if (newValue != null && !newValue.matches("\\d*")) { // quando caixa de texto sofra alguma alteração
				txt.setText(oldValue); // se novo valor for diferente de nulo e novo valor atende a expressão regular \\d*
			} // \\d* representa numero inteiro que tem UM digito e * qualquer quantidade
		}); // não aceita modificação esse mnétodo
	}

	public static void setTextFieldMaxLength(TextField txt, int max) { // teste de tamanho máximo
		txt.textProperty().addListener((obs, oldValue, newValue) -> { //
			if (newValue != null && newValue.length() > max) { // tamannho do novo valor é maior que o maximo?
				txt.setText(oldValue);
			}
		});
	}

	public static void setTextFieldDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) { // se novo valor for diferente de nulo e novo valor atende a expressão regular \\d*([\\.]\\d*)?
				txt.setText(oldValue); // \\d*([\\.]\\d*)? = numeros Double
			}
		});
	}
}
