package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws IOException {
				
				//Load the FXML file.
				Parent parent = FXMLLoader.load(getClass().getResource("Exam.fxml"));
				
				//Build the scene graph.
				Scene scene = new Scene(parent);
				
				//Display our window, using the scene graph.
				stage.setTitle("Test Calculator");
				stage.setScene(scene);
				stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
