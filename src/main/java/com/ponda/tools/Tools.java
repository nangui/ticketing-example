package com.ponda.tools;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Tools {
	private final static String salt = "123456789";
	private final static int iterationCount = 10000;
	private final static int keyLength = 512;
	
	public static byte[] hashPassword(String password) {
				SecretKeyFactory skf = null;
				try {
					skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
				} catch (NoSuchAlgorithmException e) {
					e.printStackTrace();
				}
				PBEKeySpec spec = new PBEKeySpec(
						password.toCharArray(), 
						salt.getBytes(), 
						iterationCount, 
						keyLength);
				SecretKey key = null;
				try {
					key = skf.generateSecret(spec);
				} catch (InvalidKeySpecException e) {
					e.printStackTrace();
				}
				byte[] res = key.getEncoded();
				return res;
	}
	
	public static FadeTransition fadeTransition(double duration, Node node, double from, double to) {
		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(duration), node);
		fadeTransition.setFromValue(from);
		fadeTransition.setToValue(to);
		fadeTransition.play();
		return fadeTransition;
	}
	
	public static TranslateTransition translateTransition(double duration, Node node, double byX, double byY) {
		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(duration), node);
		translateTransition.setByX(byX);
		translateTransition.setByY(byY);
		translateTransition.play();
		return translateTransition;
	}
	
	public static ScaleTransition scaleTransition(double duration, Node node, double byX, double byY) {
		ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(duration), node);
		scaleTransition.setByX(byX);
		scaleTransition.setByY(byY);
		scaleTransition.play();
		return scaleTransition;
	}
	
	private void loadPage(ActionEvent event, String url, String titre) throws IOException{
		((Node)event.getSource()).getScene().getWindow().hide();
		Parent root = FXMLLoader.load(getClass().getResource(url));
		Scene scene = new Scene(root);
		
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setResizable(false);
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.setTitle("M1GL Billeterie: " + titre);
		stage.show();
	}
	
	private void loadPage2(MouseEvent event, String url, String titre) throws IOException{
		((Node)event.getSource()).getScene().getWindow().hide();
		Parent root = FXMLLoader.load(getClass().getResource(url));
		Scene scene = new Scene(root);
		
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setResizable(false);
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.setTitle("M1GL Billeterie: " + titre);
		stage.show();
	}
	
	public static void myLoadPage(ActionEvent event, String url, String titre) throws IOException{
		(new Tools()).loadPage(event, url, titre);
	}
	
	public static void myLoadPage2(MouseEvent event, String url, String titre) throws IOException{
		(new Tools()).loadPage2(event, url, titre);
	}
	
	public static String getViewsPath(){
		return "/com/ponda/views/";
	}
}
