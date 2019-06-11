import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

public class Drag extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JComboBox<String[]> comboBox;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private String[] list1 = { "Phan ban", "Khong phan ban" };
	private String[] list2 = { "Ky thuat", "Xa hoi" };
	private String[] list3 = { "Co khi", "CNTT" };
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Drag frame = new MamLinhDrag();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Drag() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 2, 5, 5));

		lblNewLabel = new JLabel("Ngh\u1EC1 nghi\u1EC7p");
		panel.add(lblNewLabel);
		comboBox = new JComboBox<String[]>();
		panel.add(comboBox);

		rdbtnNewRadioButton = new JRadioButton("H\u1ECDc sinh");
		buttonGroup.add(rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				if (rdbtnNewRadioButton.isSelected()) {
					comboBox.addItem(list1);
				}
			}
		});

		chckbxNewCheckBox_1 = new JCheckBox("\u0110\u1ECDc b\u00E1o");
		panel.add(chckbxNewCheckBox_1);

		rdbtnNewRadioButton_1 = new JRadioButton("Sinh vi\u00EAn");
		buttonGroup.add(rdbtnNewRadioButton_1);
		panel.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				if (rdbtnNewRadioButton_1.isSelected()) {
					comboBox.addItem(list2);
				}
			}
		});

		chckbxNewCheckBox_2 = new JCheckBox("\u0110\u1ECDc s\u00E1ch");
		panel.add(chckbxNewCheckBox_2);

		rdbtnNewRadioButton_2 = new JRadioButton("K\u1EF9 s\u01B0");
		buttonGroup.add(rdbtnNewRadioButton_2);
		panel.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				if (rdbtnNewRadioButton_2.isSelected()) {
					comboBox.addItem(list3);
				}
			}
		});

		chckbxNewCheckBox = new JCheckBox("Nghe nh\u1EA1c");
		panel.add(chckbxNewCheckBox);
	}

}
