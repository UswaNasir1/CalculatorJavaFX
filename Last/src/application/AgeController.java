package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AgeController {
	@FXML
	public TextField result1;
	@FXML
	public TextField result2;
	public TextField result3;
	@FXML
	public Label display;
	String date1 = "";
	String month = "";
	String year = "";
	@FXML
	public void DateHandler(ActionEvent event)
	{
		
		this.date1 = ((TextField)event.getSource()).getText();
	
		}
	@FXML
	public void MonthHandler(ActionEvent event)
	{
	
		this.month = ((TextField)event.getSource()).getText();
		result1.setText(month);
	}
	@FXML
	public void YearHandler(ActionEvent event)
	{
		
		this.year = ((TextField)event.getSource()).getText();
		result2.setText(year);
				
				getAge();
	}
	@FXML
	public void getAge()
	{
		LocalDate today = LocalDate.now();
		String x = today.toString();
        String[]var = x.split("-");
		
          int year_cur = Integer.parseInt(year);
          int year_bir = Integer.parseInt(var[0]);
          int year_diff = year_bir - year_cur ;
          if(Integer.parseInt(var[0]) - Integer.parseInt(month) >= 12 )
        	  year_diff += 1;
          result3.setText(Integer.toString(year_diff));
	}
	
}
