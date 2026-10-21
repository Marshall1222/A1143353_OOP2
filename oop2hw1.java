import javax.swing.*;
import java.awt.*;

public class oop2hw1 extends JFrame {
    public oop2hw1() {
        setTitle("登入");
        setSize(300, 200);
        setVisible(true);
        setLayout(new FlowLayout());
        
        JLabel l1 = new JLabel("帳號:");
        JTextField t1 = new JTextField(10);
      
        JLabel l2 = new JLabel("密碼:");
        JTextField t2 = new JTextField(10);

        JButton btn = new JButton("登入");
        
        add(l1); add(t1); add(l2); add(t2); add(btn);
        
        btn.addActionListener(e -> {
            if (t1.getText().equals("admin") && t2.getText().equals("password")) {
                System.out.println("登入成功");
            }
        });
    }
    public static void main(String[] a) { new oop2hw1(); }
}