package GUI.Mitarbeiter;

import GUI.GUI.Mitarbeiter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MitarbeiterGUI extends JFrame implements ActionListener {
    Mitarbeiter m = new Mitarbeiter("Kevin", "Tomasi");
    JPanel p;
    JButton btn_ladeMitarbeiter;
    JLabel vorname;
    JLabel nachname;
    JTextField txt_vorname;
    JTextField txt_nachname;

    public MitarbeiterGUI() {
        p = new JPanel();
        btn_ladeMitarbeiter = new JButton("Mitarbeiter laden");
        btn_ladeMitarbeiter.setBounds(20, 150, 150, 25);

        vorname = new JLabel("Vorname");
        vorname.setBounds(20, 20, 100, 100);

        nachname = new JLabel("Nachname");
        nachname.setBounds(20, 60, 100, 100);

        txt_vorname = new JTextField();
        txt_vorname.setBounds(100, 60, 100, 25);

        txt_nachname = new JTextField();
        txt_nachname.setBounds(100, 100, 100, 25);

        p.setLayout(null);
        this.add(p);
        p.add(btn_ladeMitarbeiter);
        p.add(vorname);
        p.add(nachname);
        p.add(txt_vorname);
        p.add(txt_nachname);
        btn_ladeMitarbeiter.addActionListener(this);

        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_ladeMitarbeiter) {
            txt_vorname.setText(m.getVorname());
            txt_nachname.setText(m.getNachname());
        }
    }

}
