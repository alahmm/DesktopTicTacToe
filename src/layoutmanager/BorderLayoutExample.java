package layoutmanager;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    public BorderLayoutExample() {
        super("Border Layout");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        //add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("Center"), BorderLayout.CENTER);
        //setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.add(new JButton("One"));//if we want two buttons north, panel is in flowlayout
        panel.add(new JButton("Two"));
        add(panel, BorderLayout.NORTH);
        setVisible(true);
    }

    public static void main(final String[] args) {
        new BorderLayoutExample();
    }
}
