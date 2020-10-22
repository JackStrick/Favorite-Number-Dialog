import javax.swing.JOptionPane;
import java.lang.System;

public class DialogBoxCreation {

    public static void main(String[] args){

        String input = JOptionPane.showInputDialog("Please enter your favorite number:");
        int number = Integer.parseInt(input);

        if(number != 21){
            JOptionPane.showMessageDialog(null, "That number is inferior!");
        }
        else{
            JOptionPane.showMessageDialog(null, "That is respectable!");
        }
        //21 is the best number
        System.exit(0);

    }
}
