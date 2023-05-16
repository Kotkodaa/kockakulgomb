/*
* File: ButtonPanel.java
* Author: Kondor Marcell
* Copyright: 2023, Kondor Marcell
* Group: Szoft 1/N
* Date: 2023-05-16
* Github: https://github.com/Kotkodaa/kockakulgomb.git
* Licenc: GNU GPL
*/
package views;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonPanel extends HBox{
    Button calcButton;
    
    public ButtonPanel(){
        this.initComponent();
        this.setComponent();
        this.addComponent();
        this.setButtonPanel();
    }
    private void initComponent(){
        this.calcButton=new Button();
    }
    private void setComponent(){

    }
    private void addComponent(){
        this.getChildren().add(this.calcButton);
    }
    public void setCalcButtonText(String text){
        this.calcButton.setText(text);
    }
    private void setButtonPanel(){
        this.setAlignment(Pos.CENTER);
    }
    public Button getCalcButton() {
        return calcButton;
    }
}
