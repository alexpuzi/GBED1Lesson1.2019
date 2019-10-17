package puzikov.jse.geekbrainsEd1L4;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame implements ActionListener {
    public MyWindow() {
        setTitle("Home work 4");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(new GridLayout(2, 1));
        JLabel jlab = new JLabel();
        JPanel[] jp = new JPanel[2];
        for (int i = 0; i < 2; i++) {
            jp[i] = new JPanel();
            add(jp[i]);
            jp[i].setBackground(new Color(100 + i * 10, 100 + i * 10, 100 + i *10));
        }
        jp[1].setLayout(new BorderLayout());
        JTextField jtf = new JTextField();
        jp[1].add(jtf);
        JButton jb1 = new JButton("Push text");
        jb1.addActionListener((ActionListener) this);
        jp[1].add(jb1);
//        jp[0].add(jp[1],);

//        JButton[] enterButtton = new JButton[1];
//        setLayout(new GridBagLayout());
//        enterButtton[0]=new JButton("Enter");
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
