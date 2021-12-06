package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
public class discountController {
	@FXML
	public TextField result;
	@FXML
	public TextField result2;
	private float price = 0;
	private float discount = 0;
	public void inputPrice(ActionEvent event)
	{
		String num = ((TextField)event.getSource()).getText();
		this.price = Float.parseFloat(num);
	}
	public void inputDiscount(ActionEvent event)
	{
		String num = ((TextField)event.getSource()).getText();
		float disc = Float.parseFloat(num);
		disc /= 100;
		//System.out.println(disc);
		disc *= this.price;
	//	System.out.println(disc);
		this.price -= disc;
		result2.setText(Float.toString(this.price));
	}


}
