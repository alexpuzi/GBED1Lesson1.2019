package puzikov.jse.geekbrainsEd1L4;

import javax.swing.*;
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
//        JPanel jpTextFild = new JPanel(new GridLayout());
//        JPanel jpTaxtAria = new JPanel(new GridLayout());
//        JTextField jTextField = new JTextField(20);
//        JTextArea jTextArea = new JTextArea();
//        JScrollPane jScrollPane = new JScrollPane(jpTaxtAria);
//        JButton jButton = new JButton("Enter text");
//
//     public MyWindow3() throws IOException {
//        setTitle("Homework 4");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setSize(400,500);
//        jpTaxtAria.setLineWrap(true);
//      
//
//
//        setVisible(true);
//    }
public MyWindow3() {
    super("Текстовые поля");
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    JTextField jTextField = new JTextField(25);
    jTextField.setToolTipText("Короткое поле");
    JTextArea jTextArea = new JTextArea();
    jTextArea.setFont(new Font("Message", Font.CENTER_BASELINE,20));

    jTextField.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(MyWindow3.this,
                    "Message: " + jTextField.getText());
        }
    });

    JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
    contents.add(jTextField);

    setContentPane(contents);
    setSize(400, 400);
    setVisible(true);
}
}


