package MusicPlayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Music.MusicPlayer;
import Music.MusicVO;

import java.awt.Font;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MusicGUI {

	private JFrame frame;
	private MusicPlayer musicPlayer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicGUI window = new MusicGUI();
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
	public MusicGUI() {
		initialize();
		ArrayList<MusicVO> playlist = new ArrayList<MusicVO>();
		playlist.add(new MusicVO("뱅뱅뱅", "빅뱅", 100, "D:\\KSH\\music\\bangbangbang.mp3"));
		playlist.add(new MusicVO("오빠차", "인크레더블", 120, "D:\\KSH\\music\\brothercar.mp3"));
		playlist.add(new MusicVO("cheerup", "트와이스", 143, "D:\\KSH\\music\\cheerup.mp3"));
		playlist.add(new MusicVO("daddy", "싸이", 190, "D:\\KSH\\music\\daddy.mp3"));
		playlist.add(new MusicVO("dumbdumb", "레드벨벳", 110, "D:\\KSH\\music\\dumbdumb.mp3"));
		playlist.add(new MusicVO("유리구슬", "여자친구", 170, "D:\\KSH\\music\\glass.mp3"));
		playlist.add(new MusicVO("IcecreamCake", "레드벨벳", 110, "D:\\KSH\\music\\icecreamcake.mp3"));
		playlist.add(new MusicVO("이럴거면그러지말지", "백아연", 90, "D:\\KSH\\music\\no.mp3"));
		playlist.add(new MusicVO("위아래", "EXID", 110, "D:\\KSH\\music\\updown.mp3"));
		playlist.add(new MusicVO("uptownpuck", "브루노마스", 90, "D:\\KSH\\music\\uptownpunk.mp3"));
		musicPlayer = new MusicPlayer(playlist);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 542, 251);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel titlepanel = new JPanel();
		titlepanel.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, titlepanel, 30, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, titlepanel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, titlepanel, -136, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, titlepanel, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(titlepanel);
		
		JPanel btnpanel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, btnpanel, 38, SpringLayout.SOUTH, titlepanel);
		btnpanel.setBackground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.WEST, btnpanel, 0, SpringLayout.WEST, titlepanel);
		springLayout.putConstraint(SpringLayout.SOUTH, btnpanel, -27, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnpanel, 0, SpringLayout.EAST, titlepanel);
		titlepanel.setLayout(new CardLayout(0, 0));
		
		JLabel Titlelbl = new JLabel("Title");
		Titlelbl.setBackground(new Color(255, 255, 255));
		Titlelbl.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		Titlelbl.setHorizontalAlignment(SwingConstants.CENTER);
		titlepanel.add(Titlelbl, "name_1030009821770453");
		frame.getContentPane().add(btnpanel);
		btnpanel.setLayout(new GridLayout(1, 4, 10, 0));
		
		JButton previousbtn = new JButton("◀◀");
		previousbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MusicVO previouMusic = musicPlayer.previous();
				Titlelbl.setText(previouMusic.getTitle());
			}
		});
		previousbtn.setForeground(Color.BLACK);
		previousbtn.setBackground(new Color(255, 255, 255));
		btnpanel.add(previousbtn);
		
		JButton playbtn = new JButton("▶");
		playbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MusicVO currentMusic = musicPlayer.play();
				Titlelbl.setText(currentMusic.getTitle());
			}
		});
		playbtn.setForeground(Color.BLACK);
		playbtn.setBackground(new Color(255, 255, 255));
		btnpanel.add(playbtn);
		
		JButton stopbtn = new JButton("■");
		stopbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				musicPlayer.stop();
				Titlelbl.setText("노래가 중지되었습니다.");
			}
		});
		stopbtn.setForeground(Color.BLACK);
		stopbtn.setBackground(new Color(255, 255, 255));
		btnpanel.add(stopbtn);
		
		JButton nextbtn = new JButton("▶▶");
		nextbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MusicVO nextMusic = musicPlayer.next();
				Titlelbl.setText(nextMusic.getTitle());
			}
		});
		nextbtn.setForeground(Color.BLACK);
		nextbtn.setBackground(new Color(255, 255, 255));
		btnpanel.add(nextbtn);
	}
}
