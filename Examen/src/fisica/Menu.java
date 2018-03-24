package fisica;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Menu extends JFrame{
    private Velocidad velocidad;
    private Distancia distancia;
    private Tiempo tiempo;

    public Menu() {
    	
    	Container contentPane = getContentPane();
		setTitle("Formulario");
		setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		setSize(500,500);
		setResizable(false);
		
		velocidad = new Velocidad();
    	contentPane.add(velocidad);
    	
    	distancia = new Distancia();
    	contentPane.add(distancia);
    	
    	tiempo = new Tiempo();
    	contentPane.add(tiempo);
                  
    }
    public static void main(String[] ar) {
        Menu formulario=new Menu();
        formulario.setBounds(200,200,500,500);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
