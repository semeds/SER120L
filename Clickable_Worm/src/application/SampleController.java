package application;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.input.MouseEvent;


public class SampleController {
	//Instantiate the Scene Builder Shapes
    @FXML
    private Circle Head;
    @FXML
    private Circle Neck;
    @FXML
    private Circle End;
    @FXML
    private Circle Stomach1;
    @FXML
    private Circle Stomach2;
    @FXML
    private Circle Stomach3;
    
    public void mousePressed(MouseEvent e) {
    	//If the mouseEvent is on the Head source then execute
    	if (e.getSource().equals(Head)) {
    		//Create an instance of a new Random Color Object
    		RandomColor HeadColor = new RandomColor(Head);
    		//Execute the SetColor() method on the HeadColor Object
    		HeadColor.SetColor();
    	}
    	if(e.getSource().equals(Neck)) {
    		//Create an instance of a new Random Color Object
    		RandomColor NeckColor = new RandomColor(Neck);
    		//Execute the SetColor() method on the NeckColor Object
    		NeckColor.SetColor();
    	}
    	if(e.getSource().equals(End)) {
    		//Create an instance of a new Random Color Object
    		RandomColor EndColor = new RandomColor(End);
    		//Execute the SetColor() method on the EndColor Object
    		EndColor.SetColor();
    	}
    	if(e.getSource().equals(Stomach1)) {
    		//Create an instance of a new Random Color Object
    		RandomColor Stomach1Color = new RandomColor(Stomach1);
    		//Execute the SetColor() method on the Stomach1Color Object
    		Stomach1Color.SetColor();
    	}
    	if(e.getSource().equals(Stomach2)) {
    		//Create an instance of a new Random Color Object
    		RandomColor Stomach2Color = new RandomColor(Stomach2);
    		//Execute the SetColor() method on the Stomach2Color Object
    		Stomach2Color.SetColor();
    	}
    	if(e.getSource().equals(Stomach3)) {
    		//Create an instance of a new Random Color Object
    		RandomColor Stomach3Color = new RandomColor(Stomach3);
    		//Execute the SetColor() method on the Stomach3Color Object
    		Stomach3Color.SetColor();
    	}
    	
    }
    public void mouseDragged(MouseEvent e) {
    	//Create an instance of a new Draggable Object
    	Draggable Draggable_head = new Draggable(Head);
    	//Execute the Make_Draggable() method on the Draggable_head Object
    	Draggable_head.Make_Draggable();
    	
    	Draggable Draggable_neck = new Draggable(Neck);
    	Draggable_neck.Make_Draggable();
    	
    	Draggable Draggable_end = new Draggable(End);
    	Draggable_end.Make_Draggable();
    	
    	Draggable Draggable_stomach1 = new Draggable(Stomach1);
    	Draggable_stomach1.Make_Draggable();
    	
    	Draggable Draggable_stomach2 = new Draggable(Stomach2);
    	Draggable_stomach2.Make_Draggable();
    	
    	Draggable Draggable_stomach3 = new Draggable(Stomach3);
    	Draggable_stomach3.Make_Draggable();

    }
    
}