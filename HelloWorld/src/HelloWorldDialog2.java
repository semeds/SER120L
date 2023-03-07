/**
 * Sean Emede
 * Lab 1: Hello World Dialog 2
 * @date 1/25/2023
 * @author seane
 */

import javax.swing.JOptionPane;

public class HelloWorldDialog2 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name:");
		JOptionPane.showMessageDialog(null,"Hello " + name + "!!!");

	}

}
