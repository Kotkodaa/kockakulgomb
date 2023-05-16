/*
* File: MainController.java
* Author: Kondor Marcell
* Copyright: 2023, Kondor Marcell
* Group: Szoft 1/N
* Date: 2023-05-16
* Github: https://github.com/Kotkodaa/kockakulgomb.git
* Licenc: GNU GPL
*/

package controlers;

import javafx.scene.control.Button;
import models.MainModel;
import views.MainPanel;

public class MainController {
    MainPanel mainPanel;
    
    MainModel mainModel;
    public MainController(){
        this.mainPanel=new MainPanel();
        this.mainModel=new MainModel();
        this.handleEvent();
    }
    public MainPanel getMainPanel() {
        return mainPanel;
    }
    public void handleEvent(){
        Button calcButton=this.mainPanel.getButtonPanel().getCalcButton();
        calcButton.setOnAction(e -> {
            double aSide=Double.parseDouble(this.mainPanel.getASidePanel().getValue());
            double area=this.mainModel.calcArea(aSide);
            mainPanel.getAreaPanel().setValue(String.valueOf(area));
        });
    }
    
}
