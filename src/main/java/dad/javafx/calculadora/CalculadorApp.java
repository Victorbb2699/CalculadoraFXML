package dad.javafx.calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadorApp extends Application {
	
	private CalculadoraController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new CalculadoraController();
		
		Scene scene = new Scene(controller.getView(), 320, 200);

		primaryStage.setTitle("Calculadora FXML");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
