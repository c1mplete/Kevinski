package GUI.Schule;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelStart extends JPanel implements ActionListener {

    Dimension size;
    JLabel namePanel;
    JButton btn_schuelerAusgeben, btn_mitarbeiterVerwalten;
    public PanelStart() {
        this.setLayout(null);
        namePanel = new JLabel("Klassenverwaltung");
        namePanel.setFont(new Font("Verdana",1,20));
        size = namePanel.getPreferredSize();
        namePanel.setBounds(100, 10, 350, 30);
        namePanel.setHorizontalAlignment(JLabel.CENTER);

        btn_schuelerAusgeben = new JButton("Schueler anzeigen");
        btn_mitarbeiterVerwalten = new JButton("Mitarbeiter verwalten");
        btn_schuelerAusgeben.setBounds(30, 50, 150, 20);
        btn_schuelerAusgeben.addActionListener(this);
        btn_schuelerAusgeben.setHorizontalAlignment(JButton.CENTER);

        this.add(namePanel);
        this.add(btn_schuelerAusgeben);
        this.add(btn_mitarbeiterVerwalten);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
