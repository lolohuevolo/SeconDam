package portapapeles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Portapapeles implements ActionListener {
    
    frmBotones frm;
    public Portapapeles(frmBotones frm) {
        this.frm=frm;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    frm.getBtnCopiar().addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent le) {
        setTextArea.copy();
      }
    });
    
    frm.getBtnCortar().addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent le) {
        setTextArea.cut();
      }
    });

    frm.getBtnPegar().addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent le) {
        setTextArea.paste();
      }
    });
    
    frm.add(setTextArea());
    frm.add(getBtnCopiar());
    frm.add(getBtnCortar());
    frm.add(getBtnPegar());
    frm.setVisible(true);
    }
    
    public static void main(String args[]) {
    new Portapapeles();
    }
}