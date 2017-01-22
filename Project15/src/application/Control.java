package application;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Control {

	DecimalFormat df = new DecimalFormat("#.00"); 
	
	@FXML
	private TextField ScoreText;
	
	@FXML
	private TextField NumberText;
	
	@FXML
	private TextField AverageText;
	
	@FXML
	private TextField BestText;
	
	@FXML
	private Button EnterButton;
	
	int count = 0;
	double total = 0.0;
	double average = 0.0;
	double bestScore = 0.0;
	ArrayList<Double> scores;
	
	public Control(){
		scores = new ArrayList<Double>();
	}
	
	private boolean validate(String text)
    {
        return text.matches("[0-9]*");
    }
	
	public void enterAction(){
		
		if(!ScoreText.getText().equals("") && validate(ScoreText.getText())){
			total += Double.parseDouble(ScoreText.getText());
			count++;
			average = total / count;
			NumberText.setText(Integer.toString(count));
			AverageText.setText(df.format(average));
			scores.add(Double.parseDouble(ScoreText.getText()));
			bestScore = Collections.max(scores);
			BestText.setText(Double.toString(bestScore));
		}else{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Error");
			alert.setHeaderText(null);
			alert.setContentText("Invalid Input!\nYou must input numeric value!");
			alert.showAndWait();
		}
		
	}
	
	@FXML
	private Button ClearButton;
	
	public void clearAction(){
		scores.removeAll(scores);
		count = 0;
		total = 0.0;
		average = 0.0;
		bestScore = 0.0;
		ScoreText.clear();
		NumberText.setText("0");;
		AverageText.clear();
		BestText.clear();
	}
	
	@FXML
	private Button ExitButton;
	
	public void closeButtonAction(){
	    // get a handle to the stage
	    Stage stage = (Stage) ExitButton.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	}
}
