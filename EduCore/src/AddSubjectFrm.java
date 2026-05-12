
import helper_classes.*; // استيراد جميع الكلاسات الموجودة داخل package اسمها helper_classes
import java.awt.Color; // استيراد كلاس Color للتحكم في الألوان
import javax.swing.*; // استيراد مكتبة Swing الخاصة بالواجهات الرسومية

public class AddSubjectFrm { // تعريف كلاس اسمه AddSubjectFrm

    public void AddSBJ() { // دالة لإنشاء فورم إضافة مادة

        JFrame frame = new JFrame("Add Subject"); // إنشاء نافذة جديدة بعنوان Add Subject
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // إخفاء النافذة عند غلقها
        frame.setSize(900, 400); // تحديد حجم النافذة
        frame.setResizable(false); // منع تغيير حجم النافذة
        frame.setLocationRelativeTo(null); // جعل النافذة تظهر في منتصف الشاشة

        JPanel panel = new JPanel(); // إنشاء Panel لإضافة العناصر بداخله
        panel.setLayout(null); // استخدام Layout يدوي بالإحداثيات
        panel.setBackground(Color.decode("#1e1e1e")); // تحديد لون خلفية الـ Panel

        JLabel Header = new JLabel("Add Subject"); // إنشاء عنوان للفورم
        Header.setBounds(330, 10, 230, 50); // تحديد مكان وحجم العنوان
        Header.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 42)); // تحديد نوع وحجم الخط
        Header.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Header); // إضافة العنوان للـ Panel

        JLabel Label1 = new JLabel("Enter Student ID:"); // إنشاء Label لرقم الطالب
        Label1.setBounds(50, 80, 230, 30); // تحديد المكان والحجم
        Label1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        Label1.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Label1); // إضافة الـ Label للـ Panel

        JTextField InputID = new JTextField(""); // إنشاء TextField لإدخال ID الطالب
        InputID.setBounds(380, 80, 450, 30); // تحديد المكان والحجم
        InputID.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        InputID.setBackground(Color.decode("#B2B2B2")); // تحديد لون الخلفية
        InputID.setForeground(Color.decode("#656565")); // تحديد لون النص
        InputID.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0)); // إضافة Border دائري
        OnFocusEventHelper.setOnFocusText(InputID, "ID", Color.decode("#353535"), Color.decode("#656565")); // تغيير الخصائص عند الـ Focus
        panel.add(InputID); // إضافة الـ TextField للـ Panel

        JLabel Label2 = new JLabel("Enter Subject Name:"); // إنشاء Label لاسم المادة
        Label2.setBounds(50, 130, 230, 30); // تحديد المكان والحجم
        Label2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        Label2.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Label2); // إضافة الـ Label للـ Panel

        JComboBox<String> InputName = new JComboBox<>(new String[]{"", // إنشاء ComboBox لاختيار اسم المادة
            "Java", // مادة Java
            "Database 2", // مادة قواعد البيانات 2
            "Data Structure", // مادة هياكل البيانات
            "CCNA", // مادة الشبكات CCNA
            "Web Development 2"}); // مادة تطوير الويب 2

        InputName.setBounds(380, 130, 450, 30); // تحديد المكان والحجم
        InputName.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        InputName.setBackground(Color.decode("#B2B2B2")); // تحديد لون الخلفية
        InputName.setForeground(Color.decode("#656565")); // تحديد لون النص
        InputName.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0)); // إضافة Border دائري
        panel.add(InputName); // إضافة الـ ComboBox للـ Panel

        JLabel Label3 = new JLabel("Enter Subject Credit Hours:"); // إنشاء Label لعدد الساعات
        Label3.setBounds(50, 180, 300, 30); // تحديد المكان والحجم
        Label3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        Label3.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Label3); // إضافة الـ Label للـ Panel

        JTextField InputCreditHours = new JTextField(""); // إنشاء TextField لإدخال عدد الساعات
        InputCreditHours.setBounds(380, 180, 450, 30); // تحديد المكان والحجم
        InputCreditHours.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        InputCreditHours.setBackground(Color.decode("#B2B2B2")); // تحديد لون الخلفية
        InputCreditHours.setForeground(Color.decode("#656565")); // تحديد لون النص
        InputCreditHours.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0)); // إضافة Border دائري
        OnFocusEventHelper.setOnFocusText(InputCreditHours, "", Color.decode("#353535"), Color.decode("#656565")); // تغيير الخصائص عند الـ Focus
        panel.add(InputCreditHours); // إضافة الـ TextField للـ Panel

        JLabel Label4 = new JLabel("Enter Subject GPA:"); // إنشاء Label لإدخال GPA المادة
        Label4.setBounds(50, 230, 230, 30); // تحديد المكان والحجم
        Label4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        Label4.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Label4); // إضافة الـ Label للـ Panel

        JTextField InputGPA = new JTextField(""); // إنشاء TextField لإدخال GPA
        InputGPA.setBounds(380, 230, 450, 30); // تحديد المكان والحجم
        InputGPA.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        InputGPA.setBackground(Color.decode("#B2B2B2")); // تحديد لون الخلفية
        InputGPA.setForeground(Color.decode("#656565")); // تحديد لون النص
        InputGPA.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0)); // إضافة Border دائري
        OnFocusEventHelper.setOnFocusText(InputGPA, "", Color.decode("#353535"), Color.decode("#656565")); // تغيير الخصائص عند الـ Focus
        panel.add(InputGPA); // إضافة الـ TextField للـ Panel

        JButton BtnOK = new JButton("OK"); // إنشاء زر OK
        BtnOK.setBounds(320, 290, 108, 50); // تحديد المكان والحجم
        BtnOK.setBackground(Color.decode("#2e2e2e")); // تحديد لون الخلفية
        BtnOK.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        BtnOK.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        BtnOK.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // إضافة Border دائري
        BtnOK.setFocusPainted(false); // إزالة تأثير الـ Focus
        OnClickEventHelper.setOnClickColor(BtnOK, Color.decode("#232323"), Color.decode("#2e2e2e")); // تغيير اللون عند الضغط
        panel.add(BtnOK); // إضافة الزر للـ Panel

        JButton BtnExit = new JButton("Cancel"); // إنشاء زر Cancel
        BtnExit.setBounds(450, 290, 108, 50); // تحديد المكان والحجم
        BtnExit.setBackground(Color.decode("#2e2e2e")); // تحديد لون الخلفية
        BtnExit.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        BtnExit.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        BtnExit.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // إضافة Border دائري
        BtnExit.setFocusPainted(false); // إزالة تأثير الـ Focus
        OnClickEventHelper.setOnClickColor(BtnExit, Color.decode("#232323"), Color.decode("#2e2e2e")); // تغيير اللون عند الضغط
        panel.add(BtnExit); // إضافة الزر للـ Panel

        frame.add(panel); // إضافة الـ Panel للنافذة
        frame.setVisible(true); // إظهار النافذة

        BtnOK.addActionListener(e -> { // حدث الضغط على زر OK

            String inputid = InputID.getText().trim(); // جلب ID الطالب وإزالة المسافات
            String inputname = InputName.getSelectedItem().toString(); // جلب اسم المادة المختارة
            String creditHours = InputCreditHours.getText().trim(); // جلب عدد الساعات
            String gpa = InputGPA.getText().trim(); // جلب GPA المادة

            if (inputid.isEmpty() || inputname.isEmpty() || creditHours.isEmpty() || gpa.isEmpty()) { // التحقق من أن كل الحقول ممتلئة
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE); // عرض رسالة خطأ
            } else { // إذا كانت البيانات صحيحة
                try { // محاولة تنفيذ الكود

                    int id = Integer.parseInt(inputid); // تحويل الـ ID إلى رقم صحيح
                    int creditHrs = Integer.parseInt(creditHours); // تحويل عدد الساعات إلى Integer
                    double gpaValue = Double.parseDouble(gpa); // تحويل GPA إلى Double

                    String result = Subjects.AddSubject(id, inputname, creditHrs, gpaValue); // إضافة المادة للطالب

                    if (!result.equals("Subject added successfully.")) { // إذا لم تتم الإضافة بنجاح
                        JOptionPane.showMessageDialog(frame, result, "Error", JOptionPane.ERROR_MESSAGE); // عرض رسالة الخطأ
                    } else { // إذا تمت الإضافة بنجاح
                        EduCoreFrm.OutputBox.setText(result); // عرض النتيجة داخل OutputBox
                        frame.dispose(); // غلق الفورم
                    }

                } catch (NumberFormatException ex) { // التقاط الخطأ إذا تم إدخال قيم غير رقمية

                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid integer ID.",
                            "Input Error", JOptionPane.ERROR_MESSAGE); // عرض رسالة خطأ

                }
            }
        });

        BtnExit.addActionListener(e -> { // حدث الضغط على زر Cancel
            frame.dispose(); // غلق الفورم
        });

    }
}
