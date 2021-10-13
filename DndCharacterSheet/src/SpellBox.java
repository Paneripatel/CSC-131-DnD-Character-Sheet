import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class SpellBox {

    private int str;
    private int dex;


    private Map<String, Integer> stats;

    public SpellBox() {


        stats = new HashMap<String, Integer>();

        Frame f = new JFrame("Button Example");
        //submit button
        JButton b = new JButton("Save");
        b.setBounds(500, 100, 140, 40);
        //enter name label
        JLabel strLabel = new JLabel();
        strLabel.setText("Strength:");
        strLabel.setBounds(10, 10, 100, 100);
        //textfield to enter name
        JTextField strEntry = new JTextField();
        strEntry.setBounds(110, 50, 130, 30);

        //enter name label
        JLabel dexLabel = new JLabel();
        dexLabel.setText("Strength:");
        dexLabel.setBounds(10, 100, 100, 100);
        //textfield to enter name
        JTextField dexEntry = new JTextField();
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
        f.setSize(1600, 900);
        f.setLayout(null);
        f.setVisible(true);
        //    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //action listener
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                saveLabel.setText("Stats have been saved");


                stats.put("str", str);
                stats.put("dex", dex);

                str = Integer.parseInt(strEntry.getText());
                dex = Integer.parseInt(dexEntry.getText());
                System.out.println(str);
                System.out.println(dex);


                for (String s:stats.keySet()
                     ) {
                    System.out.println(s);

                }
            }
        });
    }
}

