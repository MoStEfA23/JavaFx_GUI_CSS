/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uicontrols;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author MoStEfA23
 */
public class UiControls extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Create controls
        Button btn = new Button();
        btn.setText("Button sample");
        
        Label lbl = new Label();
        lbl.setText("Label sample");
        
        TextField tf = new TextField("Type your text here");
        Hyperlink h1 = new Hyperlink("Hyperlink sample");
        
        RadioButton rb = new RadioButton("RadioButton sample");
        
        CheckBox cb = new CheckBox("checkbox sample");
        ProgressBar pb = new ProgressBar();
        ScrollBar sb = new ScrollBar();
        PasswordField passwordField = new PasswordField();
        passwordField.setText("samplePasswordText");
        
        //Init GridPane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(20);
        grid.setVgap(50);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        
        Scene scene = new Scene(grid, 500, 400);
        scene.getStylesheets().add(UiControls.class.getResource("style.css").toExternalForm());
        
        grid.add(btn, 0, 0);
        grid.add(lbl, 1, 0);
        grid.add(tf, 2, 0);
        grid.add(rb, 0, 1);
        grid.add(cb, 1, 1);
        grid.add(h1, 2, 1);
        grid.add(pb, 0, 2);
        grid.add(sb, 1, 2);
        grid.add(passwordField, 2, 2);
        
        primaryStage.setTitle("JavaFx controls Sample");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
