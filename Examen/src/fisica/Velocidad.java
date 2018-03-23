package fisica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Velocidad extends JPanel{
	private JPanel panelCalculo, panelResultado;
	private JButton btnCalcular;
	private JLabel labDistancia, labTiempo, labResultado;
	private JTextField jtfDistancia, jtfTiempo, jtfResultado;
	private float r;
	
	public Velocidad (){
		
		setLayout(new BorderLayout());
		
		panelCalculo = new JPanel();
		add(panelCalculo, BorderLayout.NORTH);
		panelResultado = new JPanel();
		add(panelResultado, BorderLayout.CENTER);
		
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
		
		Border borde = BorderFactory.createLineBorder(Color.black);
		
		labResultado = new JLabel("Total");
	    jtfResultado = new JTextField();
		jtfResultado.setPreferredSize(new Dimension(150,30));
		jtfResultado.setBorder(borde);
		panelResultado.add(labResultado);
		panelResultado.add(jtfResultado);
		
	}
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnCalcular) {
        	
          String d =  jtfDistancia.getText();
          float di = Float.parseFloat(d);
          String t =  jtfDistancia.getText();
          float ti = Float.parseFloat(d);
          
          r = di/ti;
    }

	}
	}
