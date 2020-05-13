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
    private JTextField techField = new JTextField();
    private JTextField skillField = new JTextField();
    private JLabel techLabel = new JLabel("Languages&Technologies");
    private JLabel skillsLabel  = new JLabel("Skills");


    private JButton helloButton = new JButton("Say hello!");


    public IntroductionForm() {
        createForm();
        setSize();
        setFont();
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
        firstNameField.setBounds(240, 20, 220, 40);
        lastNameField.setBounds(240, 70, 220, 40);
        professionLabel.setBounds(20, 120, 200, 40);
        professionField.setBounds(240, 120, 220, 40);
        loveToLabel.setBounds(20, 170, 200, 40);
        loveToField.setBounds(240, 170, 220, 40);
        wantToLabel.setBounds(20, 220, 200, 40);
        wantToField.setBounds(240, 220, 220, 40);
        techLabel.setBounds(20, 270, 200, 40);
        skillsLabel.setBounds(20, 320, 200, 40);
        techField.setBounds(240, 270, 220, 40);
        skillField.setBounds(240, 320, 220, 40);
        helloButton.setBounds(180, 400, 120, 50);
    }

    private void setFont(){
        firstNameLabel.setFont(new Font("Courier New", Font.BOLD, 14));
        lastNameLabel.setFont(new Font("Courier New", Font.BOLD, 14));
        professionLabel.setFont(new Font("Courier New", Font.BOLD, 14));
        loveToLabel.setFont(new Font("Courier New", Font.BOLD, 14));
        wantToLabel.setFont(new Font("Courier New", Font.BOLD, 14));
        techLabel.setFont(new Font("Courier New", Font.BOLD, 14));
        skillsLabel.setFont(new Font("Courier New", Font.BOLD, 14));

    }

    private void add(){
        jFrame.add(firstNameField);
        jFrame.add(lastNameField);
        jFrame.add(professionField);
        jFrame.add(loveToField);
        jFrame.add(wantToField);
        jFrame.add(techField);
        jFrame.add(skillField);
        jFrame.add(firstNameLabel);
        jFrame.add(lastNameLabel);
        jFrame.add(professionLabel);
        jFrame.add(loveToLabel);
        jFrame.add(wantToLabel);
        jFrame.add(techLabel);
        jFrame.add(skillsLabel);
        jFrame.add(helloButton);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
