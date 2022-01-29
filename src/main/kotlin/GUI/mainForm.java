package GUI;

import javax.swing.*;

public class mainForm extends JFrame {
    private JPanel rootPanel;
    private JButton buttonNewInput;
    private JButton buttonDeleteInput;
    private JTable tableContent;


    public mainForm() {
        setContentPane(rootPanel);
        setSize(500,250);
        setVisible(true);
    }
}
