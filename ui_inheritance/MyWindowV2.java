import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWindowV2 extends MyWindow {
	// window properties
	// go button
	JButton clearBtn = new JButton("Clear");

	// window constructor
	public MyWindowV2(String window_name) {
		// inherit all from MyWindow
		super(window_name);

		// event handler for clear button
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ageTf.setText("");
				nameTf.setText("");
			}
		});

		// add object to container
		add(clearBtn);
	}
}
