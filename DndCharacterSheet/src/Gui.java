import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

public class Gui extends JFrame {

    JButton button1;
    JButton button2;
    JCheckBox checkBox1;
    JComboBox dropDown1;
    JLabel pic1;
    JTextField text1;
    HeaderBox headerbox;
    JPopupMenu popupMenu;
    JMenuItem cutMenuItem;
    JFrame frame;


    public Gui() {



        super("sup foo");
        setLayout(new FlowLayout());

        headerbox = new HeaderBox("a", new ArrayList(), "c", "d", "e", "f", "g");

        button1 = new JButton("button1");
        button2 = new JButton(headerbox.playerName);
        checkBox1 = new JCheckBox("checkbox1");
        dropDown1 = new JComboBox();

        pic1 = new JLabel();
        text1 = new JTextField("Sup foo");
        popupMenu = new JPopupMenu("Title");
        popupMenu.setVisible(true);
        cutMenuItem = new JMenuItem("Cut");

        addMouseListener(new PopupTriggerListener());


        add(button1);
        add(button2);
        add(checkBox1);
        add(dropDown1);
        add(pic1);
        add(text1);
        add(popupMenu);


        popupMenu.addPopupMenuListener(

                new PopupMenuListener() {

                    public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) {
                        System.out.println("Canceled");
                    }

                    public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) {
                        System.out.println("Becoming Invisible");
                    }

                    public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) {
                        System.out.println("Becoming Visible");
                    }
                }


        );


        popupMenu.add(cutMenuItem);

        button2.add(popupMenu);


        button1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JOptionPane.showMessageDialog(null, e.getActionCommand());
                    }
                }
        );


        checkBox1.addActionListener(

                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "you clicked the checkbox");
                    }
                }

        );


        button2.addActionListener(

                new ActionListener() {
                    @Override

                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, e.getActionCommand());
                    }
                }

        );


    }

    class PopupTriggerListener extends MouseAdapter {
        public void mousePressed(MouseEvent ev) {
            if (ev.isPopupTrigger()) {
                popupMenu.show(ev.getComponent(), ev.getX(), ev.getY());
            }
        }

        public void mouseReleased(MouseEvent ev) {
            if (ev.isPopupTrigger()) {
                popupMenu.show(ev.getComponent(), ev.getX(), ev.getY());
            }
        }

        public void mouseClicked(MouseEvent ev) {
        }
    }
}

