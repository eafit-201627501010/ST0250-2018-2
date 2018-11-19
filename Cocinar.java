public class Cocinar implements Orden {

	Empleado elEmpleado;
	
	public Cocinar(Empleado nuevoEmpleado){
		
		elEmpleado = nuevoEmpleado;
		
	}
	
	public void execute() {
		
		elEmpleado.work();
		
	}
	
}