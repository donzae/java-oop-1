import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginV3_MAGHUYOP extends LoginV2_MAGHUYOP {

	protected JPasswordField passwordPf = new JPasswordField(10);

	// constructor
	LoginV3_MAGHUYOP(String window_name) {
		super(window_name);
		northPanel.remove(passwordTf);
		northPanel.add(passwordPf);
	}

	
	public void actionPerformed(ActionEvent e) {
	
		String password = new String(passwordPf.getPassword());

		if(usernameTf.getText().equals("Jose") && password.equals("Rizal")) {
			JOptionPane.showMessageDialog(null, "Login Success !");
		} else {
			JOptionPane.showMessageDialog(null, "Failed !");
		}
	}
}
