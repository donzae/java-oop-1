import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginV2_MAGHUYOP extends Login_MAGHUYOP {

	// constructor
	LoginV2_MAGHUYOP(String window_name) {
		super(window_name);
	}

	public void actionPerformed(ActionEvent e) {
		if(usernameTf.getText().equals("Jose") && passwordTf.getText().equals("Rizal")) {
			JOptionPane.showMessageDialog(null, "Login Success !");
		} else {
			JOptionPane.showMessageDialog(null, "Failed !");
		}
	}
}
