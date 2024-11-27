package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PLienzo extends JPanel {
    private Color color; 
    private boolean dibujarCuadrado;
    private boolean dibujarCirculo;  
    
    public PLienzo() {
        this.color = null;
        this.dibujarCuadrado = false;
        this.dibujarCirculo = false;
        this.setBackground(Color.WHITE);
    }

    public void dibujarCuadrado(int r, int g, int b) {
        this.color = new Color(r, g, b); 
        this.dibujarCuadrado = true;   
        this.dibujarCirculo = false;   
        repaint(); 
    }

    public void dibujarCirculo(int r, int g, int b) {
        this.color = new Color(r, g, b); 
        this.dibujarCirculo = true;   
        this.dibujarCuadrado = false;   
        repaint(); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 

        if (color != null) {
            g.setColor(color); 
        }

        if (dibujarCuadrado) {
            g.fillRect(80, 80, 300, 300);
        } else if (dibujarCirculo) {
            g.fillOval(80, 80, 300, 300); 
        }
    }
}
