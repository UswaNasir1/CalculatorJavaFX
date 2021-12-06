package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuController {
	@FXML
	public Label result;
	private Stage stage;
	private AnchorPane root;
	@FXML
	public void buttonHandler(ActionEvent event) throws IOException
	{
		String value = ((Button)event.getSource()).getText();
		System.out.println(value);
		if(value.equals("Calculator"))
		{
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		if(value.equals("Age Calculator"))
		{
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Age.fxml"));
			Scene scene = new Scene(root,400,400);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		if(value.equals("Currency Converter"))
		{
			root = (AnchorPane)FXMLLoader.load(getClass().getResource("currency.fxml"));
			Scene scene = new Scene(root,372,410);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		if(value.equals("Discount"))
		{
			root = (AnchorPane)FXMLLoader.load(getClass().getResource("discount.fxml"));
			Scene scene = new Scene(root,372,410);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		if(value.equals("Investment Calculator"))
		{
			root = (AnchorPane)FXMLLoader.load(getClass().getResource("investment.fxml"));
			Scene scene = new Scene(root,372,410);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}
		if(value.equals("BMI"))
		{
			root = (AnchorPane)FXMLLoader.load(getClass().getResource("BMI.fxml"));
			Scene scene = new Scene(root,372,410);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		}

	}
}
