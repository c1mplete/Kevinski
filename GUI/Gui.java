package GUI;

import javax.swing.*;
import java.awt.*;

public class Gui {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("My Title");
        jframe.setSize(300, 300);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JMenubar
        JMenuBar menuBar = new JMenuBar();
        JMenu elementA = new JMenu("ElementA");
        JMenu elementB = new JMenu("ElementB");
        menuBar.add(elementA);
        menuBar.add(elementB);

        //TextArea
        JTextArea textArea = new JTextArea();

        //JPanel - JLabel
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JTextField textField = new JTextField(10);
        JButton btn_send = new JButton("Send");
        JButton btn_reset = new JButton("Reset");

        //Elemente dem Container Panel hinzufügen
        panel.add(label);
        panel.add(textField);
        panel.add(btn_send);
        panel.add(btn_reset);

        btn_send.addActionListener(e -> {
            String text = textField.getText();
            textArea.setText(text);
        });


        //Elemente dem JFrame hinzufügen
        jframe.getContentPane().add(BorderLayout.NORTH, menuBar);
        jframe.getContentPane().add(BorderLayout.CENTER, textArea);
        jframe.getContentPane().add(BorderLayout.SOUTH, panel);







        jframe.setVisible(true);
    }
}
