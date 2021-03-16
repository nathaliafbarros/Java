package jogodogenio;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class JogoDoGenio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnPalpite;
	private JSpinner spinnerNumero;
	private JLabel lblResultado;
	private JLabel lblFrase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoDoGenio frame = new JogoDoGenio();
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
	public JogoDoGenio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Nath\u00E1lia Barros\\Curso Java GUANABARA\\JogoDoGenio\\src\\imagens\\genio.png"));
		lblNewLabel.setBounds(0, 0, 200, 228);
		contentPane.add(lblNewLabel);
		
		spinnerNumero = new JSpinner();
		spinnerNumero.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		spinnerNumero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		spinnerNumero.setBounds(302, 200, 61, 24);
		contentPane.add(spinnerNumero);
		
		JLabel lblNewLabel_1 = new JLabel("Valor");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(245, 197, 47, 32);
		contentPane.add(lblNewLabel_1);
		
		btnPalpite = new JButton("Palpite");
		btnPalpite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero = Integer.parseInt(spinnerNumero.getValue().toString());
				
				double aleatorio = Math.random();//O Math exige que se use double
				int ale = (int) (1 + aleatorio *(5-1)); //Convertendo de double para int com typecast
						
				String resultado = (numero==ale) ? "ACERTOU!!!" : "ERROOOOU";
				
				lblResultado.setFont(new Font("Arial Black", Font.PLAIN, 12));//Estou editando como o texto vai aparecer
				lblResultado.setText(resultado);
				
				
			}
		});
		btnPalpite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPalpite.setBounds(261, 235, 89, 23);
		contentPane.add(btnPalpite);
		
		lblResultado = new JLabel("");
		lblResultado.setBounds(286, 127, 102, 14);
		contentPane.add(lblResultado);
		
		lblFrase = new JLabel("Frase");
		lblFrase.setText("<html>Estou pensando num valor entre 1 e 5. <strong>Tente adivinhar!</strong></html>");
		lblFrase.setVerticalAlignment(SwingConstants.TOP);
		lblFrase.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrase.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFrase.setBounds(230, 11, 213, 105);
		contentPane.add(lblFrase);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Curso Java GUANABARA\\JogoDoGenio\\src\\imagens\\genio.png"));
		lblNewLabel_2.setBounds(10, 11, 202, 217);
		contentPane.add(lblNewLabel_2);
	}
}
