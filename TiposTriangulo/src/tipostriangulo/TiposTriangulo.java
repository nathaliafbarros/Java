package tipostriangulo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TiposTriangulo extends JFrame {

	private JPanel contentPane;
	private JLabel lblResA;
	private JLabel lblResB;
	private JLabel lblResC;
	private JButton btnVerificar;
	private JLabel lblSimNao;
	private JLabel lblTipo;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel;
	private JSlider sliderA;
	private JSlider sliderB;
	private JSlider sliderC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TiposTriangulo frame = new TiposTriangulo();
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
	public TiposTriangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("D:\\Curso Java GUANABARA\\TiposTriangulo\\src\\imagem\\primeira-classificacao-de-triangulos.jpg"));
		lblNewLabel.setBounds(68, 0, 300, 129);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Segmento A");
		lblNewLabel_1.setBounds(10, 161, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Segmento B");
		lblNewLabel_2.setBounds(10, 202, 82, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Segmento C");
		lblNewLabel_3.setBounds(10, 246, 82, 14);
		contentPane.add(lblNewLabel_3);
		
		lblResA = new JLabel("0");
		lblResA.setForeground(Color.DARK_GRAY);
		lblResA.setBounds(252, 161, 30, 14);
		contentPane.add(lblResA);
		
		lblResB = new JLabel("0");
		lblResB.setForeground(Color.DARK_GRAY);
		lblResB.setBounds(252, 202, 30, 14);
		contentPane.add(lblResB);
		
		lblResC = new JLabel("0");
		lblResC.setForeground(Color.DARK_GRAY);
		lblResC.setBounds(252, 246, 30, 14);
		contentPane.add(lblResC);
		
		btnVerificar = new JButton("verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				int a = sliderA.getValue();
				int b = sliderB.getValue();
				int c = sliderC.getValue();
				
				if(a<b+c && b<a+c && c<a+b) {
					lblSimNao.setText("É um triângulo");
					if(a==b && b==c) {
						lblTipo.setText("Equilátero");
					}else if(a!=b && b!=c && a!=c) {
						lblTipo.setText("Escaleno");
					}else {
						lblTipo.setText("Isósceles");
					}
				}else {
					lblSimNao.setText("Não forma um triângulo");
					lblTipo.setText("---");
				} 
			}
		});
		btnVerificar.setBounds(135, 284, 89, 23);
		contentPane.add(btnVerificar);
		
		panel = new JPanel();
		panel.setVisible(false);
		panel.setBounds(277, 161, 225, 122);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblTipo = new JLabel("\u00C9 do tipo equil\u00E1tero");
		lblTipo.setBounds(31, 61, 142, 30);
		panel.add(lblTipo);
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblSimNao = new JLabel("N\u00E3o \u00E9 um tri\u00E2ngulo");
		lblSimNao.setBounds(31, 11, 184, 25);
		panel.add(lblSimNao);
		lblSimNao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		sliderA = new JSlider();
		sliderA.setValue(0);
		sliderA.setMaximum(20);
		sliderA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblResA.setText(Integer.toString(sliderA.getValue()));
			}
		});
		sliderA.setBounds(100, 157, 142, 23);
		contentPane.add(sliderA);
		
		sliderB = new JSlider();
		sliderB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblResB.setText(Integer.toString(sliderB.getValue()));
			}
		});
		sliderB.setValue(0);
		sliderB.setMaximum(20);
		sliderB.setBounds(102, 198, 142, 23);
		contentPane.add(sliderB);
		
		sliderC = new JSlider();
		sliderC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblResC.setText(Integer.toString(sliderC.getValue()));
			}
		});
		sliderC.setValue(0);
		sliderC.setMaximum(20);
		sliderC.setBounds(102, 242, 142, 23);
		contentPane.add(sliderC);
	}
}
