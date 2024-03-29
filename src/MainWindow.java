import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.UIManager;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Component;
import javax.swing.Box;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainWindow {

	private JFrame frame;
	Tiles t1;
	Tiles t2;
	Tiles t3;
	Tiles t4;
	Tiles t5;
	Tiles t6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		// exit application, log  or ignore exception
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStartGame = new JMenuItem("Start Game");
		mntmStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// call all of our methods to actually run the game
				// from the TILES class
				// maybe create the tiles here
				// run the time method
				
				
			}
		});
		mnFile.add(mntmStartGame);
		
		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// reset the game board
			}
		});
		mnFile.add(mntmReset);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmChangeSize = new JMenuItem("Change Size");
		mntmChangeSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// user can change size of grid  EXTRA
			}
		});
		mnOptions.add(mntmChangeSize);
		
		JMenuItem mntmChangeImage = new JMenuItem("Change Image");
		mnOptions.add(mntmChangeImage);
		
		JMenuItem mntmChangeMusic = new JMenuItem("Change Music");
		mnOptions.add(mntmChangeMusic);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// call the tiles method to see what happens when clicked

			}
		});
		panel.setBackground(Color.BLACK);
		panel.setBounds(38, 11, 80, 80);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(170, 11, 80, 80);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(298, 11, 80, 80);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(38, 102, 80, 80);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_4.setBackground(Color.BLACK);
		panel_4.setBounds(170, 102, 80, 80);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_5.setBackground(Color.BLACK);
		panel_5.setBounds(298, 102, 80, 80);
		frame.getContentPane().add(panel_5);
		
		JTextPane txtpnScore = new JTextPane();
		txtpnScore.setText("SCORE: ");
		txtpnScore.setBounds(160, 195, 107, 20);
		frame.getContentPane().add(txtpnScore);
	}
}
