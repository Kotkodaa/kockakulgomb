/*
* File: MainPanel.java
* Author: Kondor Marcell
* Copyright: 2023, Kondor Marcell
* Group: Szoft 1/N
* Date: 2023-05-16
* Github: https://github.com/Kotkodaa/kockakulgomb.git
* Licenc: GNU GPL
*/
package views;

import com.github.suli2022.inputlib.ButtonPanel;
import com.github.suli2022.inputlib.InputPanel;
import com.github.suli2022.inputlib.TitlePanel;

import javafx.scene.layout.VBox;

public class MainPanel extends VBox {
    TitlePanel titlePanel;
    InputPanel aSidePanel;
    ButtonPanel buttonPanel;
    InputPanel areaPanel;

    public MainPanel(){
        this.titlePanel=new TitlePanel();
        this.aSidePanel=new InputPanel();
        this.buttonPanel=new ButtonPanel();
        this.areaPanel=new InputPanel();

        this.titlePanel.setText("Gömb sugara");
        this.aSidePanel.setText("Kocka oldala");
        this.buttonPanel.setCalcButtonText("Számít");
        this.areaPanel.setText("Gömb sugara");

        this.getChildren().add(this.titlePanel);
        this.getChildren().add(this.aSidePanel);
        this.getChildren().add(this.buttonPanel);
        this.getChildren().add(this.areaPanel);
    }
    
    public InputPanel getASidePanel() {
        return aSidePanel;
    }
    public ButtonPanel getButtonPanel() {
        return buttonPanel;
    }
    public InputPanel getAreaPanel() {
        return areaPanel;
    }
}
