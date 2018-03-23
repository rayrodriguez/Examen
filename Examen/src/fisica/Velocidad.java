package fisica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Velocidad extends JPanel{
	private JPanel panelCalculo, panelResultado;
	private JButton btnCalcular;
	private JLabel labDistancia, labTiempo;
	private JTextField jtfDistancia, jtfTiempo;
	
	public Velocidad (){
		
		setLayout(new BorderLayout());
		
		panelCalculo = new JPanel();
		add(panelCalculo, BorderLayout.NORTH);
		panelResultado = new JPanel();
		add(panelResultado, BorderLayout.SOUTH);
		
		TitledBorder border = BorderFactory.createTitledBorder("Calcular Velocidad");
		border.setTitleColor(Color.BLACK);
		panelCalculo.setBorder(border);
		
		labDistancia = new JLabel("Distancia");
		jtfDistancia = new JTextField();
		jtfDistancia.setPreferredSize(new Dimension(70,18));
		labTiempo = new JLabel("Tiempo");
		jtfTiempo = new JTextField();
		jtfTiempo.setPreferredSize(new Dimension(70,18));
		btnCalcular = new JButton("Calcular");
		
		panelCalculo.add(labDistancia);
		panelCalculo.add(jtfDistancia);
		panelCalculo.add(labTiempo);
		panelCalculo.add(jtfTiempo);
		panelCalculo.add(btnCalcular);
		
		
		
	}

}
