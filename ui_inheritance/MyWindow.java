import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWindow extends JFrame {
	// window properties
	// label for name and age
	private JLabel nameLbl = new JLabel("Name: ");
	private JLabel ageLbl = new JLabel("Age: ");

	// text fields for name and age
	protected JTextField nameTf = new JTextField(5);
	protected JTextField ageTf = new JTextField(2);

	// go button
	private JButton goBtn = new JButton("Go");

	// window constructor
	public MyWindow(String window_name) {
		// set container name
		super(window_name);

		// set layout
		setLayout(new FlowLayout(FlowLayout.LEFT));

		// event handler
		goBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int age;
				age = Integer.parseInt(ageTf.getText());
				int i;
				for(i = 0; i < age; i++) {
					System.out.println("Hello " + nameTf.getText());
				}
				JOptionPane.showMessageDialog(null, "Hello " + nameTf.getText(), "Simple", 0);
			}
		});

		// add objects to container
		add(nameLbl);
		add(nameTf);
		add(ageLbl);
		add(ageTf);
		add(goBtn);

		// set size
		setSize(500, 400);

		// set visibility
		setVisible(true);
	}
}
