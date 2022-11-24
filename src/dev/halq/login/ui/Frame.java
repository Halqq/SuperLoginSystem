package dev.halq.login.ui;

import dev.halq.login.sendrequest.NewUserRequest;
import dev.halq.login.verifylogin.GetInfos;

import javax.swing.*;
import java.awt.*;

/**
 * @author Halq
 * @since 22/11/2022 at 19:57
 */

public class Frame {

    static JFrame frame;
    static JPanel mainP, p1, p2, p3, p4, p5;
    static JButton b1, b2;
    static JTextField t1;
    static JPasswordField t2;

    public static void mainUI() {
        frame = new JFrame("Login - made by Halq");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        mainP = new JPanel();

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();

        b1 = new JButton("Login");
        b2 = new JButton("Register");

        p1.add(b1);
        p1.setBounds(-65, 260, 300, 300);

        p2.add(b2);
        p2.setBounds(130, 260, 200, 300);

        p4.add(new JLabel("Pass:"));
        p4.add(t2 = new JPasswordField(13));
        p4.setBounds(0, 50, 300, 100);

        p3.add(new JLabel("Username:"));
        p3.add(t1 = new JTextField(10));
        p3.setBounds(0, 0, 300, 100);

        b1.addActionListener(e -> {
            String user = t1.getText();
            String pass = t2.getText();
            try {
                GetInfos.readUrl(user, pass);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            if(GetInfos.isUser){
                JOptionPane.showMessageDialog(null, "login is valid");
            } else {
                JOptionPane.showMessageDialog(null, "login is invalid, try again");
            }
        });

        b2.addActionListener(e -> {
            String user = t1.getText();
            String pass = t2.getText();

            NewUserRequest.send(user, pass);

            JOptionPane.showMessageDialog(null, "Request send to login admin, wait for accept");
        });

        frame.add(p5);
        frame.add(p4);
        frame.add(p3);
        frame.add(p2);
        frame.add(p1);

        mainP.setPreferredSize(new Dimension(300, 300));
        frame.add(mainP, BorderLayout.CENTER);
        frame.setLocation(150, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();

        frame.setVisible(true);
    }
}
