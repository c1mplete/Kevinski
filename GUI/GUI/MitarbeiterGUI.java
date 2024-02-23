package GUI.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MitarbeiterGUI extends JFrame implements ActionListener {
    int counter = 0;
    MitarbeiterListe ml = new MitarbeiterListe();
    JPanel cards;
    JPanel p;
    JPanel p2;
    JButton btn_ladeMitarbeiter;
    JButton btn_addMitarbeiter;
    JButton btn_NachVorne;
    JButton btn_NachHinten;
    JButton btn_Delete;
    JLabel vorname2;
    JLabel nachname2;
    JLabel vorname;
    JLabel nachname;
    JLabel index;
    JTextField txt_vorname2;
    JTextField txt_nachname2;
    JTextField txt_vorname;
    JTextField txt_nachname;
    JMenuBar menuBar;
    JMenu optionsMenu;
    JMenuItem outputMitarbeiterMenu;
    JMenuItem addMitarbeiterMenu;
    JLabel status;

    public MitarbeiterGUI() {
        cards = new JPanel(new CardLayout());

        //PANEL 2
        p2 = new JPanel();

        btn_addMitarbeiter = new JButton("Mitarbeiter hinzufügen");
        btn_addMitarbeiter.setBounds(20, 150, 150, 25);
        btn_addMitarbeiter.addActionListener(this);

        vorname2 = new JLabel("Vorname");
        vorname2.setBounds(20, 20, 100, 100);

        nachname2 = new JLabel("Nachname");
        nachname2.setBounds(20, 60, 100, 100);

        txt_vorname2 = new JTextField();
        txt_vorname2.setBounds(100, 60, 100, 25);

        txt_nachname2 = new JTextField();
        txt_nachname2.setBounds(100, 100, 100, 25);

        p2.setLayout(null);
        this.add(p2);
        p2.add(btn_addMitarbeiter);
        p2.add(vorname2);
        p2.add(nachname2);
        p2.add(txt_vorname2);
        p2.add(txt_nachname2);

        p2.setVisible(false);

        //PANEL 1
        p = new JPanel();

        status = new JLabel("");
        status.setBounds(20, 200, 250,250);

        btn_ladeMitarbeiter = new JButton("Mitarbeiter laden");
        btn_ladeMitarbeiter.setBounds(20, 150, 150, 25);

        btn_NachHinten = new JButton("<");
        btn_NachHinten.setBounds(170,150,80,25);
        btn_NachHinten.addActionListener(this);

        btn_Delete = new JButton("-");
        btn_Delete.setBounds(250, 150, 80,25);
        btn_Delete.addActionListener(this);

        btn_NachVorne = new JButton(">");
        btn_NachVorne.setBounds(330, 150, 80, 25);
        btn_NachVorne.addActionListener(this);

        vorname = new JLabel("Vorname");
        vorname.setBounds(20, 20, 100, 100);

        nachname = new JLabel("Nachname");
        nachname.setBounds(20, 60, 100, 100);

        txt_vorname = new JTextField();
        txt_vorname.setBounds(100, 60, 100, 25);
        txt_vorname.setEditable(false);

        txt_nachname = new JTextField();
        txt_nachname.setBounds(100, 100, 100, 25);
        txt_nachname.setEditable(false);

        index = new JLabel("Index: " + counter);
        index.setBounds(200, 20, 100, 100);

        p.setLayout(null);
        this.add(p);
        p.add(btn_ladeMitarbeiter);
        p.add(vorname);
        p.add(nachname);
        p.add(txt_vorname);
        p.add(txt_nachname);
        p.add(btn_NachHinten);
        p.add(btn_Delete);
        p.add(btn_NachVorne);
        p.add(index);

        btn_ladeMitarbeiter.addActionListener(this);

        //MENU
        menuBar = new JMenuBar();

        optionsMenu = new JMenu("Options");

        outputMitarbeiterMenu = new JMenuItem("Mitarbeiter Ausgeben");
        addMitarbeiterMenu = new JMenuItem("Mitarbeiter hunzufügen");
        outputMitarbeiterMenu.addActionListener(this);
        addMitarbeiterMenu.addActionListener(this);

            optionsMenu.add(outputMitarbeiterMenu);
            optionsMenu.add(addMitarbeiterMenu);

            menuBar.add(optionsMenu);

        cards.add(p, "Panel 1");
        cards.add(p2, "Panel 2");

        this.add(cards);

        this.setJMenuBar(menuBar);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        CardLayout cl = (CardLayout)(cards.getLayout());

        if(e.getSource() == btn_ladeMitarbeiter) {
            Mitarbeiter mb = ml.mitarbeiterListe.get(counter);
            txt_vorname.setText(mb.getVorname());
            txt_nachname.setText(mb.getNachname());
        }
        if(e.getSource() == addMitarbeiterMenu) {
            cl.show(cards, "Panel 2");
            this.setTitle("Mitarbeiter hinzufügen");
        }
        if(e.getSource() == outputMitarbeiterMenu) {
            cl.show(cards, "Panel 1");
            this.setTitle("Mitarbeiter ausgeben");
        }
        if(e.getSource() == btn_addMitarbeiter){
            String vorname = txt_vorname2.getText();
            String nachname = txt_nachname2.getText();

            Mitarbeiter m = new Mitarbeiter(vorname, nachname);
            ml.addMitarbeiter(m);
            JOptionPane.showMessageDialog(null, vorname + " " + nachname + " hinzugefügt");
            txt_vorname2.setText("");
            txt_nachname2.setText("");
        }
        if(e.getSource() == btn_NachHinten){
            if(counter-1 > -1) {
                counter--;
                Mitarbeiter mb = ml.mitarbeiterListe.get(counter);
                txt_vorname.setText(mb.getVorname());
                txt_nachname.setText(mb.getNachname());
                index.setText("Index: " + counter);
            }
        }
        if(e.getSource() == btn_NachVorne){
            if(counter+1 <= ml.mitarbeiterListe.size()-1) {
                counter++;
                Mitarbeiter mb = ml.mitarbeiterListe.get(counter);
                txt_vorname.setText(mb.getVorname());
                txt_nachname.setText(mb.getNachname());
                index.setText("Index: " + counter);
            }
        }
        if(e.getSource() == btn_Delete){
            Mitarbeiter mb = ml.mitarbeiterListe.get(counter);
            ml.removeMitarbeiter(mb);
            JOptionPane.showMessageDialog(null, mb.getVorname() + " " + mb.getNachname() + " gelöscht");
            txt_vorname.setText("");
            txt_nachname.setText("");
            counter = 0;
            index.setText("Index: " + counter);
        }
    }

}