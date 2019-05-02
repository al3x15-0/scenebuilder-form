package sample;

import com.gluonhq.charm.glisten.control.Alert;
import com.gluonhq.charm.glisten.control.AutoCompleteTextField;
import com.gluonhq.charm.glisten.control.DatePicker;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
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
    private AutoCompleteTextField date;
    @FXML


    private AutoCompleteTextField cont_ID;
    @FXML
    Button add;

    public  void switchtoaddform (){



    }



    public void onsubmit() {
        try {
            String name = v_name.getText();
            String regno = reg_no.getText();
            String phone = v_phone.getText();
            String email = v_email.getText();
            String pin = v_pin.getText();
            String address = v_add.getText();
            String contactID = cont_ID.getText();
            String yob = date.getText();


            connect();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void connect() {
        try {
            final String URL = "jdbc:mysql://localhost:3306/vendor";
            final String Driver = "org.gjt.mm.mysql.Driver";
            final String user = "root";
            final String password = "";
            Class.forName(Driver);
            Connection conn = DriverManager.getConnection(URL, user, password);
            String query = "INSERT INTO suppliers (`v_name`, `Reg`, `Phone`, `Email`, `KRA`, `Address`, `DOB`, `Contact_ID`)" + "values ( ?, ?, ?, ?, ?, ?, ?, ?, )";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, v_name.getText());
            statement.setString(2, reg_no.getText());
            statement.setString(3, v_phone.getText());
            statement.setString(4, v_email.getText());
            statement.setString(5, v_pin.getText());
            statement.setString(6, v_add.getText());
            statement.setString(7, date.getText());
            statement.setString(8, cont_ID.getText());
            statement.execute();
            System.out.println("Record Inserted Sucessfully");


        }
        catch (Exception e)
        {
            System.out.println(e);

        }
    }
    public void revert()
    {
        v_name.setText("");
        reg_no.setText("");
        v_phone.setText("");
        v_email.setText("");
        v_pin.setText("");
        v_add.setText("");
        date.setText("");
        cont_ID.setText("");


    }
    public void quit ()
    {
        System.exit(0);
    }





}
