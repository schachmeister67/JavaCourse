package atm;

import javax.swing.JOptionPane;

public class InsufficientFunds extends Exception {

	private static final long serialVersionUID = -3728631924512356686L;

	public InsufficientFunds() {
        JOptionPane frame = new JOptionPane();
        JOptionPane.showMessageDialog(frame, "Insufficient Funds!");
    }
}

