package com.example._311960_projectjoy.LocalSupplier;

import com.example._311960_projectjoy.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;

public class LocalSupplierDashboardController
{

    @javafx.fxml.FXML
    private Button deliveriesButton;
    @javafx.fxml.FXML
    private Button logOutButton;
    @javafx.fxml.FXML
    private Button rFQsButton;
    @javafx.fxml.FXML
    private Button newDliveryButton;
    @javafx.fxml.FXML
    private Button createProfileButton;
    @javafx.fxml.FXML
    private Button productsButton;
    @javafx.fxml.FXML
    private Button pOsButton;
    @javafx.fxml.FXML
    private Button newInVoiceButton;
    @javafx.fxml.FXML
    private Button cSVButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    private Stage stage;
    private Scene scene;
    private Parent root;

    @Deprecated
    public void onHelloButtonClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleDeliveriesButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleProductsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCreateProfileButton(ActionEvent actionEvent) throws Exception {
        Jumper.jumper((Node)actionEvent.getSource(), "create-profile.fxml", "Create Profile");
    }

    @javafx.fxml.FXML
    public void handlePOsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handlesRFQsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCSVButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void hnadleNewDeliveryButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void hnadleNewInvoiceButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogOutButton(ActionEvent actionEvent) {
    }
}