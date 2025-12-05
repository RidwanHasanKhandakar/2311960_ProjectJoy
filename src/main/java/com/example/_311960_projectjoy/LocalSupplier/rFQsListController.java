package com.example._311960_projectjoy.LocalSupplier;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class rFQsListController
{
    @javafx.fxml.FXML
    private DatePicker leadTimeDatePicker;
    @javafx.fxml.FXML
    private TableView <RFQsList> quotedRFQsTableView;
    @javafx.fxml.FXML
    private ComboBox <String> selectRfqComboBox;
    @javafx.fxml.FXML
    private TextField unitPriceTextfield;
    @javafx.fxml.FXML
    private TextArea noteTextArea;
    @javafx.fxml.FXML
    private Button validateButton;
    @javafx.fxml.FXML
    private TableColumn <RFQsList,String> quotedCol;
    @javafx.fxml.FXML
    private Button homeButton;

    @javafx.fxml.FXML
    public void initialize() {
        selectRfqComboBox.getItems().addAll("RFQ-001",
                "RFQ-002",
                "RFQ-003",
                "RFQ-004");

    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleValidateButton(ActionEvent actionEvent) {
    }
}