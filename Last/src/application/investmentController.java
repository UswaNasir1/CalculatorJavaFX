package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class investmentController {
	@FXML
	public TextField result;
	@FXML
	public TextField result2;
	private float price = 0;
	private float discount = 0;
	public void inputInvestment(ActionEvent event)
	{
		String num = ((TextField)event.getSource()).getText();
		this.price = Float.parseFloat(num);
	}
	public void inputPercentage(ActionEvent event)
	{
		String num = ((TextField)event.getSource()).getText();
		float disc = Float.parseFloat(num);
		disc /= 100;
		disc *= this.price;
		this.price += disc;
		result2.setText(Float.toString(this.price));
	}
}
