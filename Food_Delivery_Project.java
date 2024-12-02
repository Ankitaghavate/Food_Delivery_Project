import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.event.ActionListener;
public class Food_Delivery_Project extends JFrame implements ActionListener {
    JPanel jp1, jp2, jp3, jp4, jp5, jp7, jp8, jp9;
    JTabbedPane tp1;
    JLabel l1, l2, l3, l5, l6, l7, bl5,l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25;
    JTextField t1, t2, t3, t4, t5, jt2, jt3;
    JPasswordField p1, p2;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, jb9, jb10,b14, jb11, jb12, jbd9, jbd10, jbd11, jbd12, jb6, jbc6, b13;
    JTextArea ta1, jta1;
    Food_Delivery_Project()
    {
        super("Food Delivery Project");
        Container c = getContentPane();

        jp1 = new JPanel();
        jp1.setLayout(null);
        jp1.setBounds(600, 200, 700, 600);
        jp1.setBackground(Color.gray);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/food_image_1.png"));
        Image i2 = i1.getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l5 = new JLabel(i3);
        l5.setBounds(0, 0, 700, 500);
        jp1.add(l5);

        jp2 = new JPanel();
        jp2.setLayout(null);
        jp2.setBounds(600, 200, 700, 600);
        jp2.setBackground(Color.PINK);

        b4 = new JButton("Click me...!");
        b4.setBounds(230, 510, 200, 30);
        b4.setFont(new Font("Times new roman", Font.BOLD, 20));
        b4.setForeground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        b4.addActionListener(this);
        b4.setToolTipText("This is a Button");
        jp1.add(b4);

        l1 = new JLabel("Login Page...!");
        l1.setBounds(250, 40, 500, 40);
        l1.setFont(new Font("Times new roman", Font.BOLD, 28));
        l1.setForeground(Color.RED);
        jp2.add(l1);

        l2 = new JLabel("Mobile No: ");
        l2.setBounds(150, 120, 200, 40);
        l2.setFont(new Font("Times new roman", Font.BOLD, 20));
        l2.setForeground(Color.BLACK);
        jp2.add(l2);

        l3 = new JLabel("Password: ");
        l3.setBounds(150, 200, 200, 40);
        l3.setFont(new Font("Times new roman", Font.BOLD, 20));
        l3.setForeground(Color.BLACK);
        jp2.add(l3);

        t1 = new JTextField();
        t1.setBounds(300, 120, 200, 30);
        t1.setFont(new Font("Times new roman", Font.BOLD, 20));
        t1.setForeground(Color.BLACK);
        jp2.add(t1);

        p1 = new JPasswordField();
        p1.setBounds(300, 200, 200, 30);
        p1.setFont(new Font("Times new roman", Font.BOLD, 20));
        p1.setForeground(Color.BLACK);
        jp2.add(p1);

        b1 = new JButton("Go To Home Page");
        b1.setBounds(240, 400, 200, 30);
        b1.setFont(new Font("Times new roman", Font.BOLD, 20));
        b1.setForeground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        b1.setToolTipText("This is a Home Page Button");
        jp2.add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(310, 300, 100, 30);
        b2.setFont(new Font("Times new roman", Font.BOLD, 20));
        b2.setForeground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        jp2.add(b2);

        b3 = new JButton("Clear");
        b3.setBounds(450, 300, 100, 30);
        b3.setFont(new Font("Times new roman", Font.BOLD, 20));
        b3.setForeground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.addActionListener(this);
        jp2.add(b3);

        b5 = new JButton("New User");
        b5.setBounds(150, 300, 120, 30);
        b5.setFont(new Font("Times new roman", Font.BOLD, 18));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.white);
        b5.addActionListener(this);
        jp2.add(b5);

        tp1 = new JTabbedPane();
        tp1.setBounds(600, 200, 700, 600);
        tp1.setBackground(Color.WHITE);

        jp3 = new JPanel();
        jp3.setLayout(null);
        jp3.setBounds(600, 200, 700, 600);
        tp1.add("Food", jp3);

