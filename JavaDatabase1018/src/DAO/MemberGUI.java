package DAO;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MemberGUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberGUI window = new MemberGUI();
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
	public MemberGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "name_10022238123125");
		
		Vector columnNames = new Vector<>();
		columnNames.add("name");
		columnNames.add("phoneNum");
		columnNames.add("age");
		
		Vector data = new Vector<>();
		
		MemberDAO dao = new MemberDAO();
		ArrayList<Member> list = dao.selectAll();
		
		for (int i = 0; i < list.size(); i++) {
			Member m = list.get(i);
			Vector row = new Vector<>();
			row.add(m.getName());
			row.add(m.getPhoneNum());
			row.add(m.getAge());
			data.add(row);
		}

		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);
	}

}
