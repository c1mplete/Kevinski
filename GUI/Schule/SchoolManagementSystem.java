package GUI.Schule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SchoolManagementSystem extends JFrame implements ActionListener {
    private JComboBox<String> comboBoxStudents;
    private JComboBox<String> comboBoxClasses;
    private JTextField textFieldFirstName;
    private JTextField textFieldLastName;
    private JTextField textFieldMatriculationNumber;
    private JTextField textFieldClassName;
    private JButton buttonAddStudent;
    private JButton buttonDeleteStudent;
    private JButton buttonUpdateStudent;
    private JButton buttonAddClass;
    private JButton buttonDeleteClass;
    private JButton buttonUpdateClass;

    private Klasse k = new Klasse("NULL", null);

    public SchoolManagementSystem() {
        initializeComponents();
        setLayout(new BorderLayout());
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initializeComponents() {
        // Initialize and configure components
        comboBoxStudents = new JComboBox<>();
        comboBoxClasses = new JComboBox<>();

        textFieldFirstName = new JTextField();
        textFieldLastName = new JTextField();
        textFieldMatriculationNumber = new JTextField();
        textFieldClassName = new JTextField();

        buttonAddStudent = new JButton("Add Student");
        buttonDeleteStudent = new JButton("Delete Student");
        buttonUpdateStudent = new JButton("Update Student");
        buttonAddClass = new JButton("Add Class");
        buttonDeleteClass = new JButton("Delete Class");
        buttonUpdateClass = new JButton("Update Class");

        // Configure components with exact bounds
        comboBoxStudents.setBounds(450, 30, 150, 20);
        comboBoxClasses.setBounds(30, 30, 150, 20);
        textFieldFirstName.setBounds(250, 75, 150, 20);
        textFieldLastName.setBounds(250, 125, 150, 20);
        textFieldMatriculationNumber.setBounds(250, 175, 150, 20);
        textFieldClassName.setBounds(250, 75, 150, 20);
        buttonAddStudent.setBounds(250, 275, 150, 20);
        buttonDeleteStudent.setBounds(250, 300, 150, 20);
        buttonUpdateStudent.setBounds(250, 250, 150, 20);
        buttonAddClass.setBounds(250, 200, 150, 20);
        buttonDeleteClass.setBounds(250, 225, 150, 20);
        buttonUpdateClass.setBounds(250, 250, 150, 20);

        // Add action listeners
        buttonAddStudent.addActionListener(this);
        buttonDeleteStudent.addActionListener(this);
        buttonUpdateStudent.addActionListener(this);
        buttonAddClass.addActionListener(this);
        buttonDeleteClass.addActionListener(this);
        buttonUpdateClass.addActionListener(this);

        // Add components to the frame
        this.add(comboBoxStudents);
        this.add(comboBoxClasses);
        this.add(textFieldFirstName);
        this.add(textFieldLastName);
        this.add(textFieldMatriculationNumber);
        this.add(textFieldClassName);
        this.add(buttonAddStudent);
        this.add(buttonDeleteStudent);
        this.add(buttonUpdateStudent);
        this.add(buttonAddClass);
        this.add(buttonDeleteClass);
        this.add(buttonUpdateClass);

        // Populate comboBoxStudents and comboBoxClasses with data
        ArrayList<String> studentNames = new ArrayList<>();
        for (Schueler student : Schueler.getAllSchueler()) {
            studentNames.add(student.getNachname());
        }
        comboBoxStudents.setModel(new DefaultComboBoxModel<>(studentNames.toArray(new String[0])));

        //ArrayList<String> classNames = k.getAllKlassen();
       //comboBoxClasses.setModel(new DefaultComboBoxModel<>(classNames.toArray(new String[0])));
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonAddStudent) {
            addStudent();
        } else if (source == buttonDeleteStudent) {
            deleteStudent();
        } else if (source == buttonUpdateStudent) {
            updateStudent();
        } else if (source == buttonAddClass) {
            addClass();
        } else if (source == buttonDeleteClass) {
            deleteClass();
        } else if (source == buttonUpdateClass) {
            updateClass();
        }
    }

    private void addStudent() {
        String firstName = textFieldFirstName.getText();
        String lastName = textFieldLastName.getText();
        int matriculationNumber = Integer.parseInt(textFieldMatriculationNumber.getText());
        Schueler student = new Schueler(firstName, lastName, matriculationNumber);
        // Update comboBoxStudents with the new student
    }

    private void deleteStudent() {
        String lastName = (String) comboBoxStudents.getSelectedItem();
        Schueler.deleteSchueler(Schueler.getSchuelerByName(lastName).getMatrikelnr());
        // Remove the student from comboBoxStudents
    }

    private void updateStudent() {
        String lastName = (String) comboBoxStudents.getSelectedItem();
        String newFirstName = textFieldFirstName.getText();
        String newLastName = textFieldLastName.getText();
        Schueler.updateSchueler(Schueler.getSchuelerByName(lastName).getMatrikelnr(), newFirstName, newLastName);
        // Update the student in comboBoxStudents
    }

    private void addClass() {
        String className = textFieldClassName.getText();
        // Assuming you have a way to get the teacher instance
        Lehrer teacher = null; // Replace with actual logic to get the teacher
        Klasse clazz = new Klasse(className, teacher);
        // Add the new class to the list of classes
        //k.klassen.add(clazz);
        // Update the combo box with the new class
        comboBoxClasses.addItem(className);
        // Optionally, select the newly added class in the combo box
        comboBoxClasses.setSelectedItem(className);
    }


    private void deleteClass() {
        String className = (String) comboBoxClasses.getSelectedItem();
        Klasse targetClass = null;
        for (Klasse klass : k.getAllKlassen()) {
            if (klass.getKlassenname().equals(className)) {
                targetClass = klass;
                break;
            }
        }
        if (targetClass != null) {
            k.removeKlasse(targetClass);
            // Clear the combo box and repopulate it with the remaining class names
            comboBoxClasses.removeAllItems();
            ArrayList<String> classNames = k.getAllClassNames();
            for (String name : classNames) {
                comboBoxClasses.addItem(name);
            }
            // Select the first item in the combo box after deletion
            if (!classNames.isEmpty()) {
                comboBoxClasses.setSelectedIndex(0);
            }
        }
    }


    private void updateClass() {
        String oldClassName = (String) comboBoxClasses.getSelectedItem();
        String newClassName = textFieldClassName.getText();
        // Assuming you have a way to get the teacher instance
        Lehrer teacher = null; // Replace with actual logic to get the teacher
        //Klasse.getClassFromString(oldClassName);
        // Update the class in comboBoxClasses
    }
}
