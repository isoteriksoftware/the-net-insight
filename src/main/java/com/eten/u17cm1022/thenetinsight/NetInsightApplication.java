package com.eten.u17cm1022.thenetinsight;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NetInsightApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NetInsightApplication.class.getResource("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960, 600);
        stage.setTitle("Net Insight");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}