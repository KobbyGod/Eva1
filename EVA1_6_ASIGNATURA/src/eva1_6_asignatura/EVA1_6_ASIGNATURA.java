/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_asignatura;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author invitado
 */
public class EVA1_6_ASIGNATURA extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
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
        String clave, nombre, carrera;
        int creditos, horasTeoricas, horasPracticas;
        Boolean tipoMateria;
        //CAPTURAR;
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce la clave de la asignatura");
        clave = captura.nextLine();
        System.out.println("Introduce el nombre de la asignatura");
        nombre = captura.nextLine();
        System.out.println("Introduce la carrera de la asignatura");
        carrera = captura.nextLine();
        System.out.println("Introduce los creditos de la asignatura");
        creditos = captura.nextInt();
        System.out.println("Introduce las horas teoricas de la asignatura");
        horasTeoricas = captura.nextInt();
        System.out.println("Introduce las horas practicas de la asignatura");
        horasPracticas = captura.nextInt();
        System.out.println("Introduce el tipo de la materia");
        tipoMateria = captura.nextBoolean();
        
        System.out.println(nombre);
        System.out.println(clave);
        System.out.println(carrera);
        System.out.println(creditos);
        System.out.println(horasTeoricas);
        System.out.println(horasPracticas);
        System.out.println(tipoMateria);
        
    }
    
}
