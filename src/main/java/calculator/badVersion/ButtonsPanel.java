
package calculator.badVersion;


import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

	public ButtonsPanel() {
		//  this.setMinimumSize(new Dimension(200, 200));
		//  this.setBackground(new Color(235,235,235));

		JButton d0 = new JButton("0");
		d0.setName("0");
		d0.addActionListener(calculator.badVersion.Window.window);
		JButton d1 = new JButton("1");
		d1.setName("1");
		d1.addActionListener(calculator.badVersion.Window.window);
		JButton d2 = new JButton("2");
		d2.setName("2");
		d2.addActionListener(calculator.badVersion.Window.window);
		JButton d3 = new JButton("3");
		d3.setName("3");
		d3.addActionListener(calculator.badVersion.Window.window);
		JButton d4 = new JButton("4");
		d4.setName("4");
		d4.addActionListener(calculator.badVersion.Window.window);
		JButton d5 = new JButton("5");
		d5.setName("5");
		d5.addActionListener(calculator.badVersion.Window.window);
		JButton d6 = new JButton("6");
		d6.setName("6");
		d6.addActionListener(calculator.badVersion.Window.window);
		JButton d7 = new JButton("7");
		d7.setName("7");
		d7.addActionListener(calculator.badVersion.Window.window);
		JButton d8 = new JButton("8");
		d8.setName("8");
		d8.addActionListener(calculator.badVersion.Window.window);
		JButton d9 = new JButton("9");
		d9.setName("9");
		d9.addActionListener(calculator.badVersion.Window.window);

		JButton ce = new JButton("CE");
		ce.setName("CE");
		ce.addActionListener(calculator.badVersion.Window.window);
		JButton dot = new JButton(".");
		dot.setName(".");
		dot.addActionListener(calculator.badVersion.Window.window);
		JButton plus = new JButton("+");
		plus.setName("+");
		plus.addActionListener(calculator.badVersion.Window.window);
		JButton minus = new JButton("-");
		minus.setName("-");
		minus.addActionListener(calculator.badVersion.Window.window);
		JButton mul = new JButton("*");
		mul.setName("*");
		mul.addActionListener(calculator.badVersion.Window.window);
		JButton dev = new JButton("/");
		dev.setName("/");
		dev.addActionListener(Window.window);

		setLayout(new GridLayout(4, 4, 6, 6));

		add(d7);
		add(d8);
		add(d9);
		add(plus);
		add(d4);
		add(d5);
		add(d6);
		add(minus);
		add(d1);
		add(d2);
		add(d3);
		add(mul);
		add(ce);
		add(d0);
		add(dot);
		add(dev);
		setVisible(true);
	}
}
