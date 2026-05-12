
import helper_classes.*; // استيراد كل الكلاسات الموجودة داخل package اسمها helper_classes
import java.awt.Color; // استيراد كلاس Color للتحكم في الألوان
import javax.swing.*; // استيراد مكتبة Swing الخاصة بالواجهات الرسومية

public class EduCoreFrm { // تعريف كلاس رئيسي اسمه EduCore

    public static JTextArea OutputBox; // إنشاء TextArea عامة وثابتة لعرض النتائج

    public static void main(String[] args) { // الدالة الرئيسية لتشغيل البرنامج

        JFrame frame = new JFrame("EduCore"); // إنشاء نافذة جديدة بعنوان EduCore
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // قفل البرنامج عند غلق النافذة
        frame.setSize(1024, 720); // تحديد حجم النافذة
        frame.setResizable(false); // منع تغيير حجم النافذة
        frame.setLocationRelativeTo(null); // جعل النافذة تظهر في منتصف الشاشة

        JPanel panel = new JPanel(); // إنشاء Panel لوضع العناصر بداخله
        panel.setLayout(null); // استخدام Layout يدوي بالإحداثيات
        panel.setBackground(Color.decode("#1e1e1e")); // تغيير لون خلفية الـ Panel

        JLabel Header = new JLabel("Welcome To EduCore"); // إنشاء Label بعنوان البرنامج
        Header.setBounds(300, 10, 415, 50); // تحديد مكان وحجم الـ Label
        Header.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 42)); // تحميل خط مخصص وتحديد حجمه
        Header.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Header); // إضافة الـ Label إلى الـ Panel

        JButton AddSTD = new JButton("Add Student"); // إنشاء زر لإضافة طالب
        AddSTD.setBounds(30, 70, 250, 50); // تحديد مكان وحجم الزر
        AddSTD.setBackground(Color.decode("#2e2e2e")); // تحديد لون خلفية الزر
        AddSTD.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص داخل الزر
        AddSTD.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20)); // تحديد نوع وحجم الخط
        AddSTD.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // إضافة Border دائري
        AddSTD.setFocusPainted(false); // إزالة تأثير الـ Focus
        OnClickEventHelper.setOnClickColor(AddSTD, Color.decode("#232323"), Color.decode("#2e2e2e")); // تغيير اللون عند الضغط
        panel.add(AddSTD); // إضافة الزر إلى الـ Panel

        JButton AddSubject = new JButton("Add Subject to Student"); // إنشاء زر لإضافة مادة لطالب
        AddSubject.setBounds(30, 130, 250, 50); // تحديد مكان وحجم الزر
        AddSubject.setBackground(Color.decode("#2e2e2e")); // تحديد لون الخلفية
        AddSubject.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        AddSubject.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20)); // تحديد الخط
        AddSubject.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // إضافة Border دائري
        AddSubject.setFocusPainted(false); // إزالة تأثير الـ Focus
        OnClickEventHelper.setOnClickColor(AddSubject, Color.decode("#232323"), Color.decode("#2e2e2e")); // تغيير اللون عند الضغط
        panel.add(AddSubject); // إضافة الزر للـ Panel

        JButton DspStdInfo = new JButton("Display Student Info"); // زر عرض بيانات الطالب
        DspStdInfo.setBounds(30, 190, 250, 50); // تحديد مكان وحجم الزر
        DspStdInfo.setBackground(Color.decode("#2e2e2e")); // لون الخلفية
        DspStdInfo.setForeground(Color.decode("#D9D9D9")); // لون النص
        DspStdInfo.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20)); // الخط
        DspStdInfo.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // البوردر
        DspStdInfo.setFocusPainted(false); // إزالة تأثير التركيز
        OnClickEventHelper.setOnClickColor(DspStdInfo, Color.decode("#232323"), Color.decode("#2e2e2e")); // تغيير اللون عند الضغط
        panel.add(DspStdInfo); // إضافة الزر للـ Panel

        JButton CalcStdGPA = new JButton("Calculate Student GPA"); // زر حساب GPA للطالب
        CalcStdGPA.setBounds(30, 250, 250, 50); // تحديد المكان والحجم
        CalcStdGPA.setBackground(Color.decode("#2e2e2e")); // لون الخلفية
        CalcStdGPA.setForeground(Color.decode("#D9D9D9")); // لون النص
        CalcStdGPA.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20)); // الخط
        CalcStdGPA.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // البوردر
        CalcStdGPA.setFocusPainted(false); // إزالة الـ Focus
        OnClickEventHelper.setOnClickColor(CalcStdGPA, Color.decode("#232323"), Color.decode("#2e2e2e")); // لون الضغط
        panel.add(CalcStdGPA); // إضافة الزر

        JButton RmStd = new JButton("Remove Student"); // زر حذف طالب
        RmStd.setBounds(30, 310, 250, 50); // تحديد المكان والحجم
        RmStd.setBackground(Color.decode("#2e2e2e")); // لون الخلفية
        RmStd.setForeground(Color.decode("#D9D9D9")); // لون النص
        RmStd.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20)); // الخط
        RmStd.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // البوردر
        RmStd.setFocusPainted(false); // إزالة الـ Focus
        OnClickEventHelper.setOnClickColor(RmStd, Color.decode("#232323"), Color.decode("#2e2e2e")); // لون الضغط
        panel.add(RmStd); // إضافة الزر

        JButton RmSubject = new JButton("Remove Subject"); // زر حذف مادة
        RmSubject.setBounds(30, 370, 250, 50); // تحديد المكان والحجم
        RmSubject.setBackground(Color.decode("#2e2e2e")); // لون الخلفية
        RmSubject.setForeground(Color.decode("#D9D9D9")); // لون النص
        RmSubject.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20)); // الخط
        RmSubject.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // البوردر
        RmSubject.setFocusPainted(false); // إزالة الـ Focus
        OnClickEventHelper.setOnClickColor(RmSubject, Color.decode("#232323"), Color.decode("#2e2e2e")); // لون الضغط
        panel.add(RmSubject); // إضافة الزر

        JButton showGrd = new JButton("Show Grade"); // زر عرض التقدير
        showGrd.setBounds(30, 430, 250, 50); // تحديد المكان والحجم
        showGrd.setBackground(Color.decode("#2e2e2e")); // لون الخلفية
        showGrd.setForeground(Color.decode("#D9D9D9")); // لون النص
        showGrd.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20)); // الخط
        showGrd.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // البوردر
        showGrd.setFocusPainted(false); // إزالة الـ Focus
        OnClickEventHelper.setOnClickColor(showGrd, Color.decode("#232323"), Color.decode("#2e2e2e")); // لون الضغط
        panel.add(showGrd); // إضافة الزر

        JButton DspAllSTD = new JButton("Display All Students"); // زر عرض كل الطلاب
        DspAllSTD.setBounds(30, 490, 250, 50); // تحديد المكان والحجم
        DspAllSTD.setBackground(Color.decode("#2e2e2e")); // لون الخلفية
        DspAllSTD.setForeground(Color.decode("#D9D9D9")); // لون النص
        DspAllSTD.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20)); // الخط
        DspAllSTD.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // البوردر
        DspAllSTD.setFocusPainted(false); // إزالة الـ Focus
        OnClickEventHelper.setOnClickColor(DspAllSTD, Color.decode("#232323"), Color.decode("#2e2e2e")); // لون الضغط
        panel.add(DspAllSTD); // إضافة الزر

        JButton HighGPA = new JButton("Show Student Highest GPA"); // زر عرض أعلى GPA
        HighGPA.setBounds(30, 550, 250, 50); // تحديد المكان والحجم
        HighGPA.setBackground(Color.decode("#2e2e2e")); // لون الخلفية
        HighGPA.setForeground(Color.decode("#D9D9D9")); // لون النص
        HighGPA.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20)); // الخط
        HighGPA.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // البوردر
        HighGPA.setFocusPainted(false); // إزالة الـ Focus
        OnClickEventHelper.setOnClickColor(HighGPA, Color.decode("#232323"), Color.decode("#2e2e2e")); // لون الضغط
        panel.add(HighGPA); // إضافة الزر

        JButton Exit = new JButton("Exit"); // زر الخروج من البرنامج
        Exit.setBounds(30, 610, 250, 50); // تحديد المكان والحجم
        Exit.setBackground(Color.decode("#2e2e2e")); // لون الخلفية
        Exit.setForeground(Color.decode("#D9D9D9")); // لون النص
        Exit.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20)); // الخط
        Exit.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // البوردر
        Exit.setFocusPainted(false); // إزالة الـ Focus
        OnClickEventHelper.setOnClickColor(Exit, Color.decode("#232323"), Color.decode("#2e2e2e")); // لون الضغط
        panel.add(Exit); // إضافة الزر

        OutputBox = new JTextArea(""); // إنشاء TextArea فارغة
        OutputBox.setBounds(300, 70, 680, 590); // تحديد المكان والحجم
        OutputBox.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 28)); // تحديد الخط
        OutputBox.setBackground(Color.decode("#B2B2B2")); // لون الخلفية
        OutputBox.setForeground(Color.decode("#000000")); // لون النص

        OutputBox.setBorder(BorderFactory.createCompoundBorder( // إنشاء Border مركب
                new RoundedBorder(2, Color.decode("#979797"), 0), // البوردر الخارجي
                BorderFactory.createEmptyBorder(10, 10, 10, 10) // إضافة Padding داخلي
        ));

        OnFocusEventHelper.setOnFocusText(OutputBox, "", Color.decode("#353535"), Color.decode("#656565")); // تغيير خصائص عند الـ Focus
        panel.add(OutputBox); // إضافة الـ TextArea للـ Panel

        frame.add(panel); // إضافة الـ Panel للنافذة
        frame.setVisible(true); // إظهار النافذة للمستخدم

        AddSTD.addActionListener(e -> { // حدث الضغط على زر Add Student
            AddStudentFrm addStudent = new AddStudentFrm(); // إنشاء Object من فورم إضافة طالب
            addStudent.AddSTD(); // تشغيل دالة إضافة الطالب
        });

        AddSubject.addActionListener(e -> { // حدث الضغط على زر Add Subject
            AddSubjectFrm addSubject = new AddSubjectFrm(); // إنشاء Object من فورم إضافة مادة
            addSubject.AddSBJ(); // تشغيل دالة إضافة مادة
        });

        DspStdInfo.addActionListener(e -> { // حدث الضغط على زر عرض بيانات الطالب
            GetIDFrm getID = new GetIDFrm(); // إنشاء فورم للحصول على ID
            getID.GetData(1); // استدعاء الدالة مع الخيار 1
        });

        CalcStdGPA.addActionListener(e -> { // حدث الضغط على زر حساب GPA
            GetIDFrm getID = new GetIDFrm(); // إنشاء فورم للحصول على ID
            getID.GetData(2); // استدعاء الدالة مع الخيار 2
        });

        RmStd.addActionListener(e -> { // حدث الضغط على زر حذف طالب
            GetIDFrm getID = new GetIDFrm(); // إنشاء فورم للحصول على ID
            getID.GetData(3); // استدعاء الدالة مع الخيار 3
        });

        RmSubject.addActionListener(e -> { // حدث الضغط على زر حذف مادة
            RemoveSubjectFrm rmSubject = new RemoveSubjectFrm(); // إنشاء فورم حذف مادة
            rmSubject.RemoveSBJ(); // تشغيل دالة حذف المادة
        });

        showGrd.addActionListener(e -> { // حدث الضغط على زر عرض التقدير
            GetIDFrm getID = new GetIDFrm(); // إنشاء فورم للحصول على ID
            getID.GetData(4); // استدعاء الدالة مع الخيار 4
        });

        DspAllSTD.addActionListener(e -> { // حدث الضغط على زر عرض كل الطلاب
            String AllStdNames = Students.DisplayAllStudents(); // تخزين أسماء الطلاب
            EduCoreFrm.OutputBox.setText(AllStdNames + "\n"); // عرض الأسماء داخل الـ OutputBox
        });

        HighGPA.addActionListener(e -> { // حدث الضغط على زر أعلى GPA
            String highestGPAInfo = Students.showHighestGPA(); // جلب بيانات أعلى GPA
            EduCoreFrm.OutputBox.setText(highestGPAInfo + "\n"); // عرض النتيجة داخل الـ OutputBox
        });

        Exit.addActionListener(e -> { // حدث الضغط على زر Exit
            System.exit(0); // إنهاء البرنامج
        });

    }
}
