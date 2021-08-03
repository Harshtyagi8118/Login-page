package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;

public class Controller {
    @FXML
    private Label lblStatus;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    public void Login(ActionEvent event)throws Exception{
        if(txtUsername.getText().equals("user") && txtPassword.getText().equals("Pass")){
            lblStatus.setText("Login success");
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            primaryStage.setTitle("signed up");
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        }
        else {
            lblStatus.setText("Login Failed");
        }
    }
}
