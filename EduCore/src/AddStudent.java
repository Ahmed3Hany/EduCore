
import helper_classes.*;
import java.awt.Color;
import javax.swing.*;

public class AddStudent {

    public void AddSTD() {

        JFrame frame = new JFrame("Add Student");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(800, 350);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#1e1e1e"));

        JLabel Header = new JLabel("Add Student");
        Header.setBounds(285, 10, 230, 50);
        Header.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 42));
        Header.setForeground(Color.decode("#D9D9D9"));
        panel.add(Header);
        
        JLabel Label1 = new JLabel("Enter Student ID:");
        Label1.setBounds(50, 80, 230, 30);
        Label1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24));
        Label1.setForeground(Color.decode("#D9D9D9"));
        panel.add(Label1);

        JTextField InputID = new JTextField("");
        InputID.setBounds(300, 80, 450, 30);
        InputID.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24));
        InputID.setBackground(Color.decode("#B2B2B2"));
        InputID.setForeground(Color.decode("#656565"));
        InputID.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
        OnFocusEventHelper.setOnFocusText(InputID, "ID", Color.decode("#353535"), Color.decode("#656565"));
        panel.add(InputID);
        
        JLabel Label2 = new JLabel("Enter Student Name:");
        Label2.setBounds(50, 130, 230, 30);
        Label2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24));
        Label2.setForeground(Color.decode("#D9D9D9"));
        panel.add(Label2);

        JTextField InputName = new JTextField("");
        InputName.setBounds(300, 130, 450, 30);
        InputName.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24));
        InputName.setBackground(Color.decode("#B2B2B2"));
        InputName.setForeground(Color.decode("#656565"));
        InputName.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
        OnFocusEventHelper.setOnFocusText(InputName, "", Color.decode("#353535"), Color.decode("#656565"));
        panel.add(InputName);
        
        JLabel Label3 = new JLabel("Enter Student Major:");
        Label3.setBounds(50, 180, 230, 30);
        Label3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24));
        Label3.setForeground(Color.decode("#D9D9D9"));
        panel.add(Label3);

        JComboBox<String> MajorComboBox = new JComboBox<>(new String[] {"Information Technology", 
                                                                        "Railway Technology", 
                                                                        "Operating and Maintaining Textile Technology", 
                                                                        "Food Industry Technology", 
                                                                        "Tractors and Agricultural Equipment Technology"});
        MajorComboBox.setBounds(300, 180, 450, 30);
        MajorComboBox.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24));
        MajorComboBox.setBackground(Color.decode("#B2B2B2"));
        MajorComboBox.setForeground(Color.decode("#656565"));
        MajorComboBox.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
        panel.add(MajorComboBox);

        JButton BtnOK = new JButton("OK");
        BtnOK.setBounds(270, 240, 108, 50);
        BtnOK.setBackground(Color.decode("#2e2e2e"));
        BtnOK.setForeground(Color.decode("#D9D9D9"));
        BtnOK.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24));
        BtnOK.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        BtnOK.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(BtnOK, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(BtnOK);

        JButton BtnExit = new JButton("Cancel");
        BtnExit.setBounds(400, 240, 108, 50);
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
            String inputid = InputID.getText().trim();
            String inputname = InputName.getText().trim();
            String inputmajor = MajorComboBox.getSelectedItem().toString();
            if (inputid.isEmpty() || inputname.isEmpty() || inputmajor.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                try {
                    int studentID = Integer.parseInt(inputid);
                    String STDName = Character.toUpperCase(inputname.charAt(0)) + inputname.substring(1).toLowerCase();
                    String NewStdInfo = Students.AddStudent(studentID, STDName, inputmajor);
                    
                    if (NewStdInfo.equals("Student already exists.")) {
                        JOptionPane.showMessageDialog(frame, "Student already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                    } 
                    else {
                        EduCore.OutputBox.setText(NewStdInfo);
                        frame.dispose();
                    }
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
