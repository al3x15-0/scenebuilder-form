package sample;
import java.awt.datatransfer.FlavorEvent;
import  java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import  javafx.fxml.FXMLLoader;
import  javafx.scene.Scene;
import  javafx.scene.layout.AnchorPane;

import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
//Creating the fxml loader
        try{ FXMLLoader loader = new FXMLLoader();
//path to the scenebuilder file
        String fxmlpath = "C:\\Users\\al3x15\\IdeaProjects\\Vendor_Form\\src\\sample\\Table.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlpath);
        // create pane, add all elements
            VBox root = (VBox) loader.load(fxmlStream);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Vendor Form");
        stage.show();
}
catch (Exception e)
{
    System.out.println(e);
}
    }




}
