package GUI.FirstUi;

import javax.swing.*;

public class Panel extends JPanel {
    private JTextArea textArea;

    public Panel(JTextArea textArea) {
        this.textArea = textArea;
        JLabel label = new JLabel();
        JTextField textField = new JTextField(10);
        JButton btn_send = new JButton("Send");
        JButton btn_reset = new JButton("Reset");

        add(label);
        add(textField);
        add(btn_send);
        add(btn_reset);

        btn_send.addActionListener(e -> {
            String text = textField.getText();
            this.textArea.setText(text);
        });
    }
}
