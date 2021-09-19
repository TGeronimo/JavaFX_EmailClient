package com.baronasu.view;

import com.baronasu.EmailManager;
import com.baronasu.controller.BaseController;
import com.baronasu.controller.LoginWindowController;
import com.baronasu.controller.MainWindowController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {

    private EmailManager emailManager;

    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
    }

    public void showLoginWindow() {

        System.out.println("login window called");
        BaseController controller = new LoginWindowController(
                emailManager,
                this,
                "LoginWindow.fxml"
        );

        initializeStage(controller);
    }

    public void showMainWindow() {

        System.out.println("main window called");
        BaseController controller = new MainWindowController(
                emailManager,
                this,
                "MainWindow.fxml"
        );

        initializeStage(controller);

    }

    private void initializeStage(BaseController baseController) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(baseController.getFxmlName()));
        fxmlLoader.setController(baseController);
        Parent parent;

        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void closeStage(Stage stageToClose) {
        stageToClose.close();
    }
}