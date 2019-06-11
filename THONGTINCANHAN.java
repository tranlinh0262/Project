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

public class THONGTINCANHAN extends JFrame {

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
	private String[] listpban = { "Phan ban", "Khong phan ban" };
	private String[] listkythuat = { "Ky thuat", "Xa hoi" };
	private String[] listcokhi = { "Co khi", "CNTT" };
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					THONGTINCANHAN frame = new THONGTINCANHAN();
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
	public THONGTINCANHAN() {
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

		lblNewLabel = new JLabel("Nghe nghiep");
		panel.add(lblNewLabel);
		comboBox = new JComboBox<String[]>();
		panel.add(comboBox);

		rdbtnNewRadioButton = new JRadioButton("Hoc sinh");
		buttonGroup.add(rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				if (rdbtnNewRadioButton.isSelected()) {
					comboBox.addItem(listpban);
				}
			}
		});

		chckbxNewCheckBox_1 = new JCheckBox("Phan ban");
		panel.add(chckbxNewCheckBox_1);

		rdbtnNewRadioButton_1 = new JRadioButton("Sinh vien");
		buttonGroup.add(rdbtnNewRadioButton_1);
		panel.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				if (rdbtnNewRadioButton_1.isSelected()) {
					comboBox.addItem(listkythuat);
				}
			}
		});

		chckbxNewCheckBox_2 = new JCheckBox("Ky thuat");
		panel.add(chckbxNewCheckBox_2);

		rdbtnNewRadioButton_2 = new JRadioButton("Ky su");
		buttonGroup.add(rdbtnNewRadioButton_2);
		panel.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				if (rdbtnNewRadioButton_2.isSelected()) {
					comboBox.addItem(listcokhi);
				}
			}
		});

		chckbxNewCheckBox = new JCheckBox("Nghe nhac");
		panel.add(chckbxNewCheckBox);
	}

}
