package calculator.Caculator_App_Swing;

import javax.swing.*;

/**
 * Класс Calculator_V3
 */
public class Calculator_V3 {

	public static void main(String[] args) {

		JFrame myWindow = new CalcOkno();   // создарние экземпляра приложения
		//   myWindow.setSize(150, 300);    // размеры окна
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // закрытие программы при нажатии на крестик
		myWindow.setResizable(true);  // позволяет раздвигать панель
		myWindow.setLocationRelativeTo(null); // окно выводится по середине экрана
	}
}