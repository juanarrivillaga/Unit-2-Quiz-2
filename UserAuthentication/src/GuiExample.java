import java.util.Scanner;

import javax.swing.JOptionPane;

public class GuiExample {
	
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		String message1 = "Hello Juan!";
		String message2 = "Wrong username and/or password...";
		
		String a = JOptionPane.showInputDialog("Enter Username:");
		String b = JOptionPane.showInputDialog("Enter Password:");
		
		
		boolean boole = UserAuthentication.authentication(a, b);
		
		if (boole)JOptionPane.showMessageDialog(null, message1);
		else JOptionPane.showMessageDialog(null, message2);
		
		
		
	}

}
