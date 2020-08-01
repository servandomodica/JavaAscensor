import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ascensor extends JFrame {

	private JPanel contentPane;
	private JLabel label2;
	private JLabel label4;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ascensor frame = new Ascensor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Ascensor() {
		setTitle("Ascensor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 518);
		
		JMenuBar menuBar_1 = new JMenuBar();
		setJMenuBar(menuBar_1);
		
		JMenu mnPisos = new JMenu("Pisos");
		menuBar_1.add(mnPisos);
		
		JMenuItem mntmPiso = new JMenuItem("Piso 1");
		mntmPiso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String dato = label2.getText();
				int piso = Integer.parseInt(dato);
				
				if (piso>1)
				{
					label4.setText("Baja");
					label2.setText("1");
				}
				else
							label4.setText("Mismo piso");
				y = 0;
				repaint();
			}
		});
		mnPisos.add(mntmPiso);
		
		JMenuItem mntmPiso_1 = new JMenuItem("Piso 2");
		mntmPiso_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String dato = label2.getText();
				int piso = Integer.parseInt(dato);
				
				if (piso<2)
				{
					label4.setText("Sube");
					label2.setText("2");
				}
				else
					if (piso>2)
					{
						label4.setText("Baja");
						label2.setText("2");
					}
					else
							label4.setText("Mismo piso");
				y = 60;
				repaint();
			}
		});
		mnPisos.add(mntmPiso_1);
		
		JMenuItem mntmPiso_2 = new JMenuItem("Piso 3");
		mntmPiso_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String dato = label2.getText();
				int piso = Integer.parseInt(dato);
				
				if (piso<3)
				{
					label4.setText("Sube");
					label2.setText("3");
				}
				else
					if (piso>3)
					{
						label4.setText("Baja");
						label2.setText("3");
					}
					else
							label4.setText("Mismo piso");
				y = 120;
				repaint();
			}
		});
		mnPisos.add(mntmPiso_2);
		
		JMenuItem mntmPiso_3 = new JMenuItem("Piso 4");
		mntmPiso_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String dato = label2.getText();
				int piso = Integer.parseInt(dato);
				
				if (piso<4)
				{
					label4.setText("Sube");
					label2.setText("4");
				}
				else
							label4.setText("Mismo piso");
				y = 180;
				repaint();
			}
		});
		mnPisos.add(mntmPiso_3);
		
		JMenu mnAcercaDe = new JMenu("Acerca de");
		menuBar_1.add(mnAcercaDe);
		
		JMenuItem mntmDatosDelProgramador = new JMenuItem("Datos del programador");
		mntmDatosDelProgramador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				Dialogo d = new Dialogo();
				d.setModal(true);
				d.setResizable(false);
				d.setVisible(true);
			}
		});
		mnAcercaDe.add(mntmDatosDelProgramador);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnAcercaDe.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("1");
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBackground(Color.GREEN);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String dato = label2.getText();
				int piso = Integer.parseInt(dato);
				
				if (piso>1)
				{
					label4.setText("Baja");
					label2.setText("1");
				}
				else
							label4.setText("Mismo piso");
				y = 0;
				repaint();
			}

		});
		button.setBounds(10, 328, 69, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_1.setBackground(Color.YELLOW);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
			String dato = label2.getText();
			int piso = Integer.parseInt(dato);
			
			if (piso<2)
			{
				label4.setText("Sube");
				label2.setText("2");
			}
			else
				if (piso>2)
				{
					label4.setText("Baja");
					label2.setText("2");
				}
				else
						label4.setText("Mismo piso");
			y = 60;
			repaint();
			}
		}
			
		);
		button_1.setBounds(10, 267, 69, 50);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_2.setBackground(Color.ORANGE);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String dato = label2.getText();
				int piso = Integer.parseInt(dato);
				
				if (piso<3)
				{
					label4.setText("Sube");
					label2.setText("3");
				}
				else
					if (piso>3)
					{
						label4.setText("Baja");
						label2.setText("3");
					}
					else
							label4.setText("Mismo piso");
				y = 120;
				repaint();
			}
		});
		button_2.setBounds(10, 206, 69, 50);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_3.setBackground(Color.RED);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String dato = label2.getText();
				int piso = Integer.parseInt(dato);
				
				if (piso<4)
				{
					label4.setText("Sube");
					label2.setText("4");
				}
				else
							label4.setText("Mismo piso");
				y = 180;
				repaint();
			}
		});
		button_3.setBounds(10, 145, 69, 50);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Salir");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_4.setBackground(Color.DARK_GRAY);
		button_4.setForeground(Color.BLACK);
		button_4.setBounds(10, 420, 414, 30);
		contentPane.add(button_4);
		
		JLabel label1 = new JLabel("Piso");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label1.setBounds(262, 124, 69, 14);
		contentPane.add(label1);
		
		JLabel label3 = new JLabel("Dirección");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label3.setBounds(262, 328, 162, 14);
		contentPane.add(label3);
		
		label2 = new JLabel("1");
		label2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setForeground(Color.BLUE);
		label2.setOpaque(true);
		label2.setBackground(Color.LIGHT_GRAY);
		label2.setBounds(262, 145, 69, 50);
		contentPane.add(label2);
		
		label4 = new JLabel("- - - - -");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label4.setBackground(Color.ORANGE);
		label4.setOpaque(true);
		label4.setBounds(262, 353, 162, 56);
		contentPane.add(label4);
	}
	
	
	int y = 0; // los otros valores serán 60, 120, 180 para piso 2, 3 y 4 respectivamente
			
	public void paint (Graphics g)
	{
		super.paint(g);
				
		g.setColor(Color.white);
		g.fillRect(100,200,40,230);
		
		g.setColor(Color.red);
		g.fillRect(105,390-y,30,35);
				
		g.setColor(Color.blue);
		g.drawRect(100,200,40,230);
		
		
	}
		
	
}
   