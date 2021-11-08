import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private JPanel panel;
    private JList list1;
    private JList list2;
    public GUI(){
        populate();
    }
    public void populate(){
        String week[]= { "Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday"};
        panel=new JPanel(new GridBagLayout());
        panel.setMaximumSize(new Dimension(50,100 ));
        GridBagConstraints c=new GridBagConstraints();
        c.fill=GridBagConstraints.VERTICAL;
        c.insets = new Insets(0,20,0,20);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        list1=new JList(week);
        panel.add(new JScrollPane(list1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),c);
        c=new GridBagConstraints();
        c.insets = new Insets(0,20,0,20);
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 2;
        String week2[]= { "Monday2","Tuesday2","Wednesday2",
                "Thursday2","Friday2","Saturday2","Sunday2","Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday2222222222222222222222222222222222",
                "Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday"};
        list2=new JList(week2);
        panel.add(new JScrollPane(list2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),c);
        panel.revalidate();
        add(panel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
