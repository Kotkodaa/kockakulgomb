/*
* File: App.java
* Author: Kondor Marcell
* Copyright: 2023, Kondor Marcell
* Group: Szoft 1/N
* Date: 2023-05-16
* Github: https://github.com/Kotkodaa/kockakulgomb.git
* Licenc: GNU GPL
*/
import controlers.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        MainController mainController=new MainController();
        Scene scene = new Scene(mainController.getMainPanel(),400,300);
        stage.setScene(scene);
        stage.show();        
        
    }
}
