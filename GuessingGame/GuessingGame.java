package guessinggame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {

	private static final long serialVersionUID = 1938875539574224406L;
	
	private JTextField txtGuess;
    private JLabel lblOutput;
    private int theNumber;
    private int numberOfTries;
    public void checkGuess(){
        String guessText = txtGuess.getText();
        String message = "";
        try {
            int guess = Integer.parseInt(guessText);
            numberOfTries++;
            if (guess < theNumber)
                message = guess + " is too low. Try again.";
            else if (guess > theNumber)
                message = guess + " is too high. Try again.";
            else {
                message = guess + 
                        " is correct. You win after " + numberOfTries
                        + " tries!";
                newGame();
            }
        } catch (Exception e){
            message = "Enter a whole number between 1 and 100.";
        } finally {
            lblOutput.setText(message);
            txtGuess.requestFocus();
            txtGuess.selectAll();
        }
    }
    public void newGame() {
        theNumber = (int)(Math.random() * 100 + 1);
        numberOfTries = 0;
    }
    public GuessingGame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hi-Lo Guessing Game");
        getContentPane().setLayout(null);

        JLabel lblHiloGuessingGame = new JLabel("Hi-Lo Guessing Game");
        lblHiloGuessingGame.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblHiloGuessingGame.setHorizontalAlignment(SwingConstants.CENTER);
        lblHiloGuessingGame.setBounds(10, 37, 414, 24);
        getContentPane().add(lblHiloGuessingGame);

        JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100:");
        lblGuessANumber.setHorizontalAlignment(SwingConstants.RIGHT);
        lblGuessANumber.setBounds(10, 98, 272, 14);
        getContentPane().add(lblGuessANumber);

        txtGuess = new JTextField();
        txtGuess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        txtGuess.setBounds(292, 95, 43, 20);
        getContentPane().add(txtGuess);
        txtGuess.setColumns(10);

        JButton btnGuess = new JButton("Guess!");
        btnGuess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        btnGuess.setBounds(172, 149, 89, 23);
        getContentPane().add(btnGuess);

        lblOutput = new JLabel("Enter a number above, and click Guess!");
        lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
        lblOutput.setBounds(10, 209, 414, 14);
        getContentPane().add(lblOutput);
        
    }
    public static void main(String[] args) {
        GuessingGame theGame = new GuessingGame();
        theGame.newGame();
        theGame.setSize(new Dimension(450,300));
        theGame.setVisible(true);

    }
}
