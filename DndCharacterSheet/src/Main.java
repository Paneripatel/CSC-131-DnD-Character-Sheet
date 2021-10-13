import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import dice.Dice;

public class Main extends JFrame {



    JPopupMenu menu = new JPopupMenu("Popup");

    class MyLabel extends JLabel {
        public MyLabel(String text) {
            super(text);
            addMouseListener(new PopupTriggerListener());
        }

        class PopupTriggerListener extends MouseAdapter {
            public void mousePressed(MouseEvent ev) {
                if (ev.isPopupTrigger()) {
                    menu.show(ev.getComponent(), ev.getX(), ev.getY());
                }
            }

            public void mouseReleased(MouseEvent ev) {
                if (ev.isPopupTrigger()) {
                    menu.show(ev.getComponent(), ev.getX(), ev.getY());
                }
            }

            public void mouseClicked(MouseEvent ev) {
            }
        }
    }

    JLabel label = new MyLabel("right-click");

    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuItem item = new JMenuItem("Test1");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item Test1");
            }
        });
        menu.add(item);

        item = new JMenuItem("Test2");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item Test2");
            }
        });
        menu.add(item);

        getContentPane().add(label);
        pack();
        setSize(300, 100);
    }


    public static void main(String[] args) {

        var dice = new Dice();

        for (int i = 0; i < 21; i++) {
            dice.DiceRoll(0,0,0,0,0,4);
        }








        new Main().setVisible(true);

        System.out.println("test");

    Gui gui = new Gui();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setSize(300, 200);
    gui.setVisible(true);

        new StatBox();



    }




}