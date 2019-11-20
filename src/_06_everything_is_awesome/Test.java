package _06_everything_is_awesome;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Test {
	public static void main(String[] args) {
String luna =JOptionPane.showInputDialog("What is your favorate color")	;
JOptionPane.showMessageDialog(null, luna+" is my favorate color too!");
Robot lupin=new Robot();
lupin.penDown();
lupin.setSpeed(75);
lupin.turn(270);
lupin.move(300);
lupin.turn(120);
lupin.move(300);
lupin.turn(120);
lupin.move(300);








	}
}
