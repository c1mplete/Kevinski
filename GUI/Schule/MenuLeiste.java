package GUI.Schule;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuLeiste extends JMenuBar implements ActionListener{

    JMenu menuFile, menuEdit;
    JMenuItem menuItemStart, menuItemKlassen, menuItemMitarbeiterVerwalten;

    public MenuLeiste() {
        menuFile = new JMenu("File");
        menuEdit = new JMenu("Edit");

        menuItemStart = new JMenuItem("Startseite");
        menuItemKlassen = new JMenuItem("Klassen");
        menuItemMitarbeiterVerwalten = new JMenuItem("Mitarbeiter verwalten");

        menuEdit.add(menuItemStart);
        menuEdit.add(menuItemKlassen);
        menuEdit.add(menuItemMitarbeiterVerwalten);

        this.add(menuFile);
        this.add(menuEdit);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}