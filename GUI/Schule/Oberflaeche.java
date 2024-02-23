package GUI.Schule;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;



    public class Oberflaeche extends JFrame implements ActionListener {

        MenuLeiste menuLeiste = new MenuLeiste();
        PanelStart panelStart = new PanelStart();
        SchoolManagementSystem PanelKlassenSachen = new SchoolManagementSystem();

        public Oberflaeche() {
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.add(panelStart);
            this.setJMenuBar(menuLeiste);
            this.setSize(650, 400);
            this.setVisible(true);

            panelStart.btn_schuelerAusgeben.addActionListener(this);
            menuLeiste.menuItemStart.addActionListener(this);
            menuLeiste.menuItemKlassen.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == menuLeiste.menuItemStart) {
                this.add(panelStart);
                this.revalidate();
                this.repaint();
            }
            if(e.getSource() == menuLeiste.menuItemKlassen) {
                this.remove(panelStart);
                this.add(PanelKlassenSachen);
                this.revalidate();
                this.repaint();
            }

        }

    }

