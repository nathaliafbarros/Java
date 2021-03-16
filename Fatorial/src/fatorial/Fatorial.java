package fatorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;

public class Fatorial extends JFrame {

	private JPanel contentPane;
	private JSpinner spinnerFatorial;
	private JLabel lblResultado;
	private JLabel lblResultadoTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fatorial frame = new Fatorial();
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
	public Fatorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		spinnerFatorial = new JSpinner();
		spinnerFatorial.setModel(new SpinnerNumberModel(0, null, 12, 1));
		spinnerFatorial.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int numero = Integer.parseInt(spinnerFatorial.getValue().toString());
				int contador = numero;
				int fatorial = 1;
				String texto = "";
				
				while(contador >= 1) {  //contagem regressiva do numero(que eu escolher) até o 1 
					fatorial = fatorial*contador; //simplificando fatorial *= contador
 					
 					texto = texto + contador + " x "; //formatando para mostrar a fatoração
 					 					
 					contador--;
				}
				lblResultado.setText(Integer.toString(fatorial));
				
				lblResultadoTexto.setText(texto);
				
			}
		});
		spinnerFatorial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		spinnerFatorial.setBounds(21, 58, 59, 35);
		contentPane.add(spinnerFatorial);
		
		JLabel lblNewLabel = new JLabel("! = ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(88, 58, 42, 35);
		contentPane.add(lblNewLabel);
		
		lblResultado = new JLabel("1");
		lblResultado.setForeground(Color.RED);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblResultado.setBounds(132, 60, 174, 31);
		contentPane.add(lblResultado);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Curso Java GUANABARA\\Fatorial\\src\\imagem\\red-exclamation.jpg"));
		lblNewLabel_2.setBounds(316, 11, 174, 174);
		contentPane.add(lblNewLabel_2);
		
		lblResultadoTexto = new JLabel("");
		lblResultadoTexto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResultadoTexto.setBounds(10, 128, 296, 19);
		contentPane.add(lblResultadoTexto);
	}
}
