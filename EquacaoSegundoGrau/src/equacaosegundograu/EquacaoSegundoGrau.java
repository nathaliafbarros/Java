package equacaosegundograu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class EquacaoSegundoGrau extends JFrame {

	private JPanel contentPane;
	private JLabel lblResultadoDelta;
	private Panel panelResultados;
	private JLabel lblResultadoTipo;
	private JLabel lblB;
	private JLabel lblC;
	private JLabel lblA;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EquacaoSegundoGrau frame = new EquacaoSegundoGrau();
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
	public EquacaoSegundoGrau() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinnerA = new JSpinner();
		spinnerA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(spinnerA.getValue().toString());
			}
		});
		spinnerA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinnerA.setBounds(10, 66, 54, 20);
		contentPane.add(spinnerA);
		
		JLabel lblNewLabel = new JLabel("x\u00B2 + ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(74, 69, 46, 14);
		contentPane.add(lblNewLabel);
		
		JSpinner spinnerB = new JSpinner();
		spinnerB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(spinnerB.getValue().toString());
			}
		});
		spinnerB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinnerB.setBounds(114, 66, 54, 20);
		contentPane.add(spinnerB);
		
		JLabel lblNewLabel_1 = new JLabel("x + ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(178, 69, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JSpinner spinnerC = new JSpinner();
		spinnerC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(spinnerC.getValue().toString());
			}
		});
		spinnerC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinnerC.setBounds(213, 66, 54, 20);
		contentPane.add(spinnerC);
		
		JLabel lblNewLabel_2 = new JLabel("= 0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(278, 69, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton = new JButton("<html>calcular &Delta;</html>");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelResultados.setVisible(true);
				
				int numeroA = Integer.parseInt(spinnerA.getValue().toString());
				int numeroB = Integer.parseInt(spinnerB.getValue().toString());
				int numeroC = Integer.parseInt(spinnerC.getValue().toString());
				
				Double resultadoDelta = Math.pow(numeroB, 2) - 4*numeroA*numeroC; //Calculando Delta
				//lblResultadoDelta.setText(Double.toString(resultadoDelta)); //Convertendo double para string
				lblResultadoDelta.setText(String.format("%.1f", resultadoDelta)); //Formatado com duas casas fica melhor
				
				if(resultadoDelta < 0) {
					lblResultadoTipo.setText("Não existem raízes reais");
				}else {
					lblResultadoTipo.setText("Existem raízes reais");
				}
				
							
			}
			
		});
		btnNewButton.setBounds(114, 141, 110, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblDelta = new JLabel("");
		lblDelta.setText("<html>&Delta; = </html>");
		lblDelta.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblDelta.setBounds(10, 116, 46, 14);
		contentPane.add(lblDelta);
		
		panelResultados = new Panel();
		panelResultados.setVisible(false);
		panelResultados.setBounds(10, 191, 314, 61);
		contentPane.add(panelResultados);
		panelResultados.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("<html>&Delta; = </html>");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 11, 46, 14);
		panelResultados.add(lblNewLabel_3);
		
		lblResultadoDelta = new JLabel("New label");
		lblResultadoDelta.setForeground(Color.BLUE);
		lblResultadoDelta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResultadoDelta.setBounds(38, 11, 71, 14);
		panelResultados.add(lblResultadoDelta);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo de raízes = ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 31, 100, 25);
		panelResultados.add(lblNewLabel_4);
		
		lblResultadoTipo = new JLabel("New label");
		lblResultadoTipo.setForeground(Color.BLUE);
		lblResultadoTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResultadoTipo.setBounds(112, 36, 192, 14);
		panelResultados.add(lblResultadoTipo);
		
		lblB = new JLabel("B");
		lblB.setForeground(Color.RED);
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblB.setBounds(37, 116, 29, 14);
		contentPane.add(lblB);
		
		lblC = new JLabel("C");
		lblC.setForeground(Color.RED);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblC.setBounds(114, 116, 29, 14);
		contentPane.add(lblC);
		
		lblA = new JLabel("A");
		lblA.setForeground(Color.RED);
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblA.setBounds(88, 116, 10, 14);
		contentPane.add(lblA);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setText("<html><sup>2</sup> - 4 . </html>");
		lblNewLabel_8.setBounds(47, 109, 46, 23);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel(".");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(102, 116, 18, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_5 = new JLabel("F\u00D3RMULA DE BHASKARA");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(96, 11, 241, 36);
		contentPane.add(lblNewLabel_5);
	}
}
