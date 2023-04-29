package application;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Shape;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SampleController {
	
//	@FXML
//    private TextField usernameField;
//    @FXML
//    private PasswordField passwordField;
//    
//    @FXML
//    void loginButtonPressed() {
//        String username = usernameField.getText();
//        String password = passwordField.getText();
//        
//        /*check if username and password are correct*/
//        if ((username.equals("admin")) && (password.equals("password"))) {
//            System.out.println("Login successful!");
//            //Switch scenes by calling the showDashboard method
//            showDashboard();
//            
//            
//        } else {
//            Alert alert = new Alert(AlertType.ERROR);
//            alert.setTitle("Login Error");
//            alert.setHeaderText(null);
//            alert.setContentText("Incorrect username or password. Please try again.");
//            alert.showAndWait();
//        }
//    }
//
//    private void showDashboard() {
//    	try {
//    	// Create a new FXML Loader object
//    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Clickable_Worm.fxml"));
//        Parent root;
//        //Load the new FXML Object
//		root = loader.load();
//		//Get the current scene of the usernameField component
//        Scene scene = usernameField.getScene();
//        //Replace the current scene with the new FXML scene we just loaded
//        scene.setRoot(root);
//        // Catch any IO errors that occur and print them to the console
//    	} catch (IOException e) {
//			e.printStackTrace();
//		}
//    }
	
	
	

    @FXML
    private AnchorPane anchorPane;

//    @FXML
//    private Circle circle1;
//
//    @FXML
//    private Circle circle2;
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
    
    //Create a list of Timeline objects; One for each Circle component.
    private List<Timeline> timelines = Arrays.asList(new Timeline(), new Timeline(), new Timeline(), new Timeline(), new Timeline(),new Timeline());
    
    // Create a method that will handle KeyEvents for the Anchor Pane
    @FXML
    private void handleKeyPress(KeyEvent event) {
    	//Get the event key code and call the moveDown method when the keycode is equal to the down button on the Keyboard
        if (event.getCode() == KeyCode.DOWN) {
            moveDown();
        }
        else if (event.getCode() == KeyCode.UP) {
            moveUp();
        }
        if (event.getCode() == KeyCode.LEFT) {
            moveLeft();
        }
        if (event.getCode() == KeyCode.RIGHT) {
            moveRight();
        }
    }
    
    @FXML
    private void moveDown() {
    	//Retrieve the height of the AnchorPane and store it in the screenHeight variable
        double screenHeight = anchorPane.getHeight();
        //Set the distance the circles will move down
        double deltaY = 200;
    	//Create a List<Shape> called Shapes containing the circle1 and circle2 objects.
        List<Shape> Shapes = Arrays.asList(Head, Neck, End, Stomach1, Stomach2, Stomach3);
        //Start a for loop that iterates over each Circle object in the circles list.
        for (int i = 0; i < Shapes.size(); i++) {
        	//Retrieve the Circle object at the current index i in the circles list and store it in the circle variable
        	Shape Shape = Shapes.get(i);
            //Retrieve the corresponding Timeline object from the timelines list at the current index i. 
            //A Timeline is used to create animations in JavaFX.
            Timeline timeline = timelines.get(i);
            //Retrieve the current Y position of the circle and store it in the currentY variable.
            double currentY = Shape.getLayoutY();
            //Calculate the newY position for each circle (current position + distance to travel).  
            double newY = currentY + deltaY;
            //Stop the current Timeline animation if it's running.
            timeline.stop();
            //Clear any existing keyframes in the Timeline. 
            //Keyframes define specific points in time and the target values at those points during an animation.
            timeline.getKeyFrames().clear();
            //Create a KeyValue object that associates the layoutYProperty of the circle with the target value newY. 
            //This defines the end value for the animation
            KeyValue keyValue = new KeyValue(Shape.layoutYProperty(), newY);
            //Create a KeyFrame object with a duration of 2000 milliseconds (2 seconds) and the previously created KeyValue. 
            //This keyframe defines the point in time when the circle should reach the target Y position.
            KeyFrame keyFrame = new KeyFrame(Duration.millis(2000), keyValue);
            //Add the created KeyFrame to the Timeline.
            timeline.getKeyFrames().add(keyFrame);
            //Start the Timeline animation, causing the circle to move to the target Y position within the specified duration.
            timeline.play();
        }
    }
    
    @FXML
    private void moveUp() {
    	//Retrieve the height of the AnchorPane and store it in the screenHeight variable
        double screenHeight = anchorPane.getHeight();
        //Set the distance the circles will move down
        double deltaY = 200;
    	//Create a List<Shape> called Shapes containing the circle1 and circle2 objects.
        List<Shape> Shapes = Arrays.asList(Head, Neck, End, Stomach1, Stomach2, Stomach3);
        //Start a for loop that iterates over each Circle object in the circles list.
        for (int i = 0; i < Shapes.size(); i++) {
        	//Retrieve the Circle object at the current index i in the circles list and store it in the circle variable
        	Shape Shape = Shapes.get(i);
            //Retrieve the corresponding Timeline object from the timelines list at the current index i. 
            //A Timeline is used to create animations in JavaFX.
            Timeline timeline = timelines.get(i);
            //Retrieve the current Y position of the circle and store it in the currentY variable.
            double currentY = Shape.getLayoutY();
            //Calculate the newY position for each circle (current position + distance to travel).  
            double newY = currentY - deltaY;
            //Stop the current Timeline animation if it's running.
            timeline.stop();
            //Clear any existing keyframes in the Timeline. 
            //Keyframes define specific points in time and the target values at those points during an animation.
            timeline.getKeyFrames().clear();
            //Create a KeyValue object that associates the layoutYProperty of the circle with the target value newY. 
            //This defines the end value for the animation
            KeyValue keyValue = new KeyValue(Shape.layoutYProperty(), newY);
            //Create a KeyFrame object with a duration of 2000 milliseconds (2 seconds) and the previously created KeyValue. 
            //This keyframe defines the point in time when the circle should reach the target Y position.
            KeyFrame keyFrame = new KeyFrame(Duration.millis(2000), keyValue);
            //Add the created KeyFrame to the Timeline.
            timeline.getKeyFrames().add(keyFrame);
            //Start the Timeline animation, causing the circle to move to the target Y position within the specified duration.
            timeline.play();
        }
    }
    
    @FXML
    private void moveLeft() {
    	//Retrieve the height of the AnchorPane and store it in the screenHeight variable
        double screenHeight = anchorPane.getHeight();
        //Set the distance the circles will move down
        double deltaX = 200;
    	//Create a List<Shape> called Shapes containing the circle1 and circle2 objects.
        List<Shape> Shapes = Arrays.asList(Head, Neck, End, Stomach1, Stomach2, Stomach3);
        //Start a for loop that iterates over each Circle object in the circles list.
        for (int i = 0; i < Shapes.size(); i++) {
        	//Retrieve the Circle object at the current index i in the circles list and store it in the circle variable
        	Shape Shape = Shapes.get(i);
            //Retrieve the corresponding Timeline object from the timelines list at the current index i. 
            //A Timeline is used to create animations in JavaFX.
            Timeline timeline = timelines.get(i);
            //Retrieve the current X position of the circle and store it in the currentY variable.
            double currentX = Shape.getLayoutX();
            //Calculate the newY position for each circle (current position + distance to travel).  
            double newX = currentX - deltaX;
            //Stop the current Timeline animation if it's running.
            timeline.stop();
            //Clear any existing keyframes in the Timeline. 
            //Keyframes define specific points in time and the target values at those points during an animation.
            timeline.getKeyFrames().clear();
            //Create a KeyValue object that associates the layoutXProperty of the circle with the target value newY. 
            //This defines the end value for the animation
            KeyValue keyValue = new KeyValue(Shape.layoutXProperty(), newX);
            //Create a KeyFrame object with a duration of 2000 milliseconds (2 seconds) and the previously created KeyValue. 
            //This keyframe defines the point in time when the circle should reach the target Y position.
            KeyFrame keyFrame = new KeyFrame(Duration.millis(2000), keyValue);
            //Add the created KeyFrame to the Timeline.
            timeline.getKeyFrames().add(keyFrame);
            //Start the Timeline animation, causing the circle to move to the target Y position within the specified duration.
            timeline.play();
        }
    }
    
    @FXML
    private void moveRight() {
    	//Retrieve the height of the AnchorPane and store it in the screenHeight variable
        double screenHeight = anchorPane.getHeight();
        //Set the distance the circles will move down
        double deltaX = 200;
    	//Create a List<Shape> called Shapes containing the circle1 and circle2 objects.
        List<Shape> Shapes = Arrays.asList(Head, Neck, End, Stomach1, Stomach2, Stomach3);
        //Start a for loop that iterates over each Circle object in the circles list.
        for (int i = 0; i < Shapes.size(); i++) {
        	//Retrieve the Circle object at the current index i in the circles list and store it in the circle variable
        	Shape Shape = Shapes.get(i);
            //Retrieve the corresponding Timeline object from the timelines list at the current index i. 
            //A Timeline is used to create animations in JavaFX.
            Timeline timeline = timelines.get(i);
            //Retrieve the current X position of the circle and store it in the currentY variable.
            double currentX = Shape.getLayoutX();
            //Calculate the newY position for each circle (current position + distance to travel).  
            double newX = currentX + deltaX;
            //Stop the current Timeline animation if it's running.
            timeline.stop();
            //Clear any existing keyframes in the Timeline. 
            //Keyframes define specific points in time and the target values at those points during an animation.
            timeline.getKeyFrames().clear();
            //Create a KeyValue object that associates the layoutXProperty of the circle with the target value newY. 
            //This defines the end value for the animation
            KeyValue keyValue = new KeyValue(Shape.layoutXProperty(), newX);
            //Create a KeyFrame object with a duration of 2000 milliseconds (2 seconds) and the previously created KeyValue. 
            //This keyframe defines the point in time when the circle should reach the target Y position.
            KeyFrame keyFrame = new KeyFrame(Duration.millis(2000), keyValue);
            //Add the created KeyFrame to the Timeline.
            timeline.getKeyFrames().add(keyFrame);
            //Start the Timeline animation, causing the circle to move to the target Y position within the specified duration.
            timeline.play();
        }
    }
    
    
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