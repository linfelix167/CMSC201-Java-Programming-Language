package application;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Cotrol {

	@FXML
	private ImageView Image1;
	
	@FXML
	private ImageView Image2;
	
	@FXML
	private ImageView Image3;
	
	@FXML
	private Button StartButton;
	
	@FXML
	private Button ExitButton;
	
	public void closeButtonAction(){
	    // get a handle to the stage
	    Stage stage = (Stage) ExitButton.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	}
	
	public int cardNum(){
		Random rand = new Random();
		int num = rand.nextInt(54) + 1;
	    return num;
	}
	
	public void start(){
		Image image1 = new Image(Integer.toString(cardNum())+".png"); 
		Image image2 = new Image(Integer.toString(cardNum())+".png"); 
		Image image3 = new Image(Integer.toString(cardNum())+".png"); 
		Image1.setImage(image1);
		Image2.setImage(image2);
		Image3.setImage(image3);
	}
}