        ImageIcon pi1 = new ImageIcon(ClassLoader.getSystemResource("icon/pav-bhaji.jpg"));
        Image pi2 = pi1.getImage().getScaledInstance(200, 180, Image.SCALE_DEFAULT);
        ImageIcon p3 = new ImageIcon(pi2);
        JLabel pl1 = new JLabel(p3);
        pl1.setBounds(70, 30, 200, 180);
        jp3.add(pl1);

        b9 = new JButton("Pav bhaji");
        b9.setBounds(100, 230, 100, 30);
        b9.setFont(new Font("Times new roman", Font.BOLD, 16));
        b9.setForeground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setBackground(Color.BLACK);
        b9.addActionListener(this);
        jp3.add(b9);

        ImageIcon f1 = new ImageIcon(ClassLoader.getSystemResource("icon/food1.jpg"));
        Image f2 = f1.getImage().getScaledInstance(200, 180, Image.SCALE_DEFAULT);
        ImageIcon f3 = new ImageIcon(f2);
        JLabel fl1 = new JLabel(f3);
        fl1.setBounds(390, 30, 200, 180);
        jp3.add(fl1);

        b10 = new JButton("Bargar");
        b10.setBounds(450, 230, 100, 30);
        b10.setFont(new Font("Times new roman", Font.BOLD, 16));
        b10.setForeground(Color.BLACK);
        b10.setForeground(Color.WHITE);
        b10.setBackground(Color.BLACK);
        b10.addActionListener(this);
        jp3.add(b10);

        ImageIcon pp1 = new ImageIcon(ClassLoader.getSystemResource("icon/Pani-Puri.jpg"));
        Image pp2 = pp1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon pp3 = new ImageIcon(pp2);
        JLabel pp4 = new JLabel(pp3);
        pp4.setBounds(70, 280, 200, 200);
        jp3.add(pp4);

        b11 = new JButton("Pani puri");
        b11.setBounds(100, 500, 100, 30);
        b11.setFont(new Font("Times new roman", Font.BOLD, 16));
        b11.setForeground(Color.BLACK);
        b11.setForeground(Color.WHITE);
        b11.setBackground(Color.BLACK);
        b11.addActionListener(this);
        jp3.add(b11);

        ImageIcon di1 = new ImageIcon(ClassLoader.getSystemResource("icon/dosa-image.jpg"));
        Image di2 = di1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon di3 = new ImageIcon(di2);
        JLabel di4 = new JLabel(di3);
        di4.setBounds(390, 280, 200, 200);
        jp3.add(di4);

        b12 = new JButton("Dosa");
        b12.setBounds(450, 500, 100, 30);
        b12.setFont(new Font("Times new roman", Font.BOLD, 16));
        b12.setForeground(Color.BLACK);
        b12.setForeground(Color.WHITE);
        b12.setBackground(Color.BLACK);
        b12.addActionListener(this);
        jp3.add(b12);

        jp9 = new JPanel();
        jp9.setLayout(null);
        jp9.setBounds(600, 200, 700, 600);
        jp9.setBackground(Color.pink);
        add(jp9);

        JLabel l26 = new JLabel("Fill the Details");
        l26.setBounds(250, 40, 200, 40);
        l26.setFont(new Font("Times new roman", Font.BOLD, 28));
        l26.setForeground(Color.BLACK);
        jp9.add(l26);

        JLabel jl7 = new JLabel("Enter Name:");
        jl7.setFont(new Font("Times new roman", Font.BOLD, 23));
        jl7.setBounds(120, 130, 130, 40);
        jl7.setForeground(Color.BLACK);
        jp9.add(jl7);

        jt2 = new JTextField();
        jt2.setBounds(300, 130, 240, 30);
        jt2.setFont(new Font("Times new roman", Font.BOLD, 20));
        jt2.setForeground(Color.BLACK);
        jp9.add(jt2);

        JLabel jl8 = new JLabel("Mobile No:");
        jl8.setFont(new Font("Times new roman", Font.BOLD, 23));
        jl8.setBounds(120, 200, 130, 40);
        jl8.setForeground(Color.BLACK);
        jp9.add(jl8);

        jt3 = new JTextField();
        jt3.setBounds(300, 200, 240, 30);
        jt3.setFont(new Font("Times new roman", Font.BOLD, 20));
        jt3.setForeground(Color.BLACK);
        jp9.add(jt3);

        JLabel jl9 = new JLabel("Address:");
        jl9.setFont(new Font("Times new roman", Font.BOLD, 23));
        jl9.setBounds(120, 280, 130, 40);
        jl9.setForeground(Color.BLACK);
        jp9.add(jl9);

        jta1 = new JTextArea(70, 10);
        jta1.setBounds(300, 280, 240, 70);
        jta1.setFont(new Font("Times new roman", Font.BOLD, 20));
        jta1.setForeground(Color.BLACK);
        jp9.add(jta1);

        jb6 = new JButton("Order");
        jb6.setBounds(350, 400, 120, 30);
        jb6.setFont(new Font("Times new roman", Font.BOLD, 20));
        jb6.setForeground(Color.WHITE);
        jb6.setBackground(Color.BLACK);
        jb6.addActionListener(this);
        jp9.add(jb6);

        jbc6 = new JButton("Exit");
        jbc6.setBounds(480, 400, 120, 30);
        jbc6.setFont(new Font("Times new roman", Font.BOLD, 20));
        jbc6.setForeground(Color.WHITE);
        jbc6.setBackground(Color.BLACK);
        jbc6.addActionListener(this);
        jp9.add(jbc6);

