package holamundo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class claseEvento implements ActionListener {
    frmHola frm;
    public claseEvento(frmHola frm) {
        this.frm=frm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("Pulsa aquí".equals(e.getActionCommand())){
            //frm.setTxtMensaje("Hola mundo");
            frm.getTxtMensaje().setText("Hola mundo");
        } else {
            frm.getBtnUno().setVisible(!frm.getBtnUno().isVisible());
            frm.getBtnDos().setVisible(!frm.getBtnDos().isVisible());
            frm.getBtnTres().setVisible(!frm.getBtnTres().isVisible());
        }
    }
}
