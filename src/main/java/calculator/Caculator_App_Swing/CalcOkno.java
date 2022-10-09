package calculator.Caculator_App_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Класс CalcOkno
 */
public class CalcOkno extends JFrame {

	private JPanel top, center, bottom;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
	private JButton bplus, bminus, bmult, bdiv;
	private JButton bpoint, bclear, bquals;
	private JTextField ind;
	private CalcOkno co;
	String h, j;
	int i, SUM, DIF, MUT, DIV;
	double a, b;

	CalcOkno() {
		co = this;

		top = new JPanel();
		center = new JPanel();
		bottom = new JPanel();

		setSize(300, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		ind = new JTextField();
		ind.setPreferredSize(new Dimension(250, 50));
		ind.setFont(new Font("Arial", Font.PLAIN, 25));
		top.setLayout(new BorderLayout());
		bottom.setLayout(new BorderLayout());
		top.add(ind, BorderLayout.CENTER);
		add(top, BorderLayout.NORTH);

		center.setLayout(new GridLayout(4, 4, 5, 5));

		center.add(b7 = new JButton("7"));
		b7.addActionListener(ae -> addNum(ae));
		center.add(b8 = new JButton("8"));
		b8.addActionListener(ae -> addNum(ae));
		center.add(b9 = new JButton("9"));
		b9.addActionListener(ae -> addNum(ae));
		center.add(bplus = new JButton("+"));
		bplus.addActionListener(ae -> addPlus(ae));

		center.add(b4 = new JButton("4"));
		b4.addActionListener(ae -> addNum(ae));
		center.add(b5 = new JButton("5"));
		b5.addActionListener(ae -> addNum(ae));
		center.add(b6 = new JButton("6"));
		b6.addActionListener(ae -> addNum(ae));
		center.add(bminus = new JButton("-"));
		bminus.addActionListener(ae -> addMinus(ae));

		center.add(b1 = new JButton("1"));
		b1.addActionListener(ae -> addNum(ae));
		center.add(b2 = new JButton("2"));
		b2.addActionListener(ae -> addNum(ae));
		center.add(b3 = new JButton("3"));
		b3.addActionListener(ae -> addNum(ae));
		center.add(bmult = new JButton("*"));
		bmult.addActionListener(ae -> addBmult(ae));

		center.add(bclear = new JButton("CE"));
		bclear.addActionListener(ae -> addBClear(ae));
		center.add(b0 = new JButton("0"));
		b0.addActionListener(ae -> addNum(ae));
		center.add(bpoint = new JButton("."));
		bpoint.addActionListener(ae -> addNum(ae));
		center.add(bdiv = new JButton("/"));
		bdiv.addActionListener(ae -> addDiv(ae));

		add(center, BorderLayout.CENTER);

		bquals = new JButton("=");
		//   bquals.setPreferredSize(new Dimension(200, 100)); // размер кнопки

		//   bottom.add(bquals, BorderLayout.CENTER);
		add(bquals, BorderLayout.SOUTH);
		bquals.addActionListener(ae -> addEquels(ae));

		setVisible(true);
	}

	private void addNum(ActionEvent ae) {
		// получает текст и выводит в консоли команду введения числа
		ind.setText(ind.getText() + ae.getActionCommand());
	}

	private void addPlus(ActionEvent e) {
		if (e.getSource() == bplus) {
			j = ind.getText();
			ind.setText(null);
			SUM++;
		}
	}

	private void addMinus(ActionEvent ae) {
		if (ae.getSource() == bminus) {
			j = ind.getText();
			ind.setText(null);
			DIF++;
		}
	}

	private void addDiv(ActionEvent ae) {
		// обработчик получает введеное значение на панели
		if (ae.getSource() == bdiv) {
			j = ind.getText();  //
			ind.setText(null);  // сбрасывает введёное значение
			DIV++;
		}
	}

	private void addBmult(ActionEvent ae) {
		// обработчик получает введеное значение на панели
		if (ae.getSource() == bmult) {
			j = ind.getText();  //
			ind.setText(null);  // сбрасывает введёное значение
			MUT++;
		}
	}

	private void addBClear(ActionEvent ae) {
		if (ae.getSource() == bclear) {
			ind.setText(null);
		}
	}

	private void addEquels(ActionEvent e) {
		if (e.getSource() == bquals) {
			h = ind.getText();  // значение введеное в поле

			b = Double.parseDouble(h);  // переменная принимаемая
			a = Double.parseDouble(j);  // другая переменная
			if (SUM == 1) {
				ind.setText(a + b + ""); // поле принимает и складывает переменные, заполнив поле
				SUM = 0;    // сбрасывает
				a = 0;      // переменные обнуляются
				b = 0;
				h = "";     // возвращается пустое значение
				j = "";
			}

			if (DIF == 1) {
				ind.setText(a - b + "");
				DIF = 0;
				a = 0;
				b = 0;
				h = "";
				j = "";
			}
			if (MUT == 1) {
				ind.setText(a * b + "");
				MUT = 0;
				a = 0;
				b = 0;
				h = "";
				j = "";
			}
			if (DIV == 1) {
				ind.setText(a / b + "");
				DIV = 0;
				a = 0;
				b = 0;
				h = "";
				j = "";
			}
		}
	}
}