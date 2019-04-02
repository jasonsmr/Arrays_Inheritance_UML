
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

public class SomeClass implements Serializable {
    private int count;
    protected ImageIcon[] image;

    public SomeClass(int count){
        super();
        if(count == 0)
            image = new ImageIcon[10];
        image = new ImageIcon[count];
        count = image.length;
    }

    private class OtherClass implements MouseListener, ActionListener {

        public void otherMethod (ActionEvent event){
          try{
            if(event.getSource() == null)
                throw new MyException("Error: ");
            }catch(MyException myEx){
                myEx.printStackTrace();
              }
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
