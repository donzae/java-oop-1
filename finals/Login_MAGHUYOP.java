import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login_MAGHUYOP extends JFrame implements ActionListener {
	// window properties

	protected JPanel upperPanel = new JPanel();
	protected JPanel northPanel = new JPanel();
	protected JPanel lowerPanel = new JPanel();

	// label for name and age
	private JLabel usernameLbl = new JLabel("Username");
	private JLabel passwordLbl = new JLabel("Password");

	// text fields for name and age
	protected JTextField usernameTf = new JTextField(10);
	protected JTextField passwordTf = new JTextField(10);

	// go button
	private JButton loginBtn = new JButton("Login");

	// window constructor
	public Login_MAGHUYOP(String window_name) {
		// set container name
		super(window_name);

		// set layout for the frame
		setLayout(new BorderLayout());

		// set layout north panel
		northPanel.setLayout(new GridLayout(2, 2));
		// north panel components
		northPanel.add(usernameLbl);
		northPanel.add(usernameTf);
		northPanel.add(passwordLbl);
		northPanel.add(passwordTf);


		// set layout upperpanel
		lowerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		lowerPanel.add(loginBtn);


		// add objects to frame container
		upperPanel.add(northPanel);
		add(upperPanel, BorderLayout.NORTH);
		add(lowerPanel, BorderLayout.CENTER);

		// event handler
		loginBtn.addActionListener(this);

		// set size
		setSize(300, 130);

		// set visibility
		setVisible(true);

		// close action
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Username : " + usernameTf.getText() + "\nPassword : " + passwordTf.getText());
	}
}
