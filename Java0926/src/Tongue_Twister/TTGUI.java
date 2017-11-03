package Tongue_Twister;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TTGUI {

	private JFrame frame;
	private JTextField ATxt;
	private TongueTimer timer = new TongueTimer();
	private TongueManager tm = new TongueManager();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TTGUI window = new TTGUI();
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
	public TTGUI() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 987, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, frame.getContentPane());
		panel_1.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 88, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel titleLbl = new JLabel("Tongue Twister Game");
		titleLbl.setBackground(Color.WHITE);
		titleLbl.setFont(new Font("08서울남산체 M", Font.PLAIN, 35));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(titleLbl, "name_1033817113446767");
		
		JPanel QPnl = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, QPnl, 10, SpringLayout.WEST, frame.getContentPane());
		QPnl.setBackground(Color.WHITE);
		frame.getContentPane().add(QPnl);
		
		JPanel APnl = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, QPnl, 0, SpringLayout.EAST, APnl);
		APnl.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.WEST, APnl, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, APnl, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(APnl);
		
		JLabel QLbl = new JLabel("Press Start Button");
		JLabel checkLbl = new JLabel("");
		JLabel timeLbl = new JLabel("");
		
		JButton startBtn = new JButton("Start");
		springLayout.putConstraint(SpringLayout.SOUTH, QPnl, -6, SpringLayout.NORTH, startBtn);
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ATxt.setText("");
				checkLbl.setText("");
				timeLbl.setText("");
				timer.start();
				QLbl.setText(tm.getGameMSG());
			}
		});
		startBtn.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, startBtn, 184, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, startBtn, -144, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, startBtn, -10, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, APnl, 6, SpringLayout.SOUTH, startBtn);
		QPnl.setLayout(new CardLayout(0, 0));
		
		QLbl.setFont(new Font("08서울남산체 M", Font.PLAIN, 25));
		QLbl.setHorizontalAlignment(SwingConstants.CENTER);
		QLbl.setBackground(Color.WHITE);
		QPnl.add(QLbl, "name_1037093414919151");
		startBtn.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		frame.getContentPane().add(startBtn);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -509, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, APnl, -6, SpringLayout.NORTH, panel);
		APnl.setLayout(new CardLayout(0, 0));
		
		ATxt = new JTextField();
		ATxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == 10) {
					String tongue = ATxt.getText();
					timer.end();
					
					if(tm.check(tongue)) {
						checkLbl.setText("결과 : 성공");
						timeLbl.setText("소요시간 : " + timer.getTime() + "초");
						JOptionPane.showMessageDialog(frame,
							    "축하합니다!!",
							    "성공",
							    JOptionPane.PLAIN_MESSAGE);
					} else {
						checkLbl.setText("결과 : 실패");
						JOptionPane.showMessageDialog(frame,
							    "다시 한번 해보세요!",
							    "실패",
							    JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		ATxt.setBackground(Color.WHITE);
		ATxt.setFont(new Font("08서울남산체 M", Font.PLAIN, 25));
		ATxt.setHorizontalAlignment(SwingConstants.CENTER);
		APnl.add(ATxt, "name_1033812049507419");
		ATxt.setColumns(10);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 307, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 2, 10, 0));
		
		checkLbl.setBackground(Color.WHITE);
		checkLbl.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		checkLbl.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(checkLbl);
		
		timeLbl.setBackground(Color.WHITE);
		timeLbl.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		timeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(timeLbl);
		
		JLabel questionLbl = new JLabel("Question");
		springLayout.putConstraint(SpringLayout.NORTH, QPnl, 6, SpringLayout.SOUTH, questionLbl);
		springLayout.putConstraint(SpringLayout.NORTH, questionLbl, 6, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, questionLbl, 0, SpringLayout.WEST, panel_1);
		questionLbl.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		frame.getContentPane().add(questionLbl);
		
		JLabel inputLbl = new JLabel("Input");
		inputLbl.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		springLayout.putConstraint(SpringLayout.WEST, inputLbl, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, inputLbl, -6, SpringLayout.NORTH, APnl);
		frame.getContentPane().add(inputLbl);
	}

}
