package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class SampleController {

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    
    @FXML
    void loginButtonPressed() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        /*check if username and password are correct*/
        if ((username.equals("admin")) && (password.equals("password"))) {
            System.out.println("Login successful!");
            //Switch scenes by calling the showDashboard method
            showDashboard();
            
            
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText(null);
            alert.setContentText("Incorrect username or password. Please try again.");
            alert.showAndWait();
        }
    }

    private void showDashboard() {
    	try {
    	// Create a new FXML Loader object
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Clickable_Worm.fxml"));
        Parent root;
        //Load the new FXML Object
		root = loader.load();
		//Get the current scene of the usernameField component
        Scene scene = usernameField.getScene();
        //Replace the current scene with the new FXML scene we just loaded
        scene.setRoot(root);
        // Catch any IO errors that occur and print them to the console
    	} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
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
    @FXML
   	private Rectangle squareNeck;
    @FXML
   	private Rectangle squareEnd;
    @FXML
   	private Rectangle squareStomach1;
    @FXML
   	private Rectangle squareStomach2;
    @FXML
   	private Rectangle squareStomach3;
   
   
    
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
    	
    	if(e.getSource().equals(squareNeck)) {
    		//Create an instance of a new Random Color Object
    		RandomColor squareNeckColor = new RandomColor(squareNeck);
    		//Execute the SetColor() method on the Stomach3Color Object
    		squareNeckColor.SetColorSquare();
    	}
    	
    	if(e.getSource().equals(squareEnd)) {
    		//Create an instance of a new Random Color Object
    		RandomColor squareEndColor = new RandomColor(squareEnd);
    		//Execute the SetColor() method on the Stomach3Color Object
    		squareEndColor.SetColorSquare();
    	}
    	
    	if(e.getSource().equals(squareStomach1)) {
    		//Create an instance of a new Random Color Object
    		RandomColor squareStomach1Color = new RandomColor(squareStomach1);
    		//Execute the SetColor() method on the Stomach3Color Object
    		squareStomach1Color.SetColorSquare();
    	}
    	
    	if(e.getSource().equals(squareStomach2)) {
    		//Create an instance of a new Random Color Object
    		RandomColor squareStomach2Color = new RandomColor(squareStomach2);
    		//Execute the SetColor() method on the Stomach3Color Object
    		squareStomach2Color.SetColorSquare();
    	}
    	
    	if(e.getSource().equals(squareStomach3)) {
    		//Create an instance of a new Random Color Object
    		RandomColor squareStomach3Color = new RandomColor(squareStomach3);
    		//Execute the SetColor() method on the Stomach3Color Object
    		squareStomach3Color.SetColorSquare();
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
    	
    	Draggable Draggable_squareNeck = new Draggable(squareNeck);
    	Draggable_squareNeck.Make_Draggable();
    	
    	Draggable Draggable_squareEnd = new Draggable(squareEnd);
    	Draggable_squareEnd.Make_Draggable();
    	
    	Draggable Draggable_squareStomach1 = new Draggable(squareStomach1);
    	Draggable_squareStomach1.Make_Draggable();
    	
    	Draggable Draggable_squareStomach2 = new Draggable(squareStomach2);
    	Draggable_squareStomach2.Make_Draggable();
    	
    	Draggable Draggable_squareStomach3 = new Draggable(squareStomach3);
    	Draggable_squareStomach3.Make_Draggable();
    }
    
    //Instantiate your FXML variables

       @FXML
       public void displaySquare() {
           //Use the setVisible() methods on your Circle/Rectangle objects to change their visibility
       	Neck.setVisible(false);
       	End.setVisible(false);
       	Stomach1.setVisible(false);
       	Stomach2.setVisible(false);
       	Stomach3.setVisible(false);
       	squareNeck.setVisible(true);
       	squareEnd.setVisible(true);
       	squareStomach1.setVisible(true);
       	squareStomach2.setVisible(true);
       	squareStomach3.setVisible(true);
       }

       @FXML
       public void displayCircle() {
       	//Use the setVisible() methods on your Circle/Rectangle objects to change their visibility
       	Neck.setVisible(true);
       	End.setVisible(true);
       	Stomach1.setVisible(true);
       	Stomach2.setVisible(true);
       	Stomach3.setVisible(true);
       	squareNeck.setVisible(false);
       	squareEnd.setVisible(false);
       	squareStomach1.setVisible(false);
       	squareStomach2.setVisible(false);
       	squareStomach3.setVisible(false);
       }
}