module com.eten.u17cm1022.thenetinsight {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.eten.u17cm1022.thenetinsight to javafx.fxml;
    exports com.eten.u17cm1022.thenetinsight;
    exports com.eten.u17cm1022.thenetinsight.controllers;
    opens com.eten.u17cm1022.thenetinsight.controllers to javafx.fxml;
}
