package fisica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Velocidad extends JPanel{
	private JPanel panelCalculo, panelResultado;
	private JButton btnCalcular;
	private JLabel labDistancia, labTiempo, labResultado, labResultadoC;
	private JTextField jtfDistancia, jtfTiempo;
	
	public Velocidad (){
		
		setLayout(new BorderLayout());
		
		panelCalculo = new JPanel();
		add(panelCalculo, BorderLayout.NORTH);
		panelResultado = new JPanel();
		add(panelResultado, BorderLayout.CENTER);
		
		TitledBorder border = BorderFactory.createTitledBorder("  Calcular Velocidad  (v = d / t)  ");
		border.setTitleColor(Color.BLACK);
		panelCalculo.setBorder(border);
		
		labDistancia = new JLabel("Distancia");
		jtfDistancia = new JTextField();
		jtfDistancia.setPreferredSize(new Dimension(70,18));
		labTiempo = new JLabel("Tiempo");
		jtfTiempo = new JTextField();
		jtfTiempo.setPreferredSize(new Dimension(70,18));
		
		btnCalcular = new JButton("Calcular");
		AccionBoton oyenteBtnCalcular = new AccionBoton();
		btnCalcular.addActionListener(oyenteBtnCalcular);
		
		panelCalculo.add(labDistancia);
		panelCalculo.add(jtfDistancia);
		panelCalculo.add(labTiempo);
		panelCalculo.add(jtfTiempo);
		panelCalculo.add(btnCalcular);
		
		Border borde = BorderFactory.createLineBorder(Color.black);
		
		labResultado = new JLabel("Velocidad ");
	    labResultadoC = new JLabel(" 0.0");
		labResultadoC.setPreferredSize(new Dimension(150,30));
		labResultadoC.setBorder(borde);
		panelResultado.add(labResultado);
		panelResultado.add(labResultadoC);
	}
	
        
        class AccionBoton implements ActionListener{
        	public void actionPerformed(ActionEvent e) {
        		
                if ( ((JButton) e.getSource()) == btnCalcular) {
                	System.out.println("Presionaste un botón " + ((JButton) e.getSource()).getText());
                	
                  String d =  jtfDistancia.getText();
                  float di = Float.parseFloat(d);
                  String t =  jtfTiempo.getText();
                  float ti = Float.parseFloat(t);
                  
                 float r = di/ti;
                 
               //System.out.println(r+" "+ di+" "+ ti);
                 labResultadoC.setText(" "+r);
            }
        }
	}
	}
