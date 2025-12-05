package com.example._311960_projectjoy.LocalSupplier;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Jumper {

    public static void jumper(Node sourceNode, String fxmlFileName, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(com.example._311960_projectjoy.LocalSupplier.Jumper.class.getResource("/com/example/_311960_projectjoy/LocalSupplier"+ fxmlFileName));
            Parent root = loader.load();

            Stage stage = (Stage) sourceNode.getScene().getWindow();
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
