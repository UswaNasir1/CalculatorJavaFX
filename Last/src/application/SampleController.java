package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class SampleController{
	@FXML
	public Label result;
	private float num1;
	private float num2;
	private boolean start = true;
	private String operator = "";
	private Calculation model = new Calculation();
	@FXML
	public void Processes(ActionEvent event)
	{
		if(start)
		{
			result.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		result.setText("");
		result.setText(result.getText()+value);
		
	}
	@FXML
	public void ProcessOperators(ActionEvent event)
	{
		String value = ((Button)event.getSource()).getText();
		if(!value.equals("="))
		{
			if(!operator.isEmpty())
			
				switch (value)
				{
				case "C":
				//	System.out.println("value2");
					result.setText("");
					this.num1 = 0;
					this.num2 = 0;
					break;
				default:
					break;
				}
				
			operator = value;
			num1 = Long.parseLong(result.getText());
			result.setText(operator);
			return;
		
		}
		else {
			//System.out.println("=");
			if(operator.isEmpty())
				return;
			num2 = Long.parseLong(result.getText());
			float output = model.calculate(num1, num2, operator);
			result.setText(String.valueOf(output));
			operator = "";
			num1 = 0;
			num2 = 0;
			start = true;
		}
	
		
	}

}
