package PaintShop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PaintShopGUI {

	private JFrame frame;
	private PaintBoard paintBoard;
	protected Color color;
	private Figure figure;
	private int x1, y1, x2, y2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaintShopGUI window = new PaintShopGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PaintShopGUI() {
		color = new Color(0, 0, 0);
		figure = new Line();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 640, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		JPanel colorPnl = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, colorPnl, 614, SpringLayout.WEST, frame.getContentPane());
		colorPnl.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, colorPnl, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, colorPnl, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, colorPnl, 57, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().add(colorPnl);

		JPanel figurePnl = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, figurePnl, 6, SpringLayout.SOUTH, colorPnl);
		springLayout.putConstraint(SpringLayout.WEST, figurePnl, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, figurePnl, -371, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, figurePnl, -10, SpringLayout.EAST, frame.getContentPane());
		figurePnl.setBackground(Color.WHITE);
		colorPnl.setLayout(new GridLayout(1, 3, 5, 0));

		JButton colorBtnRed = new JButton("RED");
		colorBtnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(255, 0, 0);
			}
		});
		colorBtnRed.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		colorBtnRed.setForeground(Color.RED);
		colorBtnRed.setBackground(Color.WHITE);
		colorPnl.add(colorBtnRed);

		JButton colorBtnBlue = new JButton("BLUE");
		colorBtnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(0, 0, 255);
			}
		});
		colorBtnBlue.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		colorBtnBlue.setForeground(Color.BLUE);
		colorBtnBlue.setBackground(Color.WHITE);
		colorPnl.add(colorBtnBlue);

		JButton colorBtnGreen = new JButton("GREEN");
		colorBtnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(0, 255, 0);
			}
		});
		colorBtnGreen.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		colorBtnGreen.setForeground(Color.GREEN);
		colorBtnGreen.setBackground(Color.WHITE);
		colorPnl.add(colorBtnGreen);
		frame.getContentPane().add(figurePnl);

		JPanel canvasPnl = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, canvasPnl, 6, SpringLayout.SOUTH, figurePnl);
		springLayout.putConstraint(SpringLayout.SOUTH, canvasPnl, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, canvasPnl, 0, SpringLayout.EAST, colorPnl);
		canvasPnl.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.WEST, canvasPnl, 10, SpringLayout.WEST, frame.getContentPane());
		figurePnl.setLayout(new GridLayout(1, 2, 5, 0));

		JButton figureBtnLine = new JButton("Line");
		figureBtnLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				figure = new Line();
			}
		});
		figureBtnLine.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		figureBtnLine.setBackground(Color.WHITE);
		figurePnl.add(figureBtnLine);

		JButton figureBtnSquare = new JButton("Square");
		figureBtnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				figure = new Square();
			}
		});
		figureBtnSquare.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		figureBtnSquare.setBackground(Color.WHITE);
		figurePnl.add(figureBtnSquare);
		frame.getContentPane().add(canvasPnl);
		canvasPnl.setLayout(new CardLayout(0, 0));

		paintBoard = new PaintBoard();
		paintBoard.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x1 = e.getX();
				y1 = e.getY();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				x2 = e.getX();
				y2 = e.getY();

				if(figure instanceof Line) {
					((Line) figure).setLineInfo(x1, y1, x2, y2, color);
				} else if (figure instanceof Square) {
					((Square) figure).setSquareInfo(x1, y1, x2-x1, y2-y1, color);
				}
				
				paintBoard.addFigure(figure);
				paintBoard.repaint();
			}
		});
		canvasPnl.add(paintBoard, "name_1290566930969569");
	}

}
