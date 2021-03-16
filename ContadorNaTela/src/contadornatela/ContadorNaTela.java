package contadornatela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

public class ContadorNaTela extends JFrame {

	private JPanel contentPane;
	private JLabel lblInicio;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JSlider sliderFim;
	private JLabel lblFim;
	private JSlider sliderPasso;
	private JLabel lblPasso;
	private JSlider sliderInicio;
	private JPanel panel;
	private JLabel lblLista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContadorNaTela frame = new ContadorNaTela();
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
	public ContadorNaTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		sliderInicio = new JSlider();
		sliderInicio.setValue(0);
		sliderInicio.setMaximum(5);
		sliderInicio.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int i = sliderInicio.getValue();
				lblInicio.setText(Integer.toString(i));
			}
		});
		sliderInicio.setBounds(64, 48, 200, 23);
		contentPane.add(sliderInicio);
		
		lblInicio = new JLabel("0");
		lblInicio.setBounds(267, 52, 19, 14);
		contentPane.add(lblInicio);
		
		lblNewLabel = new JLabel("In\u00EDcio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Fim");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 102, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Passo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 153, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		sliderFim = new JSlider();
		sliderFim.setValue(6);
		sliderFim.setMaximum(20);
		sliderFim.setMinimum(6);
		sliderFim.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int fim = sliderFim.getValue();
				lblFim.setText(Integer.toString(fim));
			}
		});
		sliderFim.setBounds(64, 98, 200, 23);
		contentPane.add(sliderFim);
		
		lblFim = new JLabel("6");
		lblFim.setBounds(267, 102, 19, 14);
		contentPane.add(lblFim);
		
		sliderPasso = new JSlider();
		sliderPasso.setValue(1);
		sliderPasso.setMaximum(4);
		sliderPasso.setMinimum(1);
		sliderPasso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int passo = sliderPasso.getValue();
				lblPasso.setText(Integer.toString(passo));
			}
		});
		sliderPasso.setBounds(64, 149, 200, 23);
		contentPane.add(sliderPasso);
		
		lblPasso = new JLabel("1");
		lblPasso.setBounds(267, 153, 19, 14);
		contentPane.add(lblPasso);
		
		JButton btnContar = new JButton("Contar");
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = sliderInicio.getValue(); //Preciso puxar essas variáveis de novo pq não funcionam fora daqui
				int fim = sliderFim.getValue();
				int passo = sliderPasso.getValue();
				String texto = "";
								
				for(int c = i; c <= fim; c += passo) {
					texto = texto + c + " "; 
				}
				
				lblLista.setText(texto);
				
			}
		});
		btnContar.setBounds(309, 100, 89, 23);
		contentPane.add(btnContar);
		
		panel = new JPanel();
		panel.setBounds(10, 197, 414, 39);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblLista = new JLabel("");
		lblLista.setBounds(10, 11, 394, 14);
		panel.add(lblLista);
	}
}
