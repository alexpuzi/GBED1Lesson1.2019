package puzikov.jse.geekbrainsEd1L4;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow3 extends JFrame {
    private JLabel jLabel;
    private JTextField jTextField;

    public MyWindow3() {
        super("Homework 4");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 160);
        setResizable(false);
        setLayout(null);
        jLabel = new JLabel();
        jLabel.setBounds(10, 10, 270, 30);
        jLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        jTextField = new JTextField();
        jTextField.setBounds(jLabel.getX(), 90, getWidth(), 30);
        int bw = (jTextField.getWidth() - 20) / 2;
        JButton jButton = new JButton("Send");
        jButton.setBounds(jTextField.getX(), 90, bw, 30);
        jButton.setFocusPainted(false);
        jButton.addActionListener(e -> jLabel.setText(jTextField.getText()));
        add(jLabel);
        add(jTextField);
        add(jButton);
        setVisible(true);
    }
}


