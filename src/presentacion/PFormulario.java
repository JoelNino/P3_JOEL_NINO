package presentacion;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PFormulario extends JPanel {
    private JTextField text_R;
    private JTextField text_G;
    private JTextField text_B;
    private JButton B_generarCuadrado;
    private JButton B_generarCirculo;
    private PLienzo pLienzo; 

    public PFormulario(PLienzo pLienzo) {
        this.text_R = new JTextField();
        this.text_G = new JTextField();
        this.text_B = new JTextField();
        this.B_generarCuadrado = new JButton("Cuadrado");
        this.B_generarCirculo = new JButton("Círculo");
        this.pLienzo = pLienzo;
        this.setLayout(new GridLayout(5, 2, 5,5));
        this.add(new JLabel("R"));
        this.add(this.text_R);
        this.add(new JLabel("G"));
        this.add(this.text_G);
        this.add(new JLabel("B"));
        this.add(this.text_B);
        this.add(this.B_generarCuadrado);
        this.add(this.B_generarCirculo);

        this.B_generarCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarCuadrado();
            }
        });

        this.B_generarCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarCírculo();
            }
        });
    }

    private void generarCuadrado() {
        int color_red = Integer.parseInt(text_R.getText());
        int color_green = Integer.parseInt(text_G.getText());
        int color_blue = Integer.parseInt(text_B.getText());
        
        pLienzo.dibujarCuadrado(color_red, color_green, color_blue);
    }

    private void generarCírculo() {
        int color_red = Integer.parseInt(text_R.getText());
        int color_green = Integer.parseInt(text_G.getText());
        int color_blue = Integer.parseInt(text_B.getText());

        pLienzo.dibujarCirculo(color_red, color_green, color_blue); 
    }
}
