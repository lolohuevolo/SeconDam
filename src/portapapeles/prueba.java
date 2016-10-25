package portapapeles;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class prueba {
  JTextArea textArea = new JTextArea("one two three four five six seven eight nine ten");
  JButton btnCopiar = new JButton("Copiar");
  JButton btnCortar = new JButton("Cortar");
  JButton btnPegar = new JButton("Pegar");

  public prueba() {
    JFrame frm = new JFrame("frmBotones");
    frm.setLayout(new FlowLayout());
    frm.setSize(230, 150);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    btnCopiar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent le) {
        textArea.copy();
        update();
      }
    });
    
    btnCortar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent le) {
        textArea.cut();
        update();
      }
    });

    btnPegar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent le) {
        textArea.paste();
        update();
      }
    });

//    textArea.addCaretListener(new CaretListener() {
//      public void caretUpdate(CaretEvent ce) {
//        update();
//      }
//    });

    frm.add(textArea);
    frm.add(btnCopiar);
    frm.add(btnCortar);
    frm.add(btnPegar);
    frm.setVisible(true);
  }

//  private void update() {
//    System.out.println("All text: " + textArea.getText());
//
//    if (textArea.getSelectedText() != null)
//      System.out.println("Selected text: " + textArea.getSelectedText());
//    else
//      System.out.println("Selected text: ");
//  }

  public static void main(String args[]) {
    new prueba();
  }
}