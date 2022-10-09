package calculator.badVersion;

import javax.swing.SwingUtilities;

public class Calculator {
  
    
    public static void main(String[] args) {

        SwingUtilities.invokeLater(Window::getInstance);
     }
}
  