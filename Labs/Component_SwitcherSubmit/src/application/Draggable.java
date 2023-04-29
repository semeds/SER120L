package application;

import javafx.scene.Node;

public class Draggable {

    private double mouseAnchorX;
    private double mouseAnchorY;
    private Node Circle_component;
    private Node Rectangle_component;
    
    public Draggable(Node node) {
    	Circle_component = node;
    	Rectangle_component = node;
    	
    }
    public void Make_Draggable() {
    	Circle_component.setOnMouseDragged(mouseEvent -> {
    		Circle_component.setLayoutX(mouseEvent.getSceneX() - mouseAnchorX);
    		Circle_component.setLayoutY(mouseEvent.getSceneY() - mouseAnchorY);
        });
    	
    	Rectangle_component.setOnMouseDragged(mouseEvent -> {
    		Rectangle_component.setLayoutX(mouseEvent.getSceneX() - mouseAnchorX);
    		Rectangle_component.setLayoutY(mouseEvent.getSceneY() - mouseAnchorY);
        });
    }
    
    public void mouseDragged(Node node) {
    	node.setOnMouseDragged(mouseEvent -> {
    		node.setLayoutX(mouseEvent.getSceneX() - mouseAnchorX);
    		node.setLayoutY(mouseEvent.getSceneY() - mouseAnchorY);
        });
    }
}