package application;

//import the modules needed for each Scene Builder Control
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class SampleController {
//Instantiate the Scene Builder Controls
	@FXML
	private Circle myCircle;
	@FXML
	private Double x;
	@FXML
	private Double y;

	// Move myCircle down when the down button is pressed
	public void MoveDown(ActionEvent e) {
		// Print "Down" to the console for debugging
		System.out.println("Down");
		// Get the current Y coordinate of myCircle
		y = myCircle.getLayoutY();
		// Set the Y coordinate to the current value + 3.
		myCircle.setLayoutY(y + 3);
	}

	public void MoveRight(ActionEvent e) {
		// Print "Right" to the console for debugging
		System.out.println("Right");
		// Get the current X coordinate of myCircle
		x = myCircle.getLayoutX();
		// Set the X coordinate to the current value + 3.
		myCircle.setLayoutX(x + 3);
	}
	
	public void MoveLeft(ActionEvent e) {
		// Print "Left" to the console for debugging
		System.out.println("Left");
		// Get the current X coordinate of myCircle
		x = myCircle.getLayoutX();
		// Set the X coordinate to the current value - 3.
		myCircle.setLayoutX(x - 3);
	}
	
	public void MoveUp(ActionEvent e) {
		// Print "Down" to the console for debugging
		System.out.println("Up");
		// Get the current Y coordinate of myCircle
		y = myCircle.getLayoutY();
		// Set the Y coordinate to the current value - 3.
		myCircle.setLayoutY(y - 3);
	}

}
