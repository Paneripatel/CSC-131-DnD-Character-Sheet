import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class StatBox {

    private int str;
    private int dex;
    private int con;
    private int wis;
    private int intel;
    private int cha;


    public StatBox() {




        new HashMap<String, Integer>();

        Frame f=new JFrame("Button Example");
        //submit button
        JButton b=new JButton("Save");
        b.setBounds(500,100,140, 40);
        //enter name label
        JLabel strLabel = new JLabel();
        strLabel.setText("Strength:");
        strLabel.setBounds(10, 10, 100, 100);
        //textfield to enter name
        JTextField strEntry= new JTextField();
        strEntry.setBounds(110, 50, 130, 30);

        //enter name label
        JLabel dexLabel = new JLabel();
        dexLabel.setText("Dexterity:");
        dexLabel.setBounds(10, 100, 100, 100);
        //textfield to enter name
        JTextField dexEntry= new JTextField();
        dexEntry.setBounds(110, 150, 130, 30);


        //empty label which will show event after button clicked
        JLabel saveLabel = new JLabel();
        saveLabel.setBounds(500, 110, 200, 100);


        //add to frame
        f.add(saveLabel);
        f.add(strEntry);
        f.add(strLabel);
        f.add(dexLabel);
        f.add(dexEntry);
        f.add(b);
        f.setSize(1600,900);
        f.setLayout(null);
        f.setVisible(true);
    //    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //action listener
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                saveLabel.setText("Stats have been saved");

                str = Integer.parseInt(strEntry.getText());
                dex = Integer.parseInt(dexEntry.getText());
                System.out.println(str);
                System.out.println(dex);
            }
        });
    }




    @Override
    public String toString() {
        return "StatBox{" +
                "str=" + str +
                ", dex=" + dex +
                ", con=" + con +
                ", wis=" + wis +
                ", intel=" + intel +
                ", cha=" + cha +
                '}';
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }
}