package tracker;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



import java.awt.*;


public class MainFrame extends JFrame {
	
	public MainFrame() {
        setTitle("Task Tracker");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        //Panel welcomePanel = new JPanel(new BorderLayout());

        // Begrüßungsnachricht oben
        JLabel welcomeLabel = new JLabel("Willkommen im Fortbildungsverwaltungssystem!", SwingConstants.CENTER);
        
        
        
    }

}
