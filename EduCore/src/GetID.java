
import helper_classes.*;
import java.awt.Color;
import javax.swing.*;

public class GetID {

    public void GetData() {

        JFrame frame = new JFrame("Enter Student ID");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(600, 250);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#1e1e1e"));

        JLabel Header = new JLabel("Display Student Info");
        Header.setBounds(100, 10, 380, 50);
        Header.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 42));
        Header.setForeground(Color.decode("#D9D9D9"));
        panel.add(Header);

        JLabel Label = new JLabel("Enter Student ID:");
        Label.setBounds(54, 90, 190, 30);
        Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24));
        Label.setForeground(Color.decode("#D9D9D9"));
        panel.add(Label);

        JTextField InputID = new JTextField("");
        InputID.setBounds(268, 90, 250, 30);
        InputID.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24));
        InputID.setBackground(Color.decode("#B2B2B2"));
        InputID.setForeground(Color.decode("#656565"));
        InputID.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
        OnFocusEventHelper.setOnFocusText(InputID, "ID", Color.decode("#353535"), Color.decode("#656565"));
        panel.add(InputID);

        JButton BtnOK = new JButton("OK");
        BtnOK.setBounds(170, 150, 108, 50);
        BtnOK.setBackground(Color.decode("#2e2e2e"));
        BtnOK.setForeground(Color.decode("#D9D9D9"));
        BtnOK.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24));
        BtnOK.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        BtnOK.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(BtnOK, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(BtnOK);

        JButton BtnExit = new JButton("Cancel");
        BtnExit.setBounds(300, 150, 108, 50);
        BtnExit.setBackground(Color.decode("#2e2e2e"));
        BtnExit.setForeground(Color.decode("#D9D9D9"));
        BtnExit.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24));
        BtnExit.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        BtnExit.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(BtnExit, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(BtnExit);

        frame.add(panel);
        frame.setVisible(true);



        BtnOK.addActionListener(e -> {
            String input = InputID.getText().trim();
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter a student ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                try {
                    int studentID = Integer.parseInt(input);
                    String studentInfo = Students.DisplayStudentInfo(studentID);
                    EduCore.OutputBox.setText(studentInfo);
                    frame.dispose();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid integer ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        BtnExit.addActionListener(e -> {
            frame.dispose();
        });

    }
}
