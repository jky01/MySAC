import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by yehjacky on 2017/01/13.
 */
public class MySACForm {
    private JRadioButton radioButton1;
    private JPanel panel1;
    private JTextArea textArea1;

    public String getTextArea1() {
        return textArea1.getText();
    }

    public void setTextArea1(String textArea1) {
        this.textArea1.setText(textArea1);
    }

    public MySACForm() {
        radioButton1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                setTextArea1("aaa");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MYSACForm");
        frame.setContentPane(new MySACForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
