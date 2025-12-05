module com.example._311960_projectjoy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._311960_projectjoy.LocalSupplier to javafx.fxml;
    exports com.example._311960_projectjoy.LocalSupplier;

    opens com.example._311960_projectjoy to javafx.fxml;
    exports com.example._311960_projectjoy;
}