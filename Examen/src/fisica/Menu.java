package fisica;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Menu extends JFrame implements ActionListener{
    private Velocidad velocidad;
    private Distancia distancia;
    private Tiempo tiempo;
	private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1,mi2,mi3;
    public Menu() {
        setLayout(null);
        mb=new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Opciones");
        mb.add(menu1);
        
        mi1=new JMenuItem("Velocidad");
        mi1.addActionListener(this);
        menu1.add(mi1);
        
        mi2=new JMenuItem("Distancia");
        mi2.addActionListener(this);
        menu1.add(mi2);
        
        mi3=new JMenuItem("Tiempo");
        mi3.addActionListener(this);
        menu1.add(mi3);               
    }
    
    public void actionPerformed(ActionEvent e) {
    	Container f=this.getContentPane();
    	setLayout(new BoxLayout(f, BoxLayout.Y_AXIS));
		setSize(400,400);
        if (e.getSource()==mi1) {
        	velocidad = new Velocidad();
        	f.add(velocidad);
            //f.setBackground(new Color(255,0,0));
            
        }
        if (e.getSource()==mi2) {
        	distancia = new Distancia();
        	f.add(distancia);
            //f.setBackground(new Color(0,255,0));
        }
        if (e.getSource()==mi3) {
        	tiempo = new Tiempo();
        	f.add(tiempo);
            //f.setBackground(new Color(0,0,255));
        }
        
    }
    
    public static void main(String[] ar) {
        Menu formulario1=new Menu();
        formulario1.setBounds(10,20,300,200);
        formulario1.setVisible(true);
    }    
}