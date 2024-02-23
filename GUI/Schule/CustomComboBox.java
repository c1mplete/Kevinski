package GUI.Schule;

import javax.swing.*;
import java.util.ArrayList;

public class CustomComboBox extends JComboBox<String> {
    private ArrayList<String> items;

    public CustomComboBox() {
        super();
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        super.addItem(item);
    }

    public void removeItem(String item) {
        items.remove(item);
        super.removeItem(item);
    }

    public String getSelectedItem() {
        return (String) super.getSelectedItem();
    }

    public int getItemCount() {
        return items.size();
    }
}
