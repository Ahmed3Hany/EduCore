
import helper_classes.*; // استيراد جميع الكلاسات الموجودة داخل package اسمها helper_classes
import java.awt.Color; // استيراد كلاس Color للتحكم في الألوان
import javax.swing.*; // استيراد مكتبة Swing الخاصة بالواجهات الرسومية

public class AddStudentFrm { // تعريف كلاس اسمه AddStudentFrm

    public void AddSTD() { // دالة لإنشاء فورم إضافة طالب

        JFrame frame = new JFrame("Add Student"); // إنشاء نافذة جديدة بعنوان Add Student
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // إخفاء النافذة عند غلقها بدل إنهاء البرنامج
        frame.setSize(800, 350); // تحديد حجم النافذة
        frame.setResizable(false); // منع تغيير حجم النافذة
        frame.setLocationRelativeTo(null); // جعل النافذة تظهر في منتصف الشاشة

        JPanel panel = new JPanel(); // إنشاء Panel لوضع العناصر بداخله
        panel.setLayout(null); // استخدام Layout يدوي بالإحداثيات
        panel.setBackground(Color.decode("#1e1e1e")); // تحديد لون خلفية الـ Panel

        JLabel Header = new JLabel("Add Student"); // إنشاء عنوان للفورم
        Header.setBounds(285, 10, 230, 50); // تحديد مكان وحجم العنوان
        Header.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 42)); // تحميل خط مخصص للعنوان
        Header.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Header); // إضافة العنوان للـ Panel

        JLabel Label1 = new JLabel("Enter Student ID:"); // إنشاء Label لرقم الطالب
        Label1.setBounds(50, 80, 230, 30); // تحديد المكان والحجم
        Label1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        Label1.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Label1); // إضافة الـ Label للـ Panel

        JTextField InputID = new JTextField(""); // إنشاء TextField لإدخال ID الطالب
        InputID.setBounds(300, 80, 450, 30); // تحديد المكان والحجم
        InputID.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        InputID.setBackground(Color.decode("#B2B2B2")); // تحديد لون الخلفية
        InputID.setForeground(Color.decode("#656565")); // تحديد لون النص
        InputID.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0)); // إضافة Border دائري
        OnFocusEventHelper.setOnFocusText(InputID, "ID", Color.decode("#353535"), Color.decode("#656565")); // تغيير الخصائص عند الـ Focus
        panel.add(InputID); // إضافة الـ TextField للـ Panel

        JLabel Label2 = new JLabel("Enter Student Name:"); // إنشاء Label لاسم الطالب
        Label2.setBounds(50, 130, 230, 30); // تحديد المكان والحجم
        Label2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        Label2.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Label2); // إضافة الـ Label للـ Panel

        JTextField InputName = new JTextField(""); // إنشاء TextField لإدخال اسم الطالب
        InputName.setBounds(300, 130, 450, 30); // تحديد المكان والحجم
        InputName.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        InputName.setBackground(Color.decode("#B2B2B2")); // لون الخلفية
        InputName.setForeground(Color.decode("#656565")); // لون النص
        InputName.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0)); // إضافة Border دائري
        OnFocusEventHelper.setOnFocusText(InputName, "", Color.decode("#353535"), Color.decode("#656565")); // تغيير الخصائص عند الـ Focus
        panel.add(InputName); // إضافة الـ TextField للـ Panel

        JLabel Label3 = new JLabel("Enter Student Major:"); // إنشاء Label للتخصص
        Label3.setBounds(50, 180, 230, 30); // تحديد المكان والحجم
        Label3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        Label3.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Label3); // إضافة الـ Label للـ Panel

        JComboBox<String> MajorComboBox = new JComboBox<>(new String[]{"", // إنشاء ComboBox للتخصصات
            "Information Technology", // تخصص تكنولوجيا المعلومات
            "Railway Technology", // تخصص تكنولوجيا السكك الحديدية
            "Operating and Maintaining Textile Technology", // تشغيل وصيانة تكنولوجيا الغزل والنسيج
            "Food Industry Technology", // تكنولوجيا الصناعات الغذائية
            "Tractors and Agricultural Equipment Technology"}); // الجرارات والمعدات الزراعية

        MajorComboBox.setBounds(300, 180, 450, 30); // تحديد المكان والحجم
        MajorComboBox.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        MajorComboBox.setBackground(Color.decode("#B2B2B2")); // لون الخلفية
        MajorComboBox.setForeground(Color.decode("#656565")); // لون النص
        MajorComboBox.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0)); // إضافة Border دائري
        panel.add(MajorComboBox); // إضافة الـ ComboBox للـ Panel

        JButton BtnOK = new JButton("OK"); // إنشاء زر OK
        BtnOK.setBounds(270, 240, 108, 50); // تحديد المكان والحجم
        BtnOK.setBackground(Color.decode("#2e2e2e")); // لون الخلفية
        BtnOK.setForeground(Color.decode("#D9D9D9")); // لون النص
        BtnOK.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        BtnOK.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // إضافة Border دائري
        BtnOK.setFocusPainted(false); // إزالة تأثير الـ Focus
        OnClickEventHelper.setOnClickColor(BtnOK, Color.decode("#232323"), Color.decode("#2e2e2e")); // تغيير اللون عند الضغط
        panel.add(BtnOK); // إضافة الزر للـ Panel

        JButton BtnExit = new JButton("Cancel"); // إنشاء زر Cancel
        BtnExit.setBounds(400, 240, 108, 50); // تحديد المكان والحجم
        BtnExit.setBackground(Color.decode("#2e2e2e")); // لون الخلفية
        BtnExit.setForeground(Color.decode("#D9D9D9")); // لون النص
        BtnExit.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        BtnExit.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // إضافة Border دائري
        BtnExit.setFocusPainted(false); // إزالة تأثير الـ Focus
        OnClickEventHelper.setOnClickColor(BtnExit, Color.decode("#232323"), Color.decode("#2e2e2e")); // تغيير اللون عند الضغط
        panel.add(BtnExit); // إضافة الزر للـ Panel

        frame.add(panel); // إضافة الـ Panel للنافذة
        frame.setVisible(true); // إظهار النافذة

        BtnOK.addActionListener(e -> { // حدث الضغط على زر OK

            String inputid = InputID.getText().trim(); // جلب الـ ID وإزالة المسافات
            String inputname = InputName.getText().trim(); // جلب الاسم وإزالة المسافات
            String inputmajor = MajorComboBox.getSelectedItem().toString(); // جلب التخصص المختار

            if (inputid.isEmpty() || inputname.isEmpty() || inputmajor.isEmpty()) { // التحقق إذا كان هناك حقل فارغ
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE); // إظهار رسالة خطأ
            } else { // إذا كانت كل البيانات موجودة
                try { // محاولة تنفيذ الكود

                    int studentID = Integer.parseInt(inputid); // تحويل الـ ID إلى رقم صحيح

                    String STDName = Character.toUpperCase(inputname.charAt(0)) // تحويل أول حرف إلى Capital
                            + inputname.substring(1).toLowerCase(); // تحويل باقي الاسم إلى Small

                    String NewStdInfo = Students.AddStudent(studentID, STDName, inputmajor); // إضافة الطالب وتخزين النتيجة

                    if (NewStdInfo.equals("Student already exists.")) { // التحقق إذا كان الطالب موجود مسبقًا
                        JOptionPane.showMessageDialog(frame, "Student already exists.", "Error", JOptionPane.ERROR_MESSAGE); // إظهار رسالة خطأ
                    } else { // إذا تمت الإضافة بنجاح
                        EduCoreFrm.OutputBox.setText(NewStdInfo); // عرض بيانات الطالب داخل OutputBox
                        frame.dispose(); // غلق الفورم
                    }

                } catch (NumberFormatException ex) { // التقاط خطأ إذا كان الـ ID ليس رقمًا صحيحًا

                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid integer ID.",
                            "Input Error", JOptionPane.ERROR_MESSAGE); // إظهار رسالة خطأ

                }
            }
        });

        BtnExit.addActionListener(e -> { // حدث الضغط على زر Cancel
            frame.dispose(); // غلق الفورم
        });

    }
}
