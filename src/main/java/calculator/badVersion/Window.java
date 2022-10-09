package calculator.badVersion;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.*;

public class Window extends JFrame implements ActionListener {
    public static Window window = null;
    private static ButtonsPanel buttonsPanel = null;
    private static Label label = null;
    private static String input = "0";
    String deystvie = "";
    
    private Window() {
        window = this;
        buttonsPanel = new ButtonsPanel();
        setTitle("Calculator");                                                 
        setSize(320, 370);                                                      // размеры окна
        setMinimumSize(new Dimension(160, 50));
        setMaximumSize(new Dimension(640, 740));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                         // действие при нажатии на крестик
       
        label = new Label("0");
        JButton c = new JButton(" = ");
        label.setPreferredSize(new Dimension(250, 60));
        c.setPreferredSize(new Dimension(250, 60));
            c.setName("=");
            c.addActionListener(Window.window);
//        buttonsPanel.setPreferredSize(new Dimension(250, 250));
        
        setLayout (new BorderLayout(5,5)); 
        add(label, BorderLayout.NORTH);
        add(buttonsPanel, BorderLayout.CENTER);
        add(c, BorderLayout.SOUTH);
        setVisible(true);
    }
    
    static Window getInstance() {
            return new Window();
    }
    
    private Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); // буфер обмена
      
    private void copyToClip(String text) {                                      // копируем в буфер
        StringSelection selection = new StringSelection(text);
        clipboard.setContents(selection, selection);
    }
    
    private String getClip() throws UnsupportedFlavorException, IOException {     // читаем из буфера
           String clipboardContent = (String) clipboard.getData(DataFlavor.stringFlavor);
           return clipboardContent;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
          //Код, который нужно выполнить при нажатии
          JButton button = (JButton) ae.getSource();
          String name = button.getName();
          
          switch (name) {
              case "0" :
                  if (input.equals("0")) break;
                  input += "0";
                  break;
                  
              case "1" :
                  if (input.equals("0")) {
                      input = "1";
                      break;
                     }
                  input += "1";
                  break;
                  
              case "2" :
                 if (input.equals("0")) {
                      input = "2";
                      break;
                    }
                  input += "2"; 
                  break;
                  
              case "3" :
                 if (input.equals("0")) {
                      input = "3";
                      break;
                    }
                 input += "3"; 
                  break;
                  
              case "4" :
                 if (input.equals("0")) {
                      input = "4";
                      break;
                    }
                 input += "4"; 
                  break;
                  
              case "5" :
                 if (input.equals("0")) {
                      input = "5";
                      break;
                    }
                 input += "5";  
                  break;
                  
              case "6" :
                 if (input.equals("0")) {
                      input = "6";
                      break;
                    }
                 input += "6";  
                  break;
                  
              case "7" :
                 if (input.equals("0")) {
                      input = "7";
                      break;
                    }
                 input += "7";   
                  break;   
                  
              case "8" :
                 if (input.equals("0")) {
                      input = "8";
                      break;
                    }
                 input += "8";  
                  break;  
                  
              case "9" :
                 if (input.equals("0")) {
                      input = "9";
                      break;
                    }
                 input += "9";  
                  break;
               
              case "CE" :
                 input = "0";  
                  break;
               
              case "." :
                  if (input.charAt(input.length()-1) == '.') break;
                  input += ".";  
                  break;  
                  
              case "+" :
                   copyToClip(input);
                   input ="0";
                   deystvie = "+";
                  break;  
                  
              case "-" :
                  copyToClip(input);
                   input ="0";
                   deystvie = "-";
                  break;  
                  
              case "*" :
                  copyToClip(input);
                   input ="0";
                   deystvie = "*";
                  break;  
                  
              case "/" :
                  copyToClip(input);
                   input ="0";
                   deystvie = "/";
                  break;
                  
              case "=":
                  Float f2 = Float.parseFloat(input);                           // то, что ввели во 2й раз
         {
              try {
                  Float f1 = Float.parseFloat(getClip());
                  switch (deystvie) {
                     case "+":  input = Float.toString(f1+f2); 
                        break;
                     case "-": input = Float.toString(f1-f2);
                        break;
                     case "*": input = Float.toString(f1*f2);
                        break; 
                     case "/": input = Float.toString(f1/f2); 
                        break;
                                    }
                  } catch (UnsupportedFlavorException|IOException ex) {
                  Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                                                                      } 
          }
                  break;
        }
          label.setText(input);
   }
}
