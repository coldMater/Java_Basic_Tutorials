package ReservationMovie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NowMovieGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NowMovieGUI window = new NowMovieGUI();
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
	public NowMovieGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 768, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel titlePnl = new JPanel();
		titlePnl.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, titlePnl, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, titlePnl, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(titlePnl);
		
		JPanel contentsPnl = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, contentsPnl, 206, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, contentsPnl, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, titlePnl, -6, SpringLayout.NORTH, contentsPnl);
		springLayout.putConstraint(SpringLayout.WEST, contentsPnl, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, contentsPnl, -10, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, titlePnl, 0, SpringLayout.EAST, contentsPnl);
		contentsPnl.setBackground(Color.WHITE);
		titlePnl.setLayout(new CardLayout(0, 0));
		
		JLabel todayMovieInfo = new JLabel("\uC624\uB298\uC758 \uC0C1\uC601 \uC601\uD654");
		todayMovieInfo.setBackground(Color.WHITE);
		todayMovieInfo.setFont(new Font("08서울남산체 M", Font.PLAIN, 30));
		todayMovieInfo.setHorizontalAlignment(SwingConstants.CENTER);
		titlePnl.add(todayMovieInfo, "name_1276720011196457");
		frame.getContentPane().add(contentsPnl);
		contentsPnl.setLayout(new GridLayout(2, 6, 5, 5));
		
		JLabel name = new JLabel("\uC81C\uBAA9");
		name.setBackground(Color.WHITE);
		name.setFont(new Font("08서울남산체 M", Font.PLAIN, 15));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		contentsPnl.add(name);
		
		JLabel time = new JLabel("\uC0C1\uC601\uC2DC\uAC04");
		time.setBackground(Color.WHITE);
		time.setFont(new Font("08서울남산체 M", Font.PLAIN, 15));
		time.setHorizontalAlignment(SwingConstants.CENTER);
		contentsPnl.add(time);
		
		JLabel genre = new JLabel("\uC7A5\uB974");
		genre.setBackground(Color.WHITE);
		genre.setFont(new Font("08서울남산체 M", Font.PLAIN, 15));
		genre.setHorizontalAlignment(SwingConstants.CENTER);
		contentsPnl.add(genre);
		
		JLabel director = new JLabel("\uAC10\uB3C5");
		director.setBackground(Color.WHITE);
		director.setFont(new Font("08서울남산체 M", Font.PLAIN, 15));
		director.setHorizontalAlignment(SwingConstants.CENTER);
		contentsPnl.add(director);
		
		JLabel audience = new JLabel("\uAD00\uB78C\uAC00");
		audience.setBackground(Color.WHITE);
		audience.setFont(new Font("08서울남산체 M", Font.PLAIN, 15));
		audience.setHorizontalAlignment(SwingConstants.CENTER);
		contentsPnl.add(audience);
		
		JButton tomorrowMovieBtn = new JButton("\uB0B4\uC77C \uC0C1\uC601 \uC601\uD654");
		tomorrowMovieBtn.setBackground(Color.WHITE);
		tomorrowMovieBtn.setFont(new Font("08서울남산체 M", Font.PLAIN, 13));
		contentsPnl.add(tomorrowMovieBtn);
		
		JLabel movieName = new JLabel("New label");
		movieName.setBackground(Color.WHITE);
		movieName.setFont(new Font("08서울남산체 M", Font.PLAIN, 15));
		movieName.setHorizontalAlignment(SwingConstants.CENTER);
		contentsPnl.add(movieName);
		
		JLabel movieTime = new JLabel("New label");
		movieTime.setBackground(Color.WHITE);
		movieTime.setFont(new Font("08서울남산체 M", Font.PLAIN, 15));
		movieTime.setHorizontalAlignment(SwingConstants.CENTER);
		contentsPnl.add(movieTime);
		
		JLabel movieGenre = new JLabel("New label");
		movieGenre.setBackground(Color.WHITE);
		movieGenre.setFont(new Font("08서울남산체 M", Font.PLAIN, 15));
		movieGenre.setHorizontalAlignment(SwingConstants.CENTER);
		contentsPnl.add(movieGenre);
		
		JLabel movieDirector = new JLabel("New label");
		movieDirector.setBackground(Color.WHITE);
		movieDirector.setFont(new Font("08서울남산체 M", Font.PLAIN, 15));
		movieDirector.setHorizontalAlignment(SwingConstants.CENTER);
		contentsPnl.add(movieDirector);
		
		JLabel movieAudience = new JLabel("New label");
		movieAudience.setBackground(Color.WHITE);
		movieAudience.setFont(new Font("08서울남산체 M", Font.PLAIN, 15));
		movieAudience.setHorizontalAlignment(SwingConstants.CENTER);
		contentsPnl.add(movieAudience);
		
		JButton closeBtn = new JButton("\uC885\uB8CC");
		closeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		closeBtn.setBackground(Color.WHITE);
		closeBtn.setFont(new Font("08서울남산체 M", Font.PLAIN, 15));
		contentsPnl.add(closeBtn);
		
		MovieController mc = new MovieController();
		MovieVo nowMovie = mc.todayShow();
		
		movieName.setText(nowMovie.getMovieName());
		movieTime.setText(nowMovie.getRuntime() + "분");
		movieGenre.setText(nowMovie.getGenre());
		movieDirector.setText(nowMovie.getDirector());
		movieAudience.setText(nowMovie.getAudience() + "세");
	}

}
