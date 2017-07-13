import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;


/*TRIED TO ADD USER INTERFACE - UNSUCCESSFUL*/

public class Interface {

	airline a1 = new airline(380,"Ryanair");
	airline a2 = new airline(747,"BRITISH AIRWAYS");
	airline a3 = new airline(777,"Sky Express");
	
	//a1.airnmenu();
	//a2.airnmenu();
	//a3.airnmenu();	
	
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("380 Ryanair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a1.airnmenu();
				frame.dispose();
				AirlineMenu();
			}
		});
		btnNewButton.setBounds(144, 75, 138, 34);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblScotiaAirlines = new JLabel("Scotia Airlines - Main Menu");
		lblScotiaAirlines.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblScotiaAirlines.setHorizontalAlignment(SwingConstants.CENTER);
		lblScotiaAirlines.setBounds(114, 26, 200, 34);
		frame.getContentPane().add(lblScotiaAirlines);
		
		JButton btnBritishAirways = new JButton("747 British Airways");
		btnBritishAirways.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a2.airnmenu();
			}
		});
		btnBritishAirways.setBounds(144, 120, 138, 34);
		frame.getContentPane().add(btnBritishAirways);
		
		JButton btnSkyExpress = new JButton("777 Sky Express");
		btnSkyExpress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a3.airnmenu();
			}
		});
		btnSkyExpress.setBounds(144, 165, 138, 34);
		frame.getContentPane().add(btnSkyExpress);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(144, 210, 138, 41);
		frame.getContentPane().add(btnExit);
	}

	
	
	
	
	public void AirlineMenu()
	{
		//create frame object and size
		JFrame myFrame = new JFrame();
		myFrame.setSize(300, 350);
		//sets frame in middle of the screen when null value is set
		myFrame.setLocationRelativeTo(null);
		
		
		
		//need atleast one panel on a window, default will be full size of frame
		JPanel myPanel = new JPanel();
		
		myPanel.setLayout(new GridLayout(6, 1));
		
		
		JLabel title = new JLabel("Airline Menu", SwingConstants.CENTER);
		
		JButton DisplayAirlineBtn = new JButton("Display Airline");
		JButton ChooseFlightBtn =  new JButton("Choose Flight");
		JButton NumberofavailableseatsBtn = new JButton("Number of available seats ");
		JButton ReturntomMainMenuBtn = new JButton("Return to Main Menu");
		


		
		//add components to panel then panel to frame
		//order which items are added is the order that they will appear
		myPanel.add(title);
		myPanel.add(DisplayAirlineBtn);
		myPanel.add(ChooseFlightBtn);
		myPanel.add(NumberofavailableseatsBtn);
		myPanel.add(ReturntomMainMenuBtn);
		myFrame.getContentPane().add(myPanel);
		
		myFrame.setVisible(true);
	
	
	}
	
	
	
}
