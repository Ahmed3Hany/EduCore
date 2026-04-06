
import helper_classes.*;
import java.awt.Color;
import javax.swing.*;

public class EduCore {
    public static JTextArea OutputBox;
    public static void main(String[] args) {

        JFrame frame = new JFrame("EduCore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 720);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#1e1e1e"));

        JLabel Header = new JLabel("Welcome To EduCore");
        Header.setBounds(300, 10, 415, 50);
        Header.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 42));
        Header.setForeground(Color.decode("#D9D9D9"));
        panel.add(Header);

        JButton AddSTD = new JButton("Add Student");
        AddSTD.setBounds(30, 70, 250, 50);
        AddSTD.setBackground(Color.decode("#2e2e2e"));
        AddSTD.setForeground(Color.decode("#D9D9D9"));
        AddSTD.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
        AddSTD.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        AddSTD.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(AddSTD, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(AddSTD);

        JButton AddSubject = new JButton("Add Subject to Student");
        AddSubject.setBounds(30, 130, 250, 50);
        AddSubject.setBackground(Color.decode("#2e2e2e"));
        AddSubject.setForeground(Color.decode("#D9D9D9"));
        AddSubject.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
        AddSubject.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        AddSubject.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(AddSubject, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(AddSubject);

        JButton DspStdInfo = new JButton("Display Student Info");
        DspStdInfo.setBounds(30, 190, 250, 50);
        DspStdInfo.setBackground(Color.decode("#2e2e2e"));
        DspStdInfo.setForeground(Color.decode("#D9D9D9"));
        DspStdInfo.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
        DspStdInfo.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        DspStdInfo.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(DspStdInfo, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(DspStdInfo);

        JButton CalcStdGPA = new JButton("Calculate Student GPA");
        CalcStdGPA.setBounds(30, 250, 250, 50);
        CalcStdGPA.setBackground(Color.decode("#2e2e2e"));
        CalcStdGPA.setForeground(Color.decode("#D9D9D9"));
        CalcStdGPA.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
        CalcStdGPA.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        CalcStdGPA.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(CalcStdGPA, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(CalcStdGPA);

        JButton RmStd = new JButton("Remove Student");
        RmStd.setBounds(30, 310, 250, 50);
        RmStd.setBackground(Color.decode("#2e2e2e"));
        RmStd.setForeground(Color.decode("#D9D9D9"));
        RmStd.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
        RmStd.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        RmStd.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(RmStd, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(RmStd);

        JButton RmSubject = new JButton("Remove Subject");
        RmSubject.setBounds(30, 370, 250, 50);
        RmSubject.setBackground(Color.decode("#2e2e2e"));
        RmSubject.setForeground(Color.decode("#D9D9D9"));
        RmSubject.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
        RmSubject.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        RmSubject.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(RmSubject, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(RmSubject);

        JButton showGrd = new JButton("Show Grade");
        showGrd.setBounds(30, 430, 250, 50);
        showGrd.setBackground(Color.decode("#2e2e2e"));
        showGrd.setForeground(Color.decode("#D9D9D9"));
        showGrd.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
        showGrd.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        showGrd.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(showGrd, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(showGrd);

        JButton DspAllSTD = new JButton("Display All Students");
        DspAllSTD.setBounds(30, 490, 250, 50);
        DspAllSTD.setBackground(Color.decode("#2e2e2e"));
        DspAllSTD.setForeground(Color.decode("#D9D9D9"));
        DspAllSTD.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
        DspAllSTD.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        DspAllSTD.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(DspAllSTD, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(DspAllSTD);

        JButton HighGPA = new JButton("Show Student Highest GPA");
        HighGPA.setBounds(30, 550, 250, 50);
        HighGPA.setBackground(Color.decode("#2e2e2e"));
        HighGPA.setForeground(Color.decode("#D9D9D9"));
        HighGPA.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
        HighGPA.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        HighGPA.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(HighGPA, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(HighGPA);

        JButton Exit = new JButton("Exit");
        Exit.setBounds(30, 610, 250, 50);
        Exit.setBackground(Color.decode("#2e2e2e"));
        Exit.setForeground(Color.decode("#D9D9D9"));
        Exit.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
        Exit.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
        Exit.setFocusPainted(false);
        OnClickEventHelper.setOnClickColor(Exit, Color.decode("#232323"), Color.decode("#2e2e2e"));
        panel.add(Exit);

        OutputBox = new JTextArea("");
        OutputBox.setBounds(300, 70, 680, 590);
        OutputBox.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 28));
        OutputBox.setBackground(Color.decode("#B2B2B2"));
        OutputBox.setForeground(Color.decode("#000000"));
        OutputBox.setBorder(BorderFactory.createCompoundBorder(
            new RoundedBorder(2, Color.decode("#979797"), 0), // البوردر بتاعك
            BorderFactory.createEmptyBorder(10, 10, 10, 10) // البادينج الداخلي
        ));
        OnFocusEventHelper.setOnFocusText(OutputBox, "", Color.decode("#353535"), Color.decode("#656565"));
        panel.add(OutputBox);

        frame.add(panel);
        frame.setVisible(true);




        AddSTD.addActionListener(e -> {
            AddStudent addStudent = new AddStudent();
            addStudent.AddSTD();
        });
        AddSubject.addActionListener(e -> {
            
        });
        DspStdInfo.addActionListener(e -> {
            GetID getID = new GetID();
            getID.GetData();
        });
        CalcStdGPA.addActionListener(e -> {
            
        });
        RmStd.addActionListener(e -> {
            
        });
        RmSubject.addActionListener(e -> {
            
        });
        showGrd.addActionListener(e -> {
            
        });
        DspAllSTD.addActionListener(e -> {
            
        });
        HighGPA.addActionListener(e -> {
            
        });
        Exit.addActionListener(e -> {
            System.exit(0);
        });

    }
}