        jp4 = new JPanel();
        jp4.setLayout(null);
        jp4.setBounds(0, 0, 700, 600);
        tp1.add("Ice-Cream", jp4);

        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("icon/ice-cream_1.jpg"));
        Image ic2 = ic1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon ic3 = new ImageIcon(ic2);
        JLabel ic4 = new JLabel(ic3);
        ic4.setBounds(70, 30, 200, 200);
        jp4.add(ic4);

        jb9 = new JButton("Chocolate");
        jb9.setBounds(100, 240, 120, 30);
        jb9.setFont(new Font("Times new roman", Font.BOLD, 16));
        jb9.setForeground(Color.BLACK);
        jb9.setForeground(Color.WHITE);
        jb9.setBackground(Color.BLACK);
        jb9.addActionListener(this);
        jp4.add(jb9);

        ImageIcon ici1 = new ImageIcon(ClassLoader.getSystemResource("icon/ice-cream2.jpg"));
        Image ici2 = ici1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon ici3 = new ImageIcon(ici2);
        JLabel ici4 = new JLabel(ici3);
        ici4.setBounds(390, 30, 200, 200);
        jp4.add(ici4);

        jb10 = new JButton("Vanilla");
        jb10.setBounds(450, 240, 100, 30);
        jb10.setFont(new Font("Times new roman", Font.BOLD, 16));
        jb10.setForeground(Color.BLACK);
        jb10.setForeground(Color.WHITE);
        jb10.setBackground(Color.BLACK);
        jb10.addActionListener(this);
        jp4.add(jb10);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/mango.jpg"));
        Image ii2 = ii1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel ii4 = new JLabel(ii3);
        ii4.setBounds(70, 280, 200, 200);
        jp4.add(ii4);

        jb11 = new JButton("Mango");
        jb11.setBounds(100, 500, 100, 30);
        jb11.setFont(new Font("Times new roman", Font.BOLD, 16));
        jb11.setForeground(Color.BLACK);
        jb11.setForeground(Color.WHITE);
        jb11.setBackground(Color.BLACK);
        jb11.addActionListener(this);
        jp4.add(jb11);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/ice-cream-5.jpg"));
        Image iii2 = iii1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iii4 = new JLabel(iii3);
        iii4.setBounds(390, 280, 200, 200);
        jp4.add(iii4);

        jb12 = new JButton("Coney");
        jb12.setBounds(450, 500, 100, 30);
        jb12.setFont(new Font("Times new roman", Font.BOLD, 16));
        jb12.setForeground(Color.BLACK);
        jb12.setForeground(Color.WHITE);
        jb12.setBackground(Color.BLACK);
        jb12.addActionListener(this);
        jp4.add(jb12);

        jp5 = new JPanel();
        jp5.setLayout(null);
        jp5.setBounds(600, 200, 700, 600);
        tp1.add("Drinks", jp5);

        ImageIcon dii1 = new ImageIcon(ClassLoader.getSystemResource("icon/cold-coffee.jpg"));
        Image dii2 = dii1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon dii3 = new ImageIcon(dii2);
        JLabel dii4 = new JLabel(dii3);
        dii4.setBounds(70, 30, 200, 200);
        jp5.add(dii4);

        jbd9 = new JButton("Cold-Coffee");
        jbd9.setBounds(100, 240, 120, 30);
        jbd9.setFont(new Font("Times new roman", Font.BOLD, 16));
        jbd9.setForeground(Color.BLACK);
        jbd9.setForeground(Color.WHITE);
        jbd9.setBackground(Color.BLACK);
        jbd9.addActionListener(this);
        jp5.add(jbd9);

        ImageIcon diii1 = new ImageIcon(ClassLoader.getSystemResource("icon/Drink.jpg"));
        Image diii2 = diii1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon diii3 = new ImageIcon(diii2);
        JLabel diii4 = new JLabel(diii3);
        diii4.setBounds(390, 30, 200, 200);
        jp5.add(diii4);

        jbd10 = new JButton("Strawberry");
        jbd10.setBounds(430, 240, 140, 30);
        jbd10.setFont(new Font("Times new roman", Font.BOLD, 16));
        jbd10.setForeground(Color.BLACK);
        jbd10.setForeground(Color.WHITE);
        jbd10.setBackground(Color.BLACK);
        jbd10.addActionListener(this);
        jp5.add(jbd10);

        ImageIcon diiii1 = new ImageIcon(ClassLoader.getSystemResource("icon/Cold-Drink.jpg"));
        Image diiii2 = diiii1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon diiii3 = new ImageIcon(diiii2);
        JLabel diiii4 = new JLabel(diiii3);
        diiii4.setBounds(70, 280, 200, 200);
        jp5.add(diiii4);

        jbd11 = new JButton("Thumbs Up");
        jbd11.setBounds(100, 500, 120, 30);
        jbd11.setFont(new Font("Times new roman", Font.BOLD, 16));
        jbd11.setForeground(Color.BLACK);
        jbd11.setForeground(Color.WHITE);
        jbd11.setBackground(Color.BLACK);
        jbd11.addActionListener(this);
        jp5.add(jbd11);

        ImageIcon diiiii1 = new ImageIcon(ClassLoader.getSystemResource("icon/drink-image4.jpg"));
        Image diiiii2 = diiiii1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon diiiii3 = new ImageIcon(diiiii2);
        JLabel diiiii4 = new JLabel(diiiii3);
        diiiii4.setBounds(390, 280, 200, 200);
        jp5.add(diiiii4);

        jbd12 = new JButton("Maza");
        jbd12.setBounds(450, 500, 100, 30);
        jbd12.setFont(new Font("Times new roman", Font.BOLD, 16));
        jbd12.setForeground(Color.BLACK);
        jbd12.setForeground(Color.WHITE);
        jbd12.setBackground(Color.BLACK);
        jbd12.addActionListener(this);
        jp5.add(jbd12);

        jp7 = new JPanel();
        jp7.setLayout(null);
        jp7.setBounds(600, 200, 700, 600);
        jp7.setBackground(Color.PINK);
        add(jp7);

        l6 = new JLabel("Create New Account");
        l6.setFont(new Font("Times new roman", Font.BOLD, 26));
        l6.setBounds(220, 30, 350, 40);
        //  l6.setForeground(Color.RED);
        jp7.add(l6);

        l7 = new JLabel("Enter Name:");
        l7.setFont(new Font("Times new roman", Font.BOLD, 23));
        l7.setBounds(120, 100, 130, 40);
        l7.setForeground(Color.BLACK);
        jp7.add(l7);

        t2 = new JTextField();
        t2.setBounds(300, 100, 240, 30);
        t2.setFont(new Font("Times new roman", Font.BOLD, 20));
        t2.setForeground(Color.BLACK);
        jp7.add(t2);

        l8 = new JLabel("Password:");
        l8.setFont(new Font("Times new roman", Font.BOLD, 23));
        l8.setBounds(120, 150, 130, 40);
        l8.setForeground(Color.BLACK);
        jp7.add(l8);

        p2 = new JPasswordField();
        p2.setBounds(300, 150, 240, 30);
        p2.setFont(new Font("Times new roman", Font.BOLD, 20));
        p2.setForeground(Color.BLACK);
        jp7.add(p2);

        l9 = new JLabel("Address:");
        l9.setFont(new Font("Times new roman", Font.BOLD, 23));
        l9.setBounds(120, 200, 130, 40);
        l9.setForeground(Color.BLACK);
        jp7.add(l9);

        ta1 = new JTextArea(70, 10);
        ta1.setBounds(300, 200, 240, 70);
        ta1.setFont(new Font("Times new roman", Font.BOLD, 20));
        ta1.setForeground(Color.BLACK);
        jp7.add(ta1);

        l10 = new JLabel("Mobile No:");
        l10.setFont(new Font("Times new roman", Font.BOLD, 23));
        l10.setBounds(120, 300, 130, 40);
        l10.setForeground(Color.BLACK);
        jp7.add(l10);

        t3 = new JTextField();
        t3.setBounds(300, 300, 240, 30);
        t3.setFont(new Font("Times new roman", Font.BOLD, 20));
        t3.setForeground(Color.BLACK);
        jp7.add(t3);

        l11 = new JLabel("City:");
        l11.setFont(new Font("Times new roman", Font.BOLD, 23));
        l11.setBounds(120, 350, 130, 40);
        l11.setForeground(Color.BLACK);
        jp7.add(l11);

        t5 = new JTextField();
        t5.setBounds(300, 350, 240, 30);
        t5.setFont(new Font("Times new roman", Font.BOLD, 20));
        t5.setForeground(Color.BLACK);
        jp7.add(t5);

        l12 = new JLabel("Pin Code:");
        l12.setFont(new Font("Times new roman", Font.BOLD, 23));
        l12.setBounds(120, 400, 130, 40);
        l12.setForeground(Color.BLACK);
        jp7.add(l12);

        t4 = new JTextField();
        t4.setBounds(300, 400, 240, 30);
        t4.setFont(new Font("Times new roman", Font.BOLD, 20));
        t4.setForeground(Color.BLACK);
        jp7.add(t4);

        b13 = new JButton("Add Details");
        b13.setBounds(30, 480, 140, 30);
        b13.setFont(new Font("Times new roman", Font.BOLD, 20));
        b13.setForeground(Color.WHITE);
        b13.setBackground(Color.BLACK);
        b13.addActionListener(this);
        jp7.add(b13);

        b6 = new JButton("Response");
        b6.setBounds(200, 480, 130, 30);
        b6.setFont(new Font("Times new roman", Font.BOLD, 20));
        b6.setForeground(Color.WHITE);
        b6.setBackground(Color.BLACK);
        b6.addActionListener(this);
        jp7.add(b6);

        b14 = new JButton("Delete");
        b14 .setBounds(355, 480, 140, 30);
        b14 .setFont(new Font("Times new roman", Font.BOLD, 20));
        b14 .setForeground(Color.WHITE);
        b14 .setBackground(Color.BLACK);
        b14 .addActionListener(this);
        jp7.add(b14);

        b7 = new JButton("Clear");
        b7.setBounds(530, 480, 140, 30);
        b7.setFont(new Font("Times new roman", Font.BOLD, 20));
        b7.setForeground(Color.WHITE);
        b7.setBackground(Color.BLACK);
        b7.addActionListener(this);
        jp7.add(b7);

        jp8 = new JPanel();
        jp8.setLayout(null);
        jp8.setBounds(600, 200, 700, 650);
        jp8.setBackground(Color.PINK);

        l13 = new JLabel("Record Submitted Successfully");
        l13.setFont(new Font("Times new roman", Font.BOLD, 25));
        l13.setBounds(180, 20, 350, 40);
        l13.setForeground(Color.BLACK);
        jp8.add(l13);

        l14 = new JLabel("Name:");
        l14.setFont(new Font("Times new roman", Font.BOLD, 23));
        l14.setBounds(100, 100, 100, 40);
        l14.setForeground(Color.BLACK);
        jp8.add(l14);

        l15 = new JLabel("                  ");
        l15.setFont(new Font("Times new roman", Font.BOLD, 23));
        l15.setBounds(300, 100, 350, 40);
        l15.setForeground(Color.BLACK);
        jp8.add(l15);

        l16 = new JLabel("Password:");
        l16.setFont(new Font("Times new roman", Font.BOLD, 23));
        l16.setBounds(100, 160, 130, 40);
        l16.setForeground(Color.BLACK);
        jp8.add(l16);

        l17 = new JLabel("                  ");
        l17.setFont(new Font("Times new roman", Font.BOLD, 23));
        l17.setBounds(300, 160, 350, 40);
        l17.setForeground(Color.BLACK);
        jp8.add(l17);

        l18 = new JLabel("Address:");
        l18.setFont(new Font("Times new roman", Font.BOLD, 23));
        l18.setBounds(100, 220, 130, 40);
        l18.setForeground(Color.BLACK);
        jp8.add(l18);

        l19 = new JLabel("                  ");
        l19.setFont(new Font("Times new roman", Font.BOLD, 23));
        l19.setBounds(300, 220, 350, 40);
        l19.setForeground(Color.BLACK);
        jp8.add(l19);

        l20 = new JLabel("Email:");
        l20.setFont(new Font("Times new roman", Font.BOLD, 23));
        l20.setForeground(Color.BLACK);
        l20.setBounds(100, 280, 130, 40);
        jp8.add(l20);

        l21 = new JLabel("                  ");
        l21.setFont(new Font("Times new roman", Font.BOLD, 23));
        l21.setBounds(300, 280, 350, 40);
        l21.setForeground(Color.BLACK);
        jp8.add(l21);

        l22 = new JLabel("City:");
        l22.setFont(new Font("Times new roman", Font.BOLD, 23));
        l22.setBounds(100, 340, 130, 40);
        l22.setForeground(Color.BLACK);
        jp8.add(l22);

        l23 = new JLabel("                 ");
        l23.setFont(new Font("Times new roman", Font.BOLD, 23));
        l23.setBounds(300, 340, 350, 40);
        l23.setForeground(Color.BLACK);
        jp8.add(l23);

        l24 = new JLabel("Pin Code:");
        l24.setFont(new Font("Times new roman", Font.BOLD, 23));
        l24.setBounds(100, 400, 130, 40);
        l24.setForeground(Color.BLACK);
        jp8.add(l24);

        l25 = new JLabel("                 ");
        l25.setFont(new Font("Times new roman", Font.BOLD, 23));
        l25.setBounds(300, 400, 350, 40);
        l25.setForeground(Color.BLACK);
        jp8.add(l25);

        b8 = new JButton("Cancel");
        b8.setBounds(460, 480, 150, 30);
        b8.setFont(new Font("Times new roman", Font.BOLD, 20));
        b8.setForeground(Color.WHITE);
        b8.setBackground(Color.BLACK);
        b8.addActionListener(this);
        jp8.add(b8);

        c.add(jp1);
        c.add(jp2);
        c.add(tp1);
        c.add(jp7);
        c.add(jp8);

        jp2.setVisible(false);
        jp7.setVisible(false);
        tp1.setVisible(false);
        jp8.setVisible(false);
        jp9.setVisible(false);

        ImageIcon bi1 = new ImageIcon(ClassLoader.getSystemResource("icon/background-image.png"));
        Image bi2 = bi1.getImage().getScaledInstance(1900, 1400, Image.SCALE_DEFAULT);
        ImageIcon bi3 = new ImageIcon(bi2);
        bl5 = new JLabel(bi3);
        bl5.setBounds(0, 0, 1900, 1400);
        c.add(bl5);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (t1.getText().equals("") && p1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all Details");
            } else if (t1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Username");
            } else if (p1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter password");
            } else if (t1.getText().equals("8766985145") && p1.getText().equals("12345")) {
                jp1.setVisible(false);
                jp2.setVisible(false);
                tp1.setVisible(true);
                jp7.setVisible(false);
                jp8.setVisible(false);
            }
        } else if (e.getSource() == b2) {
            System.exit(0);

        } else if (e.getSource() == b3) {
            t1.setText("");
            p1.setText("");
        } else if (e.getSource() == b4) {
            jp1.setVisible(false);
            jp2.setVisible(true);
            tp1.setVisible(false);
            jp7.setVisible(false);
            jp8.setVisible(false);
        } else if (e.getSource() == b5) {
            jp7.setVisible(true);
            jp1.setVisible(false);
            jp2.setVisible(false);
            tp1.setVisible(false);
            jp8.setVisible(true);
        }
        if (e.getSource() == b13) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                System.out.println("Driver loaded successfully");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
                System.out.println("Connection established successfully..!!");


                    PreparedStatement pstmt = con.prepareStatement("insert into User_info values(?,?,?,?,?,?)");

                    int u_password;
                    String u_name;

                    u_name = t2.getText();
                    u_password = Integer.parseInt(p2.getText());
                    String u_address = ta1.getText();
                    int u_mobile = Integer.parseInt(t3.getText());
                    String u_city = t5.getText();
                    int u_pin = Integer.parseInt(t4.getText());

                    pstmt.setString(1, u_name);
                    pstmt.setInt(2, u_password);
                    pstmt.setString(3, u_address);
                    pstmt.setInt(4, u_mobile);
                    pstmt.setString(5, u_city);
                    pstmt.setInt(6, u_pin);

                    pstmt.executeUpdate();
                    System.out.println("Row insert successfully");


                con.close();
            } catch (Exception ae) {
                System.out.println(ae);
            }
        }
        if (e.getSource() == b14) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                System.out.println("Driver loaded successfully");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
                System.out.println("Connection established successfully..!!");

                PreparedStatement stmt = con.prepareStatement("delete from User_info where Name=?");
                String U_Name = t2.getText();
                stmt.setString(1, U_Name);
                stmt.executeUpdate();
            } catch (Exception e2) {
                System.out.println(e2);
            }
        } else if (e.getSource() == b6) {
            if (t2.getText().equals("") || p2.getText().equals("") || ta1.getText().equals("") || t3.getText().equals("") || t4.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Fill the Details");
            } else {
                jp8.setVisible(true);
                jp1.setVisible(false);
                jp2.setVisible(false);
                tp1.setVisible(false);
                jp7.setVisible(false);

                String s1;
                s1 = t2.getText();
                l15.setText(s1);

                String s2;
                s2 = p2.getText();
                l17.setText(s2);

                String s3;
                s3 = ta1.getText();
                l19.setText(s3);

                String s4;
                s4 = t3.getText();
                l21.setText(s4);

                String s5;
                s5 = t5.getText();
                l23.setText(s5);

                String s6;
                s6 = t4.getText();
                l25.setText(s6);
            }
        } else if (e.getSource() == b7) {
            t2.setText("");
            p2.setText("");
            ta1.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");

        } else if (e.getSource() == b8) {
            jp8.setVisible(false);
            jp1.setVisible(false);
            jp2.setVisible(true);
            tp1.setVisible(false);
            jp7.setVisible(false);
        } else if (e.getSource() == b9) {
            jp9.setVisible(true);
            jp8.setVisible(false);
            jp1.setVisible(false);
            jp2.setVisible(false);
            tp1.setVisible(false);
            jp7.setVisible(false);

        } else if (e.getSource() == b10) {
            jp9.setVisible(true);
            jp8.setVisible(false);
            jp1.setVisible(false);
            jp2.setVisible(false);
            tp1.setVisible(false);
            jp7.setVisible(false);
        } else if (e.getSource() == b11) {
            jp9.setVisible(true);
            jp8.setVisible(false);
            jp1.setVisible(false);
            jp2.setVisible(false);
            tp1.setVisible(false);
            jp7.setVisible(false);
        } else if (e.getSource() == b12) {
            jp9.setVisible(true);
            jp8.setVisible(false);
            jp1.setVisible(false);
            jp2.setVisible(false);
            tp1.setVisible(false);
            jp7.setVisible(false);
        } else if (e.getSource() == jb9) {
            jp9.setVisible(true);
            jp8.setVisible(false);
            jp1.setVisible(false);
            jp2.setVisible(false);
            tp1.setVisible(false);
            jp7.setVisible(false);
        } else if (e.getSource() == jb10) {
            jp9.setVisible(true);
            jp8.setVisible(false);
            jp1.setVisible(false);
            jp2.setVisible(false);
            tp1.setVisible(false);
            jp7.setVisible(false);
        } else if (e.getSource() == jb11) {
            jp9.setVisible(true);
            jp8.setVisible(false);
            jp1.setVisible(false);
            jp2.setVisible(false);
            tp1.setVisible(false);
            jp7.setVisible(false);
        } else if (e.getSource() == jb12) {
            jp9.setVisible(true);
            jp8.setVisible(false);
            jp1.setVisible(false);
            jp2.setVisible(false);
            tp1.setVisible(false);
            jp7.setVisible(false);
        } else if (e.getSource() == jbd9) {
            jp9.setVisible(true);
            jp8.setVisible(false);
            jp1.setVisible(false);
            jp2.setVisible(false);
            tp1.setVisible(false);
            jp7.setVisible(false);
        } else if (e.getSource() == jbd10) {
            jp9.setVisible(true);
            jp8.setVisible(false);
            jp1.setVisible(false);
            jp2.setVisible(false);
            tp1.setVisible(false);
            jp7.setVisible(false);
        } else if (e.getSource() == jbd11) {
            jp9.setVisible(true);
            jp8.setVisible(false);
            jp1.setVisible(false);
            jp2.setVisible(false);
            tp1.setVisible(false);
            jp7.setVisible(false);
        } else if (e.getSource() == jbd12) {
            jp9.setVisible(true);
            jp8.setVisible(false);
            jp1.setVisible(false);
            jp2.setVisible(false);
            tp1.setVisible(false);
            jp7.setVisible(false);
        } else if (e.getSource() == jb6) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                System.out.println("Driver loaded successfully");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
                System.out.println("Connection established successfully..!!");

                PreparedStatement pstmt = con.prepareStatement("insert into Order_Details values(?,?,?)");
                int u_password;
                String u_name;
                u_name = jt2.getText();
                int u_mobile = Integer.parseInt(jt3.getText());
                String u_address = jta1.getText();

                pstmt.setString(1, u_name);
                pstmt.setInt(2, u_mobile);
                pstmt.setString(3, u_address);

                pstmt.executeUpdate();
                System.out.println("Row insert successfully");
            } catch (Exception e3) {
                System.out.println(e3);
            }
            if (jt2.getText().equals("") || jt3.getText().equals("") || jta1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill the Details");
            } else {
                JOptionPane.showMessageDialog(null, "Your foods will be delivered soon,thanks for ordering");
            }
        } else if (e.getSource() == jbc6) {
            System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        Food_Delivery_Project fdp=new Food_Delivery_Project();
        fdp.setBounds(0,0,2000,1500);
        fdp.setVisible(true);
        fdp.setLayout(null);
    }
}
