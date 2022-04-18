
package tarea_tecnicas;

import javax.swing.JOptionPane;

public class IMC extends Persona{
    
    private double peso;
    private double estatura;
    
    public IMC(){
    
    }

    public IMC(double peso, double estatura, String nombre, int edad) {
        super(nombre, edad);
        this.peso = peso;
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double CalcularIMC(){
    double altura = this.getEstatura()*this.getEstatura();
    double imc = this.getPeso()/altura*10000;
    return imc;
    }
    
    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null, "El nombre es :" +getNombre() 
        + "\n La edad es: " + getEdad()
        + "\n Su peso es: " + peso
        + "\n El altura es: " +estatura
        + "\n Su indice de masa corporal es de: " +CalcularIMC());
    } 
    
    
}
