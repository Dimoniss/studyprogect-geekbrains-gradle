package javaPart1.eightLesson;

import javax.swing.*;

public class MainTicTacToe extends JFrame {
    public MainTicTacToe() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setResizable(false);
        setLayout(null);


        JButton btnNewGame = new JButton("New game");
        JButton btnSetSettings = new JButton("Set settings");
        JTextField tfTypeChar = new JTextField();
        JTextField tfPlayingFieldSize = new JTextField();
        tfTypeChar.setBounds(20, 20, 120, 32);
        tfPlayingFieldSize.setBounds(20, 60, 120, 32);
        btnSetSettings.setBounds(160, 20, 120, 32);
        btnNewGame.setBounds(160, 60, 120, 32);

        add(btnNewGame);
        add(btnSetSettings);
        add(tfTypeChar);
        add(tfPlayingFieldSize);
        setVisible(true);
    }


    public static void main(String[] args) {
        new MainTicTacToe();
    }


}
