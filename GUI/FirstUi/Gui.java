package GUI.FirstUi;

import java.awt.*;

public class Gui {
    public static void main(String[] args) {
        MainFrame jframe = new MainFrame("My Title");
        MenuBar menuBar = new MenuBar();
        TextArea textArea = new TextArea();
        Panel panel = new Panel(textArea);

        jframe.getContentPane().add(BorderLayout.NORTH, menuBar);
        jframe.getContentPane().add(BorderLayout.CENTER, textArea);
        jframe.getContentPane().add(BorderLayout.SOUTH, panel);

        jframe.setVisible(true);
    }
}
