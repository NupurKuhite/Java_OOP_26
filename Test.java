import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test {

    public static void main(String[] args) {
        Frame frm = new Frame("FUcking good");
        Label lb =new Label("Good Fucking Moring");
        lb.setAlignment(Label.CENTER);
        frm.add(lb);
        frm.setSize(300,300);
        frm.setVisible(true);

        frm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        }); 
    }
    
}
