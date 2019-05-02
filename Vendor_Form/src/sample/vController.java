package sample;

import com.gluonhq.charm.glisten.control.AutoCompleteTextField;
import javafx.fxml.FXML;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;

public  class vController {
    @FXML
    private AutoCompleteTextField v_name;
    @FXML
    private AutoCompleteTextField reg_no;
    @FXML
    private AutoCompleteTextField v_phone;
    @FXML
    private AutoCompleteTextField v_email;
    @FXML
    private AutoCompleteTextField v_pin;
    @FXML
    private AutoCompleteTextField v_add;
    @FXML
    private AutoCompleteTextField v_yob;
    @FXML


    private AutoCompleteTextField cont_ID;


    public void Controller() {
        System.out.println(v_name.getText());

    }




}
