package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BMIController {
	private float height;
	private float weight;
	@FXML
	public TextField result;
	@FXML
	public TextField result2;
	public void weightInput(ActionEvent event)
	{
		String num = ((TextField)event.getSource()).getText();
		this.weight= Float.parseFloat(num);
	}
	public void heightInput(ActionEvent event)
	{
		String num = ((TextField)event.getSource()).getText();
		this.height= Float.parseFloat(num);
		this.height /= 100;
		System.out.println(this.height);
		float bmi = (this.weight)/(this.height*this.height);
		result2.setText(Float.toString(bmi));
	}
	
	
}
