import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    JPanel mainPanel;
    JPanel northPanel;
    JPanel westPanel;
    JPanel centerPanel;
    JLabel Option1;
    JLabel Option2;
    JLabel Option3;
    JLabel Option4;
    JLabel Option5;
    JButton option1Button;
    JButton option2Button;
    JButton option3Button;
    JButton saveButton;
    JRadioButton ativeButton;
    JRadioButton inactiveButton;
    JCheckBox nameBox;
    JCheckBox addressBox;
    JCheckBox cityBox;
    JCheckBox descriptionBox;
    JTextField nameText;
    JTextField adressText;
    JTextField cityText;
    JTextArea descriptionTextArea;
    JComboBox<String> paises;




    public Main() {
        setBounds(
                10, 10, 500, 300
        );
        setTitle("Calculadora");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(createMainPanel());
        repaint();
        revalidate();
    }
    private JPanel createMainPanel() {
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(westPanel, BorderLayout.WEST);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        return mainPanel;
    }

    public static void main(String[] args) {

        Main frame = new Main();
    }
}
