package ReservationMovie;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

public class MovieMainGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieMainGUI window = new MovieMainGUI();
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
	public MovieMainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 746, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel View = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, View, 720, SpringLayout.WEST, frame.getContentPane());
		View.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, View, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, View, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, View, -112, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(View);
		
		JPanel SelectButtons = new JPanel();
		SelectButtons.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, SelectButtons, 6, SpringLayout.SOUTH, View);
		springLayout.putConstraint(SpringLayout.EAST, SelectButtons, 0, SpringLayout.EAST, View);
		springLayout.putConstraint(SpringLayout.WEST, SelectButtons, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, SelectButtons, -10, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(SelectButtons);
		SelectButtons.setLayout(new GridLayout(1, 5, 10, 0));
		View.setLayout(new CardLayout(0, 0));
		
		JLabel titleLbl = new JLabel("\uC601\uD654 \uC608\uB9E4");
		titleLbl.setBackground(Color.WHITE);
		titleLbl.setFont(new Font("08서울남산체 M", Font.PLAIN, 30));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		View.add(titleLbl, "name_1273246230366277");
		
		
		JButton todayMovieBtn = new JButton("\uC624\uB298\uC758 \uC601\uD654");
		todayMovieBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NowMovieGUI now = new NowMovieGUI();
				now.main(null);
			}
		});
		todayMovieBtn.setBackground(Color.WHITE);
		todayMovieBtn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		SelectButtons.add(todayMovieBtn);
		
		JButton showSeatBtn = new JButton("\uC88C\uC11D\uBCF4\uAE30");
		showSeatBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MovieSeatGUI seat = new MovieSeatGUI();
				seat.main(null);
			}
		});
		showSeatBtn.setBackground(Color.WHITE);
		showSeatBtn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		SelectButtons.add(showSeatBtn);
		
		JButton movieReservationBtn = new JButton("\uC601\uD654\uC608\uB9E4");
		movieReservationBtn.setBackground(Color.WHITE);
		movieReservationBtn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		SelectButtons.add(movieReservationBtn);
		
		JButton cancelReservationBtn = new JButton("\uC608\uB9E4\uCDE8\uC18C");
		cancelReservationBtn.setBackground(Color.WHITE);
		cancelReservationBtn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		SelectButtons.add(cancelReservationBtn);
		
		JButton closeBtn = new JButton("\uC885\uB8CC");
		closeBtn.setBackground(Color.WHITE);
		closeBtn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		closeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		SelectButtons.add(closeBtn);
	}

}
