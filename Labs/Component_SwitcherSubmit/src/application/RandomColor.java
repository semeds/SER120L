package application;

import java.util.Random;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class RandomColor {
	
	private Circle Circle_component;
	private Rectangle Square_component;
	
	
	public RandomColor(Circle node) {
		Circle_component = node;
	}
    
    public RandomColor(Rectangle node) {
		Square_component = node;
	}

	public void SetColor() {
    	Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        Circle_component.setFill(Color.rgb(r, g, b));
    }
	
	public void SetColorSquare() {
    	Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        Square_component.setFill(Color.rgb(r, g, b));
    }
}