import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JFrame{

    JPanel mainPanel;
    JPanel northPanel;
    JPanel westPanel;
    JPanel centerPanel;
    JLabel option1;
    JLabel option2;
    JLabel option3;
    JLabel option4;
    JLabel option5;
    JButton option1Button;
    JButton option2Button;
    JButton option3Button;
    JButton saveButton;
    JRadioButton activeButton;
    JRadioButton inactiveButton;
    JCheckBox nameBox;
    JCheckBox addressBox;
    JLabel city;
    JCheckBox descriptionBox;
    JTextField nameText;
    JTextField adressText;
    JTextField cityText;
    JTextArea descriptionTextArea;
    JComboBox<String> paises;




    public Main() {
        setBounds(
                10, 10, 700, 500
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
        mainPanel.add(createNorthPanel(), BorderLayout.NORTH);
        mainPanel.add(createWestPanel(), BorderLayout.WEST);
        mainPanel.add(createCenterPanel(), BorderLayout.CENTER);
        return mainPanel;
    }

    private JPanel createCenterPanel() {
        centerPanel = new JPanel(new GridBagLayout());
        centerPanel.add(createCheckBoxName(), new GridBagConstraints(
                0,
                0,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 20, 0, 0),
                0,
                0)
        );
        centerPanel.add(createCheckBoxAdress(), new GridBagConstraints(
                0,
                1,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 20, 0, 0),
                0,
                0)
        );
        centerPanel.add(createJLabelCity(), new GridBagConstraints(
                0,
                2,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 50, 0, 0),
                0,
                0)
        );
        centerPanel.add(createCheckBoxDescription(), new GridBagConstraints(
                0,
                3,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 20, 0, 0),
                0,
                0)
        );
        centerPanel.add(createNameTextField(), new GridBagConstraints(
                1,
                0,
                5,
                1,
                5.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        centerPanel.add(createAdressTextField(), new GridBagConstraints(
                1,
                1,
                5,
                1,
                5.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        centerPanel.add(createCityTextField(), new GridBagConstraints(
                1,
                2,
                4,
                1,
                4.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        centerPanel.add(createJComboBox(), new GridBagConstraints(
                5,
                2,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        centerPanel.add(createDescriptionTextArea(), new GridBagConstraints(
                1,
                3,
                5,
                5,
                5.0,
                5.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        centerPanel.add(createJRadioButtonActive(), new GridBagConstraints(
                1,
                8,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        centerPanel.add(createJRadioButtonInactive(), new GridBagConstraints(
                5,
                8,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );

        centerPanel.add(createJButtonSave(), new GridBagConstraints(
                5,
                9,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );

        extracted();


        return centerPanel;
    }

    private JButton createJButtonSave() {
        saveButton = new JButton("Save");
        return saveButton;
    }

    private JRadioButton createJRadioButtonInactive() {
        inactiveButton = new JRadioButton("Inactive");
        return inactiveButton;
    }

    private JRadioButton createJRadioButtonActive() {
        activeButton = new JRadioButton("Active");
        activeButton.setSelected(true);
        return activeButton;
    }

    private JComboBox<String> createJComboBox() {
        paises = new JComboBox<>();
        paises.addItem("Spain");
        paises.addItem("France");
        paises.addItem("Italy");
        paises.addItem("Hungary");
        paises.addItem("ireland");
        paises.addItem("Andorra");
        paises.addItem("EEUU");
        paises.addItem("Canada");
        paises.addItem("Mexico");
        paises.addItem("Russia");
        paises.addItem("Germany");
        paises.addItem("China");
        return paises;
    }


    private JTextArea createDescriptionTextArea() {
        descriptionTextArea = new JTextArea();
        descriptionTextArea.setEnabled(false);
        return descriptionTextArea;
    }

    private JTextField createCityTextField() {
        cityText = new JTextField();
        cityText.setEnabled(false);
        return cityText;
    }

    private JTextField createAdressTextField() {
        adressText = new JTextField();
        adressText.setEnabled(false);
        return adressText;
    }

    private JTextField createNameTextField() {
        nameText = new JTextField();
        nameText.setEnabled(false);
        return nameText;
    }

    private JCheckBox createCheckBoxDescription() {
        descriptionBox = new JCheckBox("Description");
        return descriptionBox;
    }

    private JLabel createJLabelCity() {
        city = new JLabel("City");
        return city;
    }

    private JCheckBox createCheckBoxAdress() {
        addressBox = new JCheckBox("Adress");
        return addressBox;
    }


    private JCheckBox createCheckBoxName() {
        nameBox = new JCheckBox("Name");
        return nameBox;
    }

    private JPanel createWestPanel() {
        westPanel = new JPanel( new GridBagLayout());
        westPanel.setPreferredSize(new Dimension(100,0));
        westPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Submenu"));

        westPanel.add(createJLabelOption1(), addOnPosition(0,0,1));
        westPanel.add(createJLabelOption2(), addOnPosition(0,1,1));
        westPanel.add(createJLabelOption3(), addOnPosition(0,2,1));
        westPanel.add(createJLabelOption4(), addOnPosition(0,3,1));
        westPanel.add(createJLabelOption5(), addOnPosition(0,4,1));
        westPanel.setBackground(Color.CYAN.darker());

        return westPanel;
    }

    private JLabel createJLabelOption5() {
        option5 = new JLabel("Option5");
        return option5;
    }

    private JLabel createJLabelOption4() {
        option4 = new JLabel("Option4");
        return option4;
    }

    private JLabel createJLabelOption3() {
        option3 = new JLabel("option3");
        return option3;
    }

    private JLabel createJLabelOption2() {
        option2 = new JLabel("Option2");
        return option2;
    }

    private JLabel createJLabelOption1() {
        option1 = new JLabel("Option1");
        return option1;
    }

    private JPanel createNorthPanel() {
        northPanel = new JPanel( new FlowLayout(FlowLayout.LEFT, 20, 5));
        northPanel.add(createButtonOption1());
        northPanel.add(createButtonOption2());
        northPanel.add(createButtonOption3());
        northPanel.setBackground(Color.CYAN.darker());
        return northPanel;
    }

    private JButton createButtonOption3() {
        option2Button = createButton("option2");
        return option2Button;
    }

    private JButton createButtonOption2() {
        option3Button = createButton("Option3");
        return option3Button;
    }

    private JButton createButtonOption1() {
        option1Button = createButton("Option1");
        return option1Button;
    }
    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(Color.LIGHT_GRAY);
        return button;
    }
    private GridBagConstraints addOnPosition(int x, int y, int width) {
        return new GridBagConstraints(
                x,
                y,
                width,
                1,
                1,
                1,
                GridBagConstraints.CENTER,
                GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0),
                0,
                0
        );

    }

    private  void extracted() {
        nameBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(nameBox.isSelected()){
                    nameText.setEnabled(true);
                }
                else{
                    nameBox.setEnabled(false);
                }
            }
        });
        addressBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(addressBox.isSelected()){
                    adressText.setEnabled(true);
                    cityText.setEnabled(true);
                }
                else{
                    adressText.setEnabled(false);
                    cityText.setEnabled(false);
                }
            }
        });
        descriptionBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(descriptionBox.isSelected()){
                    descriptionTextArea.setEnabled(true);
                }
                else {
                    descriptionTextArea.setEnabled(false);
                }
            }
        });

        activeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (activeButton.isSelected()){
                    inactiveButton.setSelected(false);

                }
            }
        });

        inactiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inactiveButton.isSelected()){
                    activeButton.setSelected(false);
                }
            }
        });
        option1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                option1.setForeground(Color.RED);
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                option1.setForeground(Color.BLACK);
            }
        });

        option2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                option2.setForeground(Color.RED);
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                option2.setForeground(Color.BLACK);
            }
        });

        option3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                option3.setForeground(Color.RED);
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                option3.setForeground(Color.BLACK);
            }
        });

        option4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                option4.setForeground(Color.RED);
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                option4.setForeground(Color.BLACK);
            }
        });

        option5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                option5.setForeground(Color.RED);
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                option5.setForeground(Color.BLACK);
            }
        });
    }

    public static void main(String[] args) {

        Main frame = new Main();
    }
}




