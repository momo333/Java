package application;
	
import com.sun.prism.paint.Color;
import javafx.application.Application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Player player = new Player("file:///C:/gotg.mp4");
		Scene scene = new Scene(player, 720, 480, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
