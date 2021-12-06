package application;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class currencyController {
	public Label usd;
	public Label euro;
	public TextField amount;
	public void inputMoney(ActionEvent event)
	{
		String value = ((TextField)event.getSource()).getText();
		float amount_usd = (float) (0.0057 * (Float.parseFloat(value)));
		String amount1 = Float.toString(amount_usd);
		

		float amount_euro = (float) (0.0050 * (Float.parseFloat(value)));
		String amount2 = Float.toString(amount_usd);
		usd.setText(amount1);
		euro.setText(amount2);
	}
}
