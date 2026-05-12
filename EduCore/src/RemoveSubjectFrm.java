
import helper_classes.*; // استيراد جميع الكلاسات الموجودة داخل package اسمها helper_classes
import java.awt.Color; // استيراد كلاس Color للتحكم في الألوان
import javax.swing.*; // استيراد مكتبة Swing الخاصة بالواجهات الرسومية

public class RemoveSubjectFrm { // تعريف كلاس اسمه RemoveSubjectFrm

    public void RemoveSBJ() { // دالة لإنشاء فورم حذف مادة

        JFrame frame = new JFrame("Remove Subject"); // إنشاء نافذة جديدة بعنوان Remove Subject
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // إخفاء النافذة عند غلقها
        frame.setSize(600, 320); // تحديد حجم النافذة
        frame.setResizable(false); // منع تغيير حجم النافذة
        frame.setLocationRelativeTo(null); // جعل النافذة تظهر في منتصف الشاشة

        JPanel panel = new JPanel(); // إنشاء Panel لإضافة العناصر بداخله
        panel.setLayout(null); // استخدام Layout يدوي بالإحداثيات
        panel.setBackground(Color.decode("#1e1e1e")); // تحديد لون خلفية الـ Panel

        JLabel Header = new JLabel("Remove Subject"); // إنشاء عنوان للفورم
        Header.setBounds(135, 10, 310, 50); // تحديد مكان وحجم العنوان
        Header.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 42)); // تحديد نوع وحجم الخط
        Header.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Header); // إضافة العنوان للـ Panel

        JLabel Label1 = new JLabel("Enter Student ID:"); // إنشاء Label لرقم الطالب
        Label1.setBounds(54, 90, 190, 30); // تحديد المكان والحجم
        Label1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        Label1.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Label1); // إضافة الـ Label للـ Panel

        JTextField InputID = new JTextField(""); // إنشاء TextField لإدخال ID الطالب
        InputID.setBounds(268, 90, 250, 30); // تحديد المكان والحجم
        InputID.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        InputID.setBackground(Color.decode("#B2B2B2")); // تحديد لون الخلفية
        InputID.setForeground(Color.decode("#656565")); // تحديد لون النص
        InputID.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0)); // إضافة Border دائري
        OnFocusEventHelper.setOnFocusText(InputID, "ID", Color.decode("#353535"), Color.decode("#656565")); // تغيير الخصائص عند الـ Focus
        panel.add(InputID); // إضافة الـ TextField للـ Panel

        JLabel Label2 = new JLabel("Subject Name:"); // إنشاء Label لاسم المادة
        Label2.setBounds(54, 130, 190, 30); // تحديد المكان والحجم
        Label2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        Label2.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Label2); // إضافة الـ Label للـ Panel

        JComboBox<String> InputName = new JComboBox<>(new String[]{"", // إنشاء ComboBox لاختيار اسم المادة
            "Java", // مادة Java
            "Database 2", // مادة قواعد البيانات 2
            "Data Structure", // مادة هياكل البيانات
            "CCNA", // مادة الشبكات CCNA
            "Web Development 2"}); // مادة تطوير الويب 2

        InputName.setBounds(268, 130, 250, 30); // تحديد المكان والحجم
        InputName.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        InputName.setBackground(Color.decode("#B2B2B2")); // تحديد لون الخلفية
        InputName.setForeground(Color.decode("#656565")); // تحديد لون النص
        InputName.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0)); // إضافة Border دائري
        panel.add(InputName); // إضافة الـ ComboBox للـ Panel

        JButton BtnOK = new JButton("OK"); // إنشاء زر OK
        BtnOK.setBounds(170, 210, 108, 50); // تحديد المكان والحجم
        BtnOK.setBackground(Color.decode("#2e2e2e")); // تحديد لون الخلفية
        BtnOK.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        BtnOK.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        BtnOK.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // إضافة Border دائري
        BtnOK.setFocusPainted(false); // إزالة تأثير الـ Focus
        OnClickEventHelper.setOnClickColor(BtnOK, Color.decode("#232323"), Color.decode("#2e2e2e")); // تغيير اللون عند الضغط
        panel.add(BtnOK); // إضافة الزر للـ Panel

        JButton BtnExit = new JButton("Cancel"); // إنشاء زر Cancel
        BtnExit.setBounds(300, 210, 108, 50); // تحديد المكان والحجم
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

            String input = InputID.getText().trim(); // جلب الـ ID وإزالة المسافات
            String subjectName = InputName.getSelectedItem().toString(); // جلب اسم المادة المختارة

            if (input.isEmpty() || subjectName.isEmpty()) { // التحقق من أن الحقول ليست فارغة
                JOptionPane.showMessageDialog(frame, "Please enter both student ID and subject name.", "Input Error", JOptionPane.ERROR_MESSAGE); // عرض رسالة خطأ
            } else { // إذا كانت البيانات صحيحة

                try { // محاولة تنفيذ الكود

                    int studentID = Integer.parseInt(input); // تحويل الـ ID إلى Integer

                    String result = Subjects.RemoveSubject(studentID, subjectName); // حذف المادة من الطالب

                    if (!result.equals("Subject removed successfully.")) { // إذا لم تتم العملية بنجاح
                        JOptionPane.showMessageDialog(frame, result, "Success", JOptionPane.INFORMATION_MESSAGE); // عرض النتيجة في Message Dialog
                    } else { // إذا تمت العملية بنجاح
                        EduCoreFrm.OutputBox.setText(result); // عرض النتيجة داخل OutputBox
                        frame.dispose(); // غلق الفورم
                    }

                } catch (NumberFormatException ex) { // التقاط الخطأ إذا كانت القيمة ليست رقمًا صحيحًا

                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid integer ID.", "Input Error", JOptionPane.ERROR_MESSAGE); // عرض رسالة خطأ

                }
            }
        });

        BtnExit.addActionListener(e -> { // حدث الضغط على زر Cancel
            frame.dispose(); // غلق الفورم
        });

    }
}
