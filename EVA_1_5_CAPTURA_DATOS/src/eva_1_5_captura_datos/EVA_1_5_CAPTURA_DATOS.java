/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_5_captura_datos;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author invitado
 */
public class EVA_1_5_CAPTURA_DATOS extends Application {
    
    /**
     *
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction((ActionEvent event) -> {
            System.out.println("Hello World!");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        int edad;
        String nombre;
        System.out.println("Introduce tu nombre");
        //Crear un scanner;
        Scanner captura = new Scanner(System.in);
        //Captura;
        nombre = captura.nextLine();
        System.out.println("Introduce tu edad");
        edad = captura.nextInt();
        System.out.println("Tu nombre es:");
        System.out.println(nombre);
        System.out.println("Tu edad es:");
        System.out.println(edad);
    }
    
}
