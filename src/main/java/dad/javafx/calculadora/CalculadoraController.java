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

	// model
	Calculadora calc = new Calculadora();
	
	
	// view
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

	@FXML
	void onActioncButton(ActionEvent event) {
		calc.borrar();
	}

	@FXML
	void onActionceButton(ActionEvent event) {
		calc.borrarTodo();
	}

	@FXML
	void onActionceroButton(ActionEvent event) {
		calc.insertar('0');
	}

	@FXML
	void onActioncincoButton(ActionEvent event) {
		calc.insertar('5');
	}

	@FXML
	void onActioncomaButton(ActionEvent event) {
		calc.insertarComa();
	}

	@FXML
	void onActioncuatroButton(ActionEvent event) {
		calc.insertar('4');
	}

	@FXML
	void onActiondivButton(ActionEvent event) {
		calc.operar(Calculadora.DIVIDIR);
	}

	@FXML
	void onActiondosButton(ActionEvent event) {
		calc.insertar('2');
	}

	@FXML
	void onActionmultipliqButton(ActionEvent event) {
		calc.operar(Calculadora.MULTIPLICAR);
	}

	@FXML
	void onActionnueveButton(ActionEvent event) {
		calc.insertar('9');
	}

	@FXML
	void onActionochoButton(ActionEvent event) {
		calc.insertar('8');
	}
	
	@FXML
	void onActionrestaButton(ActionEvent event) {
		calc.operar(Calculadora.RESTAR);
	}

	@FXML
	void onActionresultButton(ActionEvent event) {
		calc.operar(Calculadora.IGUAL);
	}

	@FXML
	void onActionseisButton(ActionEvent event) {
		calc.insertar('6');
	}

	@FXML
	void onActionsieteButton(ActionEvent event) {
		calc.insertar('7');
	}

	@FXML
	void onActionsumaButton(ActionEvent event) {
		calc.operar(Calculadora.SUMAR);
	}

	@FXML
	void onActiontresButton(ActionEvent event) {
		calc.insertar('3');
	}

	@FXML
	void onActionunoButton(ActionEvent event) {
		calc.insertar('1');
	}
}
