package com.ponda;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.ponda.tools.Tools;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;


public class LoginController implements Initializable {
	
	@FXML
    private TextField text_login;
    @FXML
    private PasswordField text_password;
    @FXML
    private Text create_an_account;
	@FXML
    private Button btnClose;
	@FXML
	private Button btnLogin;

    @FXML
    void btnClose_onClick(ActionEvent event) {
    	Platform.exit();
    }
	
	public void initialize(URL location, ResourceBundle resources) {
		btnLogin.setOnMouseEntered(event -> {
			btnLogin.setCursor(Cursor.HAND);
		});
		
		btnLogin.setOnAction(event -> {
			// test connection
		});
		
		create_an_account.setOnMouseEntered(event -> {
			create_an_account.setCursor(Cursor.HAND);
			create_an_account.setFill(Paint.valueOf("blue"));
		});
		
		create_an_account.setOnMouseExited(event -> {
			create_an_account.setFill(Paint.valueOf("#000"));
		});
		
		create_an_account.setOnMouseClicked(event -> {
			try {
				Tools.myLoadPage2(event, Tools.getViewsPath()+"Register.fxml", "Register");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

}
