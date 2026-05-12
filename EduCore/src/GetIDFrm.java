
import helper_classes.*; // استيراد جميع الكلاسات الموجودة داخل package اسمها helper_classes
import java.awt.Color; // استيراد كلاس Color للتحكم في الألوان
import javax.swing.*; // استيراد مكتبة Swing الخاصة بالواجهات الرسومية

public class GetIDFrm { // تعريف كلاس اسمه GetIDFrm

    public void GetData(int operation) { // دالة تستقبل رقم العملية المطلوبة

        JFrame frame = new JFrame("Enter Student ID"); // إنشاء نافذة جديدة بعنوان Enter Student ID
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // إخفاء النافذة عند غلقها
        frame.setSize(600, 250); // تحديد حجم النافذة
        frame.setResizable(false); // منع تغيير حجم النافذة
        frame.setLocationRelativeTo(null); // جعل النافذة تظهر في منتصف الشاشة

        JPanel panel = new JPanel(); // إنشاء Panel لإضافة العناصر بداخله
        panel.setLayout(null); // استخدام Layout يدوي بالإحداثيات
        panel.setBackground(Color.decode("#1e1e1e")); // تحديد لون خلفية الـ Panel

        JLabel Header = new JLabel("Display Student Info"); // إنشاء عنوان للفورم
        Header.setBounds(100, 10, 380, 50); // تحديد مكان وحجم العنوان
        Header.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 42)); // تحديد الخط
        Header.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Header); // إضافة العنوان للـ Panel

        JLabel Label = new JLabel("Enter Student ID:"); // إنشاء Label لرقم الطالب
        Label.setBounds(54, 90, 190, 30); // تحديد المكان والحجم
        Label.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        Label.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        panel.add(Label); // إضافة الـ Label للـ Panel

        JTextField InputID = new JTextField(""); // إنشاء TextField لإدخال رقم الطالب
        InputID.setBounds(268, 90, 250, 30); // تحديد المكان والحجم
        InputID.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        InputID.setBackground(Color.decode("#B2B2B2")); // تحديد لون الخلفية
        InputID.setForeground(Color.decode("#656565")); // تحديد لون النص
        InputID.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0)); // إضافة Border دائري
        OnFocusEventHelper.setOnFocusText(InputID, "ID", Color.decode("#353535"), Color.decode("#656565")); // تغيير الخصائص عند الـ Focus
        panel.add(InputID); // إضافة الـ TextField للـ Panel

        JButton BtnOK = new JButton("OK"); // إنشاء زر OK
        BtnOK.setBounds(170, 150, 108, 50); // تحديد المكان والحجم
        BtnOK.setBackground(Color.decode("#2e2e2e")); // تحديد لون الخلفية
        BtnOK.setForeground(Color.decode("#D9D9D9")); // تحديد لون النص
        BtnOK.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 24)); // تحديد الخط
        BtnOK.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1)); // إضافة Border دائري
        BtnOK.setFocusPainted(false); // إزالة تأثير الـ Focus
        OnClickEventHelper.setOnClickColor(BtnOK, Color.decode("#232323"), Color.decode("#2e2e2e")); // تغيير اللون عند الضغط
        panel.add(BtnOK); // إضافة الزر للـ Panel

        JButton BtnExit = new JButton("Cancel"); // إنشاء زر Cancel
        BtnExit.setBounds(300, 150, 108, 50); // تحديد المكان والحجم
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

            if (input.isEmpty()) { // التحقق إذا كان الحقل فارغ
                JOptionPane.showMessageDialog(frame, "Please enter a student ID.", "Input Error", JOptionPane.ERROR_MESSAGE); // عرض رسالة خطأ
            } else { // إذا تم إدخال قيمة

                try { // محاولة تنفيذ الكود

                    int studentID = Integer.parseInt(input); // تحويل الـ ID إلى Integer

                    switch (operation) { // اختيار العملية حسب الرقم المرسل

                        case 1 -> { // العملية رقم 1 = عرض بيانات الطالب

                            String GetstudentInfo = Students.DisplayStudentInfo(studentID); // جلب بيانات الطالب

                            if (GetstudentInfo.equals("Student not found.")) { // التحقق إذا لم يتم العثور على الطالب
                                JOptionPane.showMessageDialog(frame, GetstudentInfo, "Error", JOptionPane.ERROR_MESSAGE); // عرض رسالة خطأ
                            } else { // إذا تم العثور على الطالب
                                EduCoreFrm.OutputBox.setText(GetstudentInfo); // عرض البيانات داخل OutputBox
                                frame.dispose(); // غلق الفورم
                            }
                        }

                        case 2 -> { // العملية رقم 2 = حساب GPA

                            String CalculateGPA = ManagementSystem.CalculateGPA(studentID); // حساب GPA الطالب

                            if (CalculateGPA.equals("Student not found.")) { // التحقق إذا لم يتم العثور على الطالب
                                JOptionPane.showMessageDialog(frame, CalculateGPA, "Error", JOptionPane.ERROR_MESSAGE); // عرض رسالة خطأ
                            } else { // إذا تم العثور على الطالب
                                EduCoreFrm.OutputBox.setText(CalculateGPA); // عرض GPA داخل OutputBox
                                frame.dispose(); // غلق الفورم
                            }
                        }

                        case 3 -> { // العملية رقم 3 = حذف الطالب

                            String RemoveSTD = Students.RemoveStudentInfo(studentID); // حذف بيانات الطالب

                            if (RemoveSTD.equals("Student not found.")) { // التحقق إذا لم يتم العثور على الطالب
                                JOptionPane.showMessageDialog(frame, RemoveSTD, "Error", JOptionPane.ERROR_MESSAGE); // عرض رسالة خطأ
                            } else { // إذا تم حذف الطالب بنجاح
                                EduCoreFrm.OutputBox.setText(RemoveSTD); // عرض النتيجة داخل OutputBox
                                frame.dispose(); // غلق الفورم
                            }
                        }

                        case 4 -> { // العملية رقم 4 = عرض التقدير

                            String getGrade = ManagementSystem.showGrade(studentID); // جلب تقدير الطالب

                            if (getGrade.equals("Student not found.")) { // التحقق إذا لم يتم العثور على الطالب
                                JOptionPane.showMessageDialog(frame, getGrade, "Error", JOptionPane.ERROR_MESSAGE); // عرض رسالة خطأ
                            } else { // إذا تم العثور على الطالب
                                EduCoreFrm.OutputBox.setText(getGrade); // عرض التقدير داخل OutputBox
                                frame.dispose(); // غلق الفورم
                            }
                        }
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
