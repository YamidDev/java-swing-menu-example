import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class WindowMenu implements ActionListener  {
	JFrame window;
	JMenu archivo, editar, nuevo;
	JMenuItem abrir, proyecto, proyectojava, salir;
	JMenuBar menubar;

	public WindowMenu() {
		createMenu();
		createWindow();
	}
	
	public void createMenu() {
		
		menubar = new JMenuBar();
		
		archivo = new JMenu("Archivo");
		editar = new JMenu("Editar");
		nuevo = new JMenu("Nuevo");
		
		proyectojava = new JMenuItem("Proyecto Java");
		proyecto = new JMenuItem("Proyecto");
		salir = new JMenuItem("Salir");
		abrir = new JMenuItem("Abrir Archivo");
		
				
		menubar.add(archivo);
		menubar.add(editar);
		
		archivo.add(nuevo);
		archivo.add(abrir);
		archivo.add(salir);
		
		nuevo.add(proyectojava);
		nuevo.add(proyecto);
		proyectojava.addActionListener(this);
		salir.addActionListener(this);		
	}
	
	@SuppressWarnings("static-access")
	public void createWindow() {
		window = new JFrame("Bienvenidos");
		window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));
		window.setSize(400, 400);
		window.setVisible(true);
		window.setJMenuBar(menubar);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
	}
	
	public void destroyWindow() {
		window.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if ( e.getSource()==salir) {
			destroyWindow();
		}
	}

}
