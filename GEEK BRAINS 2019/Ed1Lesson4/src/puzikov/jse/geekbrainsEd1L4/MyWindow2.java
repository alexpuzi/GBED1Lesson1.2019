package puzikov.jse.geekbrainsEd1L4;

// пример оконного приложения
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author DarkRaha
 *
 */
public class MyWindow2 extends JFrame implements ActionListener {
    // версия класса
    private static final long serialVersionUID = 1L;

    // некоторые элементы окна
    private JTextArea jta = new JTextArea(
            "Scroll bar will appear, when much text");

    public MyWindow2() {
        // ------------------------------------------
        // добавление и настройка компонент
        Container c = getContentPane(); // клиентская область окна
        c.setLayout(new BorderLayout()); // выбираем компоновщик

        // метку наверх
        c.add(new JLabel("my first label :)"), BorderLayout.NORTH);
        // две кнопки в дополнительную панель
        JPanel jp = new JPanel();
        JButton jbt = new JButton("Add text");
        jbt.addActionListener(this); // назначаем обработчик события
        jp.add(jbt);
        jbt = new JButton("Clear text");
        jbt.addActionListener(this); // назначаем обработчик события
        jp.add(jbt);
        // добавляем панель вниз
        c.add(jp, BorderLayout.SOUTH);
        // помещаем текст. поле в область прокрутки
        // а область прокрутки в центр окна,
        // BorderLayout.CENTER значение по умолчанию
        c.add(new JScrollPane(jta));
        jta.setLineWrap(true); // автоматический перенос строк
        // всплывающая подсказка
        jta.setToolTipText("this is simple text editor");

        // -------------------------------------------
        // настройка окна
        setVisible(true);

    }

    // обработчик события, метод интерфейса ActionListener
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getActionCommand().equals("Add text"))
            jta.append(" Add text\\n");

        if (arg0.getActionCommand().equals("Clear text"))
            jta.setText("");

        // если ссылки на объекты сохранены можно сравнивать
        // по объектам, например для JButton jbOK= new JBUtton("Ok");
        // то сравнение будет таким
        //    if(arg0.getSource().equals(jbOK))
    }
}

// запуск оконного приложения