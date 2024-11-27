package presentacion;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    private PFormulario pFormulario;
    private PLienzo pLienzo;

    public VentanaPrincipal() {
        this.setTitle("Parcial de Joel Niño");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700, 500);
        this.setLayout(null); 
        this.pLienzo = new PLienzo();
        this.pLienzo.setBounds(220, 10, 560, 540); 
        this.add(this.pLienzo);
        this.pFormulario = new PFormulario(this.pLienzo); 
        this.pFormulario.setBounds(10, 10, 190, 140); 
        this.add(this.pFormulario);
        this.setVisible(true);
    }
    
  
	public static void main(String[] args) {
        new VentanaPrincipal();
    }
}
