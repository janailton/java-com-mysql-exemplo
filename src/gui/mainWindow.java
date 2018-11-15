package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;
 
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

public class mainWindow extends JFrame {
	
	JMenuBar menuBar;
	JMenu menu, submenu;
	JMenuItem menuItemCinema; 
	JMenuItem menuItemMovie; 
	JMenuItem menuItemAdminCinema; 
	JMenuItem menuItemAdminMovie; 
	
	
	public mainWindow() {
		
		menuBar = new JMenuBar();
		menu = new JMenu("DB List");
		menu.setMnemonic(KeyEvent.VK_V);
		menuBar.add(menu);
		
		menuItemCinema = new JMenuItem("List of Cinemas");
		menu.add(menuItemCinema);
		
		menuItemMovie = new JMenuItem("List of Movies");
		menu.add(menuItemMovie);
		
		menuItemAdminCinema = new JMenuItem("Admin List of Cinemas");
		menu.add(menuItemAdminCinema);
		
		menuItemAdminMovie = new JMenuItem("Admin List of Movies");
		menu.add(menuItemAdminMovie);
		
		
		
		
		this.setJMenuBar(menuBar);
		this.setSize(1080, 720);
		this.setTitle("Cinema and Movie Application with JDBC");
		this.setVisible(true);
		
	}

}
