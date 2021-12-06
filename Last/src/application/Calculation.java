package application;

import javafx.scene.control.Label;
public class Calculation {
	public float calculate(float first_num, float second_num, String operator)
	{
		switch(operator)
		{
			case "+":
				return first_num + second_num;
			case "-":
				return first_num - second_num;
			case "*":
				return first_num * second_num;
			case "/":
				if(first_num == 0)
				{
					return 0;
				}
				return first_num/second_num;
			default:
				return 0;
		}
	}
	
}