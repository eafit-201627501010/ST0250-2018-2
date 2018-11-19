

public class Restaurante
{
    public static void main(String[] args) {
        //Contratamos empleados
        Empleado cocinero = new Cocinero();
        Empleado bartender = new Bartender();
        
        //Asignamos tareas
        Orden cocinarAlgo = new Cocinar(cocinero);
        Orden prepararAlgunaBebida = new PrepararBebida(bartender);
        
        //Mesero toma primera orden
        Mesero mesero = new Mesero(cocinarAlgo);
        
        //Entrega primera orden (cocinar algo)
        mesero.entregarOrden();
        
        //Mesero toma segunda orden
        mesero = new Mesero(prepararAlgunaBebida);
        
        //Entrega primera orden (prepar algo de tomar)
        mesero.entregarOrden();
        
        //Mesero toma tercera orden
        mesero = new Mesero(cocinarAlgo);
        
        //Entrega primera orden (cocinar algo)
        mesero.entregarOrden();
        
    }
}
