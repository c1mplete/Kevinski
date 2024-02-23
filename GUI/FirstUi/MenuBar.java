package GUI.FirstUi;

import javax.swing.*;

public class MenuBar extends JMenuBar {
    public MenuBar() {
        JMenu elementA = new JMenu("ElementA");
        JMenu elementB = new JMenu("ElementB");
        add(elementA);
        add(elementB);
    }
}
