package lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessTheNumber extends JFrame {
    private int randomNumber;
    private JTextField textField;
    private int attempts = 3;

    public GuessTheNumber() {

        randomNumber = (int) (Math.random() * 10) + 1;

        setTitle("Угадайте число");
        setBounds(600, 300, 600, 140);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 13);
        Font font2 = new Font("Arial", Font.ITALIC, 20);

        textField.setText("Угадайте число от 1 до 10. У вас " + attempts + " попытки.");
        textField.setEnabled(false);
        textField.setFont(font2);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.SOUTH);

        JButton resetButton = new JButton("Начать заново");
        resetButton.setFont(font);
        add(resetButton, BorderLayout.NORTH);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new GuessTheNumber();
            }
        });
        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button, BorderLayout.SOUTH);
            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex, button);
                }
            });
        }
        setVisible(true);
    }

    public void tryToAnswer(int answer, JButton button) {
        if (answer == randomNumber) {
            dispose();
            new WinGame();
        }
        if (answer > randomNumber) {
            textField.setText("Нет, загаданное число меньше! Попыток осталось: " + (attempts - 1));
            button.setBackground(Color.RED);

        } else if (answer < randomNumber) {
            textField.setText("Нет! Загаданное число больше! Попыток осталось: " + (attempts - 1));
            button.setBackground(Color.RED);
        }
        attempts--;
        if (attempts == 0 && answer != randomNumber) {
            dispose();
            new LoseGame();
        }
    }
}



