package geek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Programa {

	public static void main(String[] args) {
		final String USER = "geek";
		final String PASS = "university";
		
		JFrame frame = new JFrame("Geek University :: Acesso ao Sistema");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		JLabel lblUsusario = new JLabel("Usu�rio: ");
		JTextField txtUsuario = new JTextField(20);
		txtUsuario.setToolTipText("Informe seu usu�rio de acesso.");
		
		JLabel lblsenha = new JLabel("Senha: ");
		JPasswordField txtSenha = new JPasswordField(20);
		txtSenha.setToolTipText("Informo sua senha de acesso.");
		
		JButton btnLogin = new JButton("Login");
		
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(txtUsuario.getText().equals(USER) && new String(txtSenha.getPassword()).equals(PASS)) {
					JOptionPane.showMessageDialog(frame, "Acesso autorizado");
				}else {
					JOptionPane.showMessageDialog(frame, "Acesso negado");
				}				
			}
		});
		
				
		panel.add(lblUsusario);
		panel.add(txtUsuario);
		
		panel.add(lblsenha);
		panel.add(txtSenha);
		
		panel.add(btnLogin);
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);

	}

}
