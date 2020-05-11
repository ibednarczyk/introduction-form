package introduction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntroductionForm implements ActionListener {

    private JFrame jFrame;

    private JTextField firstNameField = new JTextField();
    private JTextField lastNameField = new JTextField();
    private JTextField professionField = new JTextField();
    private JTextField loveToField = new JTextField();
    private JTextField wantToField = new JTextField();
    private JLabel firstNameLabel = new JLabel("First Name");
    private JLabel lastNameLabel = new JLabel("Last Name");
    private JLabel professionLabel = new JLabel("Profession");
    private JLabel loveToLabel = new JLabel("Love to");
    private JLabel wantToLabel = new JLabel("Want to");
    private String[] tech = {"Java", "Spring", "Hibernate", "Git", "REST", "SQL"};
    private String[] skills = { "Creativity", "Communication", "Problem solving", "Team player"};
    private JComboBox<String> techBox = new JComboBox<>(tech);
    private JComboBox<String> skillsBox = new JComboBox<>(skills);
    private JLabel techLabel = new JLabel("Languages&Technologies");
    private JLabel skillsLabel  = new JLabel("Skills");

    private JButton seeButton = new JButton("Let's see!");
    private JButton helloButton = new JButton("Say hello!");


    public IntroductionForm() {
        createForm();
        setSize();
        add();

    }

    private void createForm(){
        this.jFrame = new JFrame();
        jFrame.setTitle("Let me introduce myself!");
        jFrame.setBounds(480,100,480,580);
        jFrame.getContentPane().setBackground(Color.PINK);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(true);

    }

    private void setSize(){
        firstNameLabel.setBounds(20,20, 200, 40);
        lastNameLabel.setBounds(20, 70, 200, 40);
        firstNameField.setBounds(220, 20, 240, 40);
        lastNameField.setBounds(220, 70, 240, 40);
    }

    private void add(){
        jFrame.add(firstNameField);
        jFrame.add(lastNameField);
        jFrame.add(professionField);
        jFrame.add(loveToField);
        jFrame.add(wantToField);
        jFrame.add(techBox);
        jFrame.add(skillsBox);
        jFrame.add(firstNameLabel);
        jFrame.add(lastNameLabel);
        jFrame.add(professionLabel);
        jFrame.add(loveToLabel);
        jFrame.add(wantToLabel);
        jFrame.add(techLabel);
        jFrame.add(skillsLabel);
        jFrame.add(helloButton);
        jFrame.add(seeButton);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
