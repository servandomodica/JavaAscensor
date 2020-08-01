import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Dialogo extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public Dialogo() {
		setTitle("Acerca de...");
		setBounds(100, 100, 450, 163);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Programa Versi\u00F3n: 1.0");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(51, 11, 324, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Programador: Servando Andr\u00E9s M\u00F3dica");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(51, 36, 324, 31);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JButton btnNewButton = new JButton("Retornar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0)
				{
					dispose();
				}
			});
			btnNewButton.setBounds(51, 78, 324, 31);
			contentPanel.add(btnNewButton);
		}
	}

}
