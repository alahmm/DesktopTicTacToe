package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Objects;

public class TicTacToe extends JFrame {
    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(450, 450);
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        //setLayout(null); // sets absolute positioning of components
    }
    public static boolean isEmpty(String[][] matrix) {
        for (String[] array : matrix
        ) {
            for (String variable : array
            ) {
                if (Objects.equals(variable, " ")) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean Tester(String[][] matrix, String var) {
        boolean isWin = false;
        if (Objects.equals(matrix[0][0], var) && Objects.equals(matrix[0][1], var) && Objects.equals(matrix[0][2], var) ||
                Objects.equals(matrix[1][0], var) && Objects.equals(matrix[1][1], var) && Objects.equals(matrix[1][2], var)
                || Objects.equals(matrix[2][0], var) && Objects.equals(matrix[2][1], var) && Objects.equals(matrix[2][2], var)
                || Objects.equals(matrix[0][0], var) && Objects.equals(matrix[1][0], var) && Objects.equals(matrix[2][0], var)
                || Objects.equals(matrix[0][1], var) && Objects.equals(matrix[1][1], var) && Objects.equals(matrix[2][1], var)
                || Objects.equals(matrix[0][2], var) && Objects.equals(matrix[1][2], var) && Objects.equals(matrix[2][2], var)
                || Objects.equals(matrix[0][0], var) && Objects.equals(matrix[1][1], var) && Objects.equals(matrix[2][2], var)
                || Objects.equals(matrix[0][2], var) && Objects.equals(matrix[1][1], var) && Objects.equals(matrix[2][0], var)) {
            isWin = true;
        }
        return isWin;
    }
    public static String StatusProvider(List<JButton> array) {
        String s = " ";
        String[][] matrix = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = array.get(j + i * 3).getText();
            }
        }

        if (Tester(matrix, "O")) {
            s = "O wins";
            for (JButton button : array
            ) {
                button.setEnabled(false);
            }
        } else if (Tester(matrix, "X")) {
            s = "X wins";
            for (JButton button : array
            ) {
                button.setEnabled(false);
            }
        } else {
            if (!isEmpty(matrix)) {
                s = "Draw";
            } else {
                s = "Game in progress";
            }
        }
        return s;
    }
    public static void XOrO(JButton button, List<JButton> array) {
        int counterX = 0;
        int counterO = 0;
        for (JButton s : array
        ) {
            if (s.getText().equals("X")) {
                counterX++;
            } else if (s.getText().equals("O")) {
                counterO++;
            }
        }
        if (counterX <= counterO) {
            button.setText("X");
        } else {
            button.setText("O");
        }
    }
    public void initComponents() {

        JPanel panel = new JPanel(new GridLayout(3, 3, 5, 5));

        JPanel panel2 = new JPanel(new BorderLayout());

        JLabel LabelStatus = new JLabel();
        LabelStatus.setName("LabelStatus");
        LabelStatus.setText("Game is not started");

        JButton ButtonReset = new JButton();
        ButtonReset.setText("Reset");
        ButtonReset.setName("ButtonReset");
        ButtonReset.setFocusPainted(false);
        panel2.add(LabelStatus, BorderLayout.WEST);
        panel2.add(ButtonReset, BorderLayout.EAST);


        this.getContentPane().add(panel, BorderLayout.CENTER);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);

        JButton ButtonA3 = new JButton(" ");
        ButtonA3.setFont(ButtonA3. getFont(). deriveFont(40f));
        ButtonA3.setName("ButtonA3");
        ButtonA3.setBackground(Color.MAGENTA);
        panel.add(ButtonA3);

        JButton ButtonB3 = new JButton(" ");
        ButtonB3.setFont(ButtonB3. getFont(). deriveFont(40f));
        ButtonB3.setName("ButtonB3");
        ButtonB3.setBackground(Color.MAGENTA);
        panel.add(ButtonB3);

        JButton ButtonC3 = new JButton(" ");
        ButtonC3.setFont(ButtonC3. getFont(). deriveFont(40f));
        ButtonC3.setName("ButtonC3");
        ButtonC3.setBackground(Color.MAGENTA);
        panel.add(ButtonC3);

        JButton ButtonA2 = new JButton(" ");
        ButtonA2.setFont(ButtonA2. getFont(). deriveFont(40f));
        ButtonA2.setName("ButtonA2");
        ButtonA2.setBackground(Color.MAGENTA);
        panel.add(ButtonA2);

        JButton ButtonB2 = new JButton(" ");
        ButtonB2.setFont(ButtonB2. getFont(). deriveFont(40f));
        ButtonB2.setName("ButtonB2");
        ButtonB2.setBackground(Color.MAGENTA);
        panel.add(ButtonB2);

        JButton ButtonC2 = new JButton(" ");
        ButtonC2.setFont(ButtonC2. getFont(). deriveFont(40f));
        ButtonC2.setName("ButtonC2");
        ButtonC2.setBackground(Color.MAGENTA);
        panel.add(ButtonC2);

        JButton ButtonA1 = new JButton(" ");
        ButtonA1.setFont(ButtonA1. getFont(). deriveFont(40f));
        ButtonA1.setName("ButtonA1");
        ButtonA1.setBackground(Color.MAGENTA);
        panel.add(ButtonA1);
        ButtonA1.setOpaque(true);

        JButton ButtonB1 = new JButton(" ");
        ButtonB1.setFont(ButtonB1. getFont(). deriveFont(40f));
        ButtonB1.setName("ButtonB1");
        ButtonB1.setBackground(Color.MAGENTA);
        panel.add(ButtonB1);


        JButton ButtonC1 = new JButton(" ");
        ButtonC1.setFont(ButtonC1. getFont(). deriveFont(40f));
        ButtonC1.setName("ButtonC1");
        ButtonC1.setBackground(Color.MAGENTA);
        panel.add(ButtonC1);

        List<JButton> arrayOfButtons = List.of(ButtonA1, ButtonA2, ButtonA3, ButtonB1, ButtonB2, ButtonB3, ButtonC1, ButtonC2, ButtonC3);

        ButtonC1.addActionListener(e -> {
            if (ButtonC1.getText().equals(" ")) {
                XOrO(ButtonC1, arrayOfButtons);
                LabelStatus.setText(StatusProvider(arrayOfButtons));

            }});
        ButtonB1.addActionListener(e -> {
            if (ButtonB1.getText().equals(" ")) {
                XOrO(ButtonB1, arrayOfButtons);
                LabelStatus.setText(StatusProvider(arrayOfButtons));
            }});
        ButtonA1.addActionListener(e -> {
            if (ButtonA1.getText().equals(" ")) {
                XOrO(ButtonA1, arrayOfButtons);
                LabelStatus.setText(StatusProvider(arrayOfButtons));
            }});
        ButtonC2.addActionListener(e -> {
            if (ButtonC2.getText().equals(" ")) {
                XOrO(ButtonC2, arrayOfButtons);
                LabelStatus.setText(StatusProvider(arrayOfButtons));
            }});
        ButtonB2.addActionListener(e -> {
            if (ButtonB2.getText().equals(" ")) {
                XOrO(ButtonB2, arrayOfButtons);
                LabelStatus.setText(StatusProvider(arrayOfButtons));
            }});
        ButtonA2.addActionListener(e -> {
            if (ButtonA2.getText().equals(" ")) {
                XOrO(ButtonA2, arrayOfButtons);
                LabelStatus.setText(StatusProvider(arrayOfButtons));
            }});
        ButtonC3.addActionListener(e -> {
            if (ButtonC3.getText().equals(" ")) {
                XOrO(ButtonC3, arrayOfButtons);
                LabelStatus.setText(StatusProvider(arrayOfButtons));
            }});
        ButtonB3.addActionListener(e -> {
            if (ButtonB3.getText().equals(" ")) {
                XOrO(ButtonB3, arrayOfButtons);
                LabelStatus.setText(StatusProvider(arrayOfButtons));
            }});
        ButtonA3.addActionListener(e -> {
            if (ButtonA3.getText().equals(" ")) {
                XOrO(ButtonA3, arrayOfButtons);
                LabelStatus.setText(StatusProvider(arrayOfButtons));
            }});

        ButtonReset.addActionListener(e -> {
            for (JButton button : arrayOfButtons
            ) {
                button.setText(" ");
                button.setEnabled(true);
            }
            LabelStatus.setText("Game is not started");
        });

    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}