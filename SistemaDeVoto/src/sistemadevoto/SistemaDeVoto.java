package sistemadevoto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;

public class SistemaDeVoto extends JFrame {

	private JPanel contentPane;
	private JSpinner spinnerNascimento;
	private JButton btnVerificar;
	private JPanel panelVoto;
	private JLabel lblIdade;
	private JLabel lblVoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaDeVoto frame = new SistemaDeVoto();
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
	public SistemaDeVoto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insira seu ano de nascimento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 39, 202, 25);
		contentPane.add(lblNewLabel);
		
		spinnerNascimento = new JSpinner();
		spinnerNascimento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerNascimento.setBounds(222, 43, 94, 20);
		contentPane.add(spinnerNascimento);
		
		btnVerificar = new JButton("verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelVoto.setVisible(true);
				Calendar cal = Calendar.getInstance();
				int anoAtual = cal.get(Calendar.YEAR);
				
				int anoNascimento = Integer.parseInt(spinnerNascimento.getValue().toString());
				int idade = anoAtual - anoNascimento;
				
				lblIdade.setText(Integer.toString(idade));
				
				if(idade < 16) {
					lblVoto.setText("Seu voto é proibido");					
				}else {
					if((idade >= 16 && idade < 18) || (idade > 70)) {
						lblVoto.setText("Seu voto é facultativo");
				}else {
						if(idade >= 18 & idade <= 70) {
							lblVoto.setText("Seu voto é obrigatório");
						}
					}
				
				}
			}
		});
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVerificar.setBounds(123, 94, 119, 23);
		contentPane.add(btnVerificar);
		
		panelVoto = new JPanel();
		panelVoto.setVisible(false);
		panelVoto.setBounds(10, 155, 414, 96);
		contentPane.add(panelVoto);
		panelVoto.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Voc\u00EA tem ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 11, 68, 14);
		panelVoto.add(lblNewLabel_1);
		
		lblIdade = new JLabel("00");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdade.setBounds(78, 11, 24, 14);
		panelVoto.add(lblIdade);
		
		JLabel lblNewLabel_3 = new JLabel("anos");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(99, 11, 46, 14);
		panelVoto.add(lblNewLabel_3);
		
		lblVoto = new JLabel("New label");
		lblVoto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVoto.setBounds(10, 49, 280, 19);
		panelVoto.add(lblVoto);
	}
}
