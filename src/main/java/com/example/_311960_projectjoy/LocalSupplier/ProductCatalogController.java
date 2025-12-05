package com.example._311960_projectjoy.LocalSupplier;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ProductCatalogController
{
    @javafx.fxml.FXML
    private TextField itemNameTextField;
    @javafx.fxml.FXML
    private TableColumn <ProductCatalog, LocalDate> leadTimeCol;
    @javafx.fxml.FXML
    private TextField unitNameTextField;
    @javafx.fxml.FXML
    private TextField priceNameTextField;
    @javafx.fxml.FXML
    private Button validateButton;
    @javafx.fxml.FXML
    private TableColumn <ProductCatalog,Double> mOQCol;
    @javafx.fxml.FXML
    private Button homeButton;
    @javafx.fxml.FXML
    private TableColumn <ProductCatalog,Double> priceCol;
    @javafx.fxml.FXML
    private Button refreshButton;
    @javafx.fxml.FXML
    private TextField mOQTextField;
    @javafx.fxml.FXML
    private TableColumn <ProductCatalog,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn <ProductCatalog,Double> unitCol;
    @javafx.fxml.FXML
    private TableView <ProductCatalog> productCatalogTableView;
    @javafx.fxml.FXML
    private DatePicker leadTimeDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRefreshButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleValidateButton(ActionEvent actionEvent) {
    }
}