package GUI;

import javax.swing.*;

public class contentForm extends JFrame {

    private JPanel rootPanel;
    private JTextField typeField;
    private JTextField authorField;
    private JTextField genreField;
    private JTextField dateField;
    private JButton saveButton;
    private JTextField nameField;

    public contentForm() {
        setContentPane(rootPanel);
        setSize(500,250);
        setVisible(true);
    }
}
