package Bingo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;

import java.awt.FlowLayout;

import javax.swing.JPanel;

import java.awt.GridLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

public class BingoGUI {
	int size = 7;
	Controll controll = new Controll();
	int[] choiceNum;
	private JFrame frame;
	BingoRandomBase user1 = new BingoRandomBase("������");
	BingoRandomBase2 user2 = new BingoRandomBase2("Ȳ�ص�");
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BingoGUI window = new BingoGUI();
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
	public BingoGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		JButton[][] user1_Buttons = new JButton[size][size];
		int[][] user1_BingoNum = controll.MakeBingo();
		

		JButton[][] user2_Buttons = new JButton[size][size];
		int[][] user2_BingoNum = controll.MakeBingo();
		
		
		
		frame = new JFrame();
		frame.setBounds(50, 10, 1860, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel user1_panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, user1_panel, 80, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, user1_panel, 50, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(user1_panel);
		user1_panel.setLayout(new GridLayout(7, 7, 5, 5));
		
		
		JPanel user2_panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, user2_panel, 80, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, user2_panel, -50, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(user2_panel);
		user2_panel.setLayout(new GridLayout(7, 7, 5, 5));
		
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -856, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel, 354, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JLabel user1Score = new JLabel(user1.getName() + ", 0 Bingo");
		user1Score.setFont(new Font("���� ���", Font.PLAIN, 35));
		panel.add(user1Score);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -341, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_2);
		
		JLabel user2Score = new JLabel(user2.getName() + ", 0 Bingo");
		user2Score.setFont(new Font("���� ���", Font.PLAIN, 35));
		panel_2.add(user2Score);
		
		
		for(int i = 0; i<user1_Buttons.length; i++){
			for(int j=0; j<user1_Buttons[i].length; j++){
				user1_Buttons[i][j] = new JButton(user1_BingoNum[i][j] +"");
				user1_Buttons[i][j].setBackground(Color.GRAY);
				user1_Buttons[i][j].setFont(new Font("�������", Font.BOLD, 70));
				user1_panel.add(user1_Buttons[i][j]);
				
				user2_Buttons[i][j] = new JButton(user2_BingoNum[i][j] +"");
				user2_Buttons[i][j].setBackground(Color.GRAY);
				user2_Buttons[i][j].setFont(new Font("�������", Font.BOLD, 70));
				user2_panel.add(user2_Buttons[i][j]);
				
			}
		}
		
		JButton btnStart = new JButton("NEXT");
		btnStart.setFont(new Font("���� ���", Font.PLAIN, 35));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choiceNum = user1.getNextNum(user1_BingoNum); //�����θ�����
				user1_Buttons[choiceNum[0]][choiceNum[1]].setBackground(Color.RED); //�����θ����� �ٲٱ� 
				int user1_choice = user1_BingoNum[choiceNum[0]][choiceNum[1]];
				user1_BingoNum[choiceNum[0]][choiceNum[1]] = 0;
				int[] user1_choice_XY_ForUser2 = getXYtoBingo(user1_choice, user2_BingoNum);
				user2_Buttons[user1_choice_XY_ForUser2[0]][user1_choice_XY_ForUser2[1]].setBackground(Color.BLUE); // user1�� �θ� ���ڸ� user2�ǿ��� �ٲٱ�
				user2_BingoNum[user1_choice_XY_ForUser2[0]][user1_choice_XY_ForUser2[1]] = 0;
				
				
				choiceNum = user2.getNextNum(user2_BingoNum); //�����θ�����
				user2_Buttons[choiceNum[0]][choiceNum[1]].setBackground(Color.RED); //�����θ����ڹٲٱ�
				int user2_choice = user2_BingoNum[choiceNum[0]][choiceNum[1]]; //���� �θ� ���� ������
				
				int[] user2_choice_XY_ForUser1 = getXYtoBingo(user2_choice, user1_BingoNum);
				user1_Buttons[user2_choice_XY_ForUser1[0]][user2_choice_XY_ForUser1[1]].setBackground(Color.BLUE); //user2�� �θ� ���ڸ� user1�ǿ��� �ٲٱ�
				user1_BingoNum[user2_choice_XY_ForUser1[0]][user2_choice_XY_ForUser1[1]] = 0;
				user2_BingoNum[choiceNum[0]][choiceNum[1]] = 0;
				
				
				user1Score.setText(user1.getName() + ", "+controll.isBingo(user1_BingoNum)+" Bingo");
				user2Score.setText(user2.getName() + ", "+controll.isBingo(user2_BingoNum)+" Bingo");
				
				if (controll.isBingo(user1_BingoNum) > 4 || controll.isBingo(user2_BingoNum) > 4){
					if (controll.isBingo(user1_BingoNum) > 4 && controll.isBingo(user2_BingoNum) > 4){
						JOptionPane.showMessageDialog(frame, "���º�!");
					}else if (controll.isBingo(user1_BingoNum) > 4){
						JOptionPane.showMessageDialog(frame, "user1�¸�");
					}else if (controll.isBingo(user2_BingoNum) > 4){
						JOptionPane.showMessageDialog(frame, "user2�¸�");
					}
					System.out.println("��������");
					btnStart.setEnabled(false);
				}
			}
		});
		panel_1.add(btnStart);
		
		
		
		
	}

	protected int[] getXYtoBingo(int choice, int[][] BingoNum) {
		int[] temp = new int[2];
		
		for(int i=0; i<BingoNum.length; i++){
			for(int j=0; j<BingoNum[i].length; j++){
				if (BingoNum[i][j] == choice){
					temp[0] = i;
					temp[1] = j;
					
					return temp;
				}
			}
		}
		
		return null;
	}
}
