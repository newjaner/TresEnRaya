import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JCheckBox;

public class Tuning extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tuning frame = new Tuning();
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
	public Tuning() {
		setTitle("Taller de TuNingGGGGGGG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 748);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("TALLER TuNing");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panelSur = new JPanel();
		contentPane.add(panelSur, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Enviar");
		panelSur.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		panelSur.add(btnNewButton_1);
		
		JPanel panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new BoxLayout(panelCentral, BoxLayout.Y_AXIS));
		
		JPanel panelDatos = new JPanel();
		panelCentral.add(panelDatos);
		panelDatos.setLayout(new GridLayout(6, 2, 0, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(lblNewLabel_1);
		
		textField = new JTextField();
		panelDatos.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		panelDatos.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		panelDatos.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Provincia:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		panelDatos.add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Edad:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		panelDatos.add(comboBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo:");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(lblNewLabel_6);
		
		JPanel panelSexo = new JPanel();
		panelDatos.add(panelSexo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hombre");
		panelSexo.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Mujer");
		panelSexo.add(rdbtnNewRadioButton_1);
		
		JPanel panelPrefs = new JPanel();
		panelCentral.add(panelPrefs);
		panelPrefs.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblNewLabel_11 = new JLabel("Preferencias:");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		panelPrefs.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		panelPrefs.add(lblNewLabel_12);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Tunning");
		panelPrefs.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Equipamiento");
		panelPrefs.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		panelPrefs.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("New check box");
		panelPrefs.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("New check box");
		panelPrefs.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("New check box");
		panelPrefs.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("New check box");
		panelPrefs.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("New check box");
		panelPrefs.add(chckbxNewCheckBox_7);
		
		JPanel panelComent = new JPanel();
		panelCentral.add(panelComent);
		panelComent.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Comentarios:");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		panelComent.add(lblNewLabel_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelComent.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel_8 = new JLabel("");
		panelComent.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		panelComent.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Pedidos:");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
		panelComent.add(lblNewLabel_10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelComent.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
	}

}
