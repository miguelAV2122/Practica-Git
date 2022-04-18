
package tarea_tecnicas;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        IMC datos = new IMC();
        datos.setNombre(JOptionPane.showInputDialog("Digite su nombre "));
        datos.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite su edad")));
        datos.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso")));
        datos.setEstatura(Double.parseDouble(JOptionPane.showInputDialog("Ingrese su estatura")));
        datos.MostrarDatos();
    }
}
