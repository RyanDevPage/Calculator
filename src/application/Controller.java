package application;

import java.text.DecimalFormat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;

public class Controller {
	
	@FXML
	TextField textfield = new TextField();
	
	String currNumber = "";
	int firstNumber;
	int secondNumber;
	double firstNumberDivision;
	//int finalNumber;
	String oper = "";
	
	@FXML
	public void zero(ActionEvent e) {
		if(!currNumber.equals("")) {
			currNumber += "0";
			textfield.setText(currNumber);
		}
	}
	
	@FXML
	public void one(ActionEvent e) {
		currNumber += "1";
		textfield.setText(currNumber);
	}
	
	@FXML
	public void two(ActionEvent e) {
		currNumber += "2";
		textfield.setText(currNumber);
	}
	
	@FXML
	public void three(ActionEvent e) {
		currNumber += "3";
		textfield.setText(currNumber);
	}
	
	@FXML
	public void four(ActionEvent e) {
		currNumber += "4";
		textfield.setText(currNumber);
	}
	
	@FXML
	public void five(ActionEvent e) {
		currNumber += "5";
		textfield.setText(currNumber);
	}
	
	@FXML
	public void six(ActionEvent e) {
		currNumber += "6";
		textfield.setText(currNumber);
	}
	
	@FXML
	public void seven(ActionEvent e) {
		currNumber += "7";
		textfield.setText(currNumber);
	}
	
	@FXML
	public void eight(ActionEvent e) {
		currNumber += "8";
		textfield.setText(currNumber);
	}
	
	@FXML
	public void nine(ActionEvent e) {
		currNumber += "9";
		textfield.setText(currNumber);
	}
	
	@FXML
	public void plus(ActionEvent e) {
		
		if (currNumber.contains(".")) {							//THIS IS TO FIX DIVISION ERROR
			double fix = Double.parseDouble(currNumber);
			int fix2 = (int) fix;
			String num = Integer.toString(fix2);
			firstNumber = Integer.parseInt(num);
			oper = "+";
			currNumber = "";
			return;
		}
		
		firstNumber = Integer.parseInt(currNumber);
		oper = "+";
		currNumber = "";
	}
	
	@FXML
	public void minus(ActionEvent e) {
		
		if (currNumber.contains(".")) {							//THIS IS TO FIX DIVISION ERROR
			double fix = Double.parseDouble(currNumber);
			int fix2 = (int) fix;
			String num = Integer.toString(fix2);
			firstNumber = Integer.parseInt(num);
			oper = "-";
			currNumber = "";
			return;
		}
		
		firstNumber = Integer.parseInt(currNumber);
		oper = "-";
		currNumber = "";
	}
	
	@FXML
	public void multiply(ActionEvent e) {
		
		if (currNumber.contains(".")) {							//THIS IS TO FIX DIVISION ERROR
			double fix = Double.parseDouble(currNumber);
			int fix2 = (int) fix;
			String num = Integer.toString(fix2);
			firstNumber = Integer.parseInt(num);
			oper = "*";
			currNumber = "";
			return;
		}
		
		firstNumber = Integer.parseInt(currNumber);
		oper = "*";
		currNumber = "";
	}
	
	@FXML
	public void divide(ActionEvent e) {
		
		if (currNumber.contains(".")) {							//THIS IS TO FIX DIVISION ERROR
			double fix = Double.parseDouble(currNumber);
			int fix2 = (int) fix;
			String num = Integer.toString(fix2);
			firstNumber = Integer.parseInt(num);
			oper = "/";
			currNumber = "";
			return;
		}
		
		firstNumber = Integer.parseInt(currNumber);
		oper = "/";
		currNumber = "";
	}
	
	@FXML
	public void equals(ActionEvent e) {								// ONCE EQUALS IS PRESSED, CASE IS DETERMINED TO CARRY OUT CALCULATION
		secondNumber = Integer.parseInt(currNumber);
		switch(oper) {
			case "+" -> {
				int finalNumber = firstNumber + secondNumber;
				textfield.setText(String.valueOf(finalNumber));
				currNumber = "";
				firstNumber = 0;
				secondNumber = 0;
				currNumber = String.valueOf(finalNumber);
			}
			
			case "-" -> {
				int finalNumber = firstNumber - secondNumber;
				textfield.setText(String.valueOf(finalNumber));
				currNumber = "";
				firstNumber = 0;
				secondNumber = 0;
				currNumber = String.valueOf(finalNumber);
			}
			
			case "*" -> {
				int finalNumber = firstNumber * secondNumber;
				textfield.setText(String.valueOf(finalNumber));
				currNumber = "";
				firstNumber = 0;
				secondNumber = 0;
				currNumber = String.valueOf(finalNumber);
			}
			
			case "/" -> {
				double finalNumber = firstNumber / (double)secondNumber;
				textfield.setText(String.valueOf(finalNumber));
				currNumber = "";
				firstNumber = 0;
				secondNumber = 0;
				currNumber = String.valueOf(finalNumber);
					
			}
		}
		System.out.println(currNumber);
		
	}
	
	@FXML
	public void clear(ActionEvent e) {
		textfield.setText("");
		currNumber = "";
		firstNumber = 0;
		secondNumber = 0;
		//finalNumber = 0;
	}
}
