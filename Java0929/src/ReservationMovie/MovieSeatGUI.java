package ReservationMovie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MovieSeatGUI {

	private JFrame frame;
	int count = 0;
	MovieController mc = new MovieController();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieSeatGUI window = new MovieSeatGUI();
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
	public MovieSeatGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 620, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel titlePnl = new JPanel();
		titlePnl.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, titlePnl, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, titlePnl, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, titlePnl, 146, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, titlePnl, 594, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(titlePnl);
		
		JPanel SeatsPnl = new JPanel();
		SeatsPnl.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, SeatsPnl, 6, SpringLayout.SOUTH, titlePnl);
		springLayout.putConstraint(SpringLayout.WEST, SeatsPnl, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, SeatsPnl, 234, SpringLayout.SOUTH, titlePnl);
		springLayout.putConstraint(SpringLayout.EAST, SeatsPnl, 0, SpringLayout.EAST, titlePnl);
		frame.getContentPane().add(SeatsPnl);
		
		JPanel closePnl = new JPanel();
		closePnl.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, closePnl, 6, SpringLayout.SOUTH, SeatsPnl);
		springLayout.putConstraint(SpringLayout.WEST, closePnl, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, closePnl, 60, SpringLayout.SOUTH, SeatsPnl);
		SeatsPnl.setLayout(new GridLayout(3, 5, 5, 5));
		
		JButton[][] button = new JButton[3][5];
		
		for(int i = 0; i < button.length; i++) {
			for (int j = 0; j < button[i].length; j++) {
				String seatNum = "" + ((char)('A' + i)) + j;
				button[i][j] = new JButton(seatNum);
				button[i][j].setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
				button[i][j].setBackground(Color.WHITE);
				SeatsPnl.add(button[i][j]);
			}
		}
		/*
		JButton seatA0Btn = new JButton("A0");
		seatA0Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatA0Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatA0Btn);
		
		JButton seatA1Btn = new JButton("A1");
		seatA1Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatA1Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatA1Btn);
		
		JButton seatA2Btn = new JButton("A2");
		seatA2Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatA2Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatA2Btn);
		
		JButton seatA3Btn = new JButton("A3");
		seatA3Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatA3Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatA3Btn);
		
		JButton seatA4Btn = new JButton("A4");
		seatA4Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatA4Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatA4Btn);
		
		JButton seatB0Btn = new JButton("B0");
		seatB0Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatB0Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatB0Btn);
		
		JButton seatB1Btn = new JButton("B1");
		seatB1Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatB1Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatB1Btn);
		
		JButton seatB2Btn = new JButton("B2");
		seatB2Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatB2Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatB2Btn);
		
		JButton seatB3Btn = new JButton("B3");
		seatB3Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatB3Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatB3Btn);
		
		JButton seatB4Btn = new JButton("B4");
		seatB4Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatB4Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatB4Btn);
		
		JButton seatC0Btn = new JButton("C0");
		seatC0Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatC0Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatC0Btn);
		
		JButton seatC1Btn = new JButton("C1");
		seatC1Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatC1Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatC1Btn);
		
		JButton seatC2Btn = new JButton("C2");
		seatC2Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatC2Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatC2Btn);
		
		JButton seatC3Btn = new JButton("C3");
		seatC3Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatC3Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatC3Btn);
		
		JButton seatC4Btn = new JButton("C4");
		seatC4Btn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		seatC4Btn.setBackground(Color.WHITE);
		SeatsPnl.add(seatC4Btn);
		*/
		
		springLayout.putConstraint(SpringLayout.EAST, closePnl, 0, SpringLayout.EAST, titlePnl);
		titlePnl.setLayout(new CardLayout(0, 0));
		
		JLabel title = new JLabel("\uC601\uD654\uAD00 \uC88C\uC11D");
		title.setBackground(Color.WHITE);
		title.setFont(new Font("08서울남산체 M", Font.PLAIN, 30));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		titlePnl.add(title, "name_1278346717976366");
		frame.getContentPane().add(closePnl);
		closePnl.setLayout(new CardLayout(0, 0));
		
		JButton closeBtn = new JButton("\uC885\uB8CC");
		closeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		closeBtn.setBackground(Color.WHITE);
		closeBtn.setFont(new Font("08서울남산체 M", Font.PLAIN, 25));
		closePnl.add(closeBtn, "name_1278434237667973");
		

		String[][] seat = mc.getSeat();
		
		for(int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if(seat[i][j] == null) {
					button[i][j].setBackground(Color.WHITE);
				} else {
					button[i][j].setBackground(Color.PINK);
				}
			}
		}
	}

}
