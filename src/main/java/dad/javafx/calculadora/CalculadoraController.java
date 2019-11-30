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
		operacionesButton.setText(calc.getPantalla());
		
	}

	@FXML
	void onActionceButton(ActionEvent event) {
		calc.borrarTodo();
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActionceroButton(ActionEvent event) {
		calc.insertar('0');
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActioncincoButton(ActionEvent event) {
		calc.insertar('5');
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActioncomaButton(ActionEvent event) {
		calc.insertarComa();
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActioncuatroButton(ActionEvent event) {
		calc.insertar('4');
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActiondivButton(ActionEvent event) {
		calc.operar(Calculadora.DIVIDIR);
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActiondosButton(ActionEvent event) {
		calc.insertar('2');
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActionmultipliqButton(ActionEvent event) {
		calc.operar(Calculadora.MULTIPLICAR);
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActionnueveButton(ActionEvent event) {
		calc.insertar('9');
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActionochoButton(ActionEvent event) {
		calc.insertar('8');
		operacionesButton.setText(calc.getPantalla());
	}
	
	@FXML
	void onActionrestaButton(ActionEvent event) {
		calc.operar(Calculadora.RESTAR);
		operacionesButton.setText(calc.getPantalla());
		
	}

	@FXML
	void onActionresultButton(ActionEvent event) {
		calc.operar(Calculadora.IGUAL);
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActionseisButton(ActionEvent event) {
		calc.insertar('6');
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActionsieteButton(ActionEvent event) {
		calc.insertar('7');
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActionsumaButton(ActionEvent event) {
		calc.operar(Calculadora.SUMAR);
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActiontresButton(ActionEvent event) {
		calc.insertar('3');
		operacionesButton.setText(calc.getPantalla());
	}

	@FXML
	void onActionunoButton(ActionEvent event) {
		calc.insertar('1');
		operacionesButton.setText(calc.getPantalla());
	}
}
