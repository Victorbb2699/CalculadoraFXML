package dad.javafx.calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraController implements Initializable {

	@FXML
	private GridPane girdpane;

	@FXML
	private Button sieteButton;

	@FXML
	private Button cuatroButton;

	@FXML
	private Button unoButton;

	@FXML
	private Button ceroButton;

	@FXML
	private Button cincoButton;

	@FXML
	private Button ochoButton;

	@FXML
	private Button nueveButton;

	@FXML
	private Button ceButton;

	@FXML
	private Button cButton;

	@FXML
	private Button seisButton;

	@FXML
	private Button dosButton;

	@FXML
	private Button tresButton;

	@FXML
	private Button sumaButton;

	@FXML
	private Button comaButton;

	@FXML
	private Button resultButton;

	@FXML
	private Button divButton;

	@FXML
	private Button multipliqButton;

	@FXML
	private Button restaButton;

	@FXML
	private TextField operacionesButton;

	@FXML
	void onActioncButton(ActionEvent event) {
		
	}

	@FXML
	void onActionceButton(ActionEvent event) {

	}

	@FXML
	void onActionceroButton(ActionEvent event) {
		operacionesButton.textProperty().bind(ceroButton.textProperty());
	}

	@FXML
	void onActioncincoButton(ActionEvent event) {
		operacionesButton.textProperty().bind(cincoButton.textProperty());
	}

	@FXML
	void onActioncomaButton(ActionEvent event) {

	}

	@FXML
	void onActioncuatroButton(ActionEvent event) {

	}

	@FXML
	void onActiondivButton(ActionEvent event) {

	}

	@FXML
	void onActiondosButton(ActionEvent event) {

	}

	@FXML
	void onActionmultipliqButton(ActionEvent event) {

	}

	@FXML
	void onActionnueveButton(ActionEvent event) {

	}

	@FXML
	void onActionochoButton(ActionEvent event) {

	}

	@FXML
	void onActionrestaButton(ActionEvent event) {

	}

	@FXML
	void onActionresultButton(ActionEvent event) {

	}

	@FXML
	void onActionseisButton(ActionEvent event) {

	}

	@FXML
	void onActionsieteButton(ActionEvent event) {

	}

	@FXML
	void onActionsumaButton(ActionEvent event) {

	}

	@FXML
	void onActiontresButton(ActionEvent event) {

	}

	@FXML
	void onActionunoButton(ActionEvent event) {

	}

	public CalculadoraController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// bindeos
		
	}

	public GridPane getView() {
		return girdpane;
	}
}
