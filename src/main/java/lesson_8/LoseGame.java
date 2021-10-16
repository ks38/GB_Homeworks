package lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoseGame extends JFrame {

    private JTextField newGameTextField;
    private JButton newGameButton;

    public LoseGame() {
        setTitle("Вы проиграли!");
        setBounds(600, 300, 500, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        Font fon = new Font("Arial", Font.ITALIC, 20);

        newGameTextField = new JTextField();
        add(newGameTextField, BorderLayout.NORTH);
        newGameTextField.setEnabled(false);
        newGameTextField.setFont(fon);
        newGameTextField.setText("Вы проиграли. Хотите сыграть заново?");
        newGameTextField.setHorizontalAlignment(SwingConstants.CENTER);

        newGameButton = new JButton();
        add(newGameButton, BorderLayout.CENTER);
        newGameButton.setText("Начать новую игру.");
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new GuessTheNumber();
            }
        });

        setVisible(true);
    }
}
