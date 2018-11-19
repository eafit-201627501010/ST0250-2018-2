public class PrepararBebida implements Orden {

	Empleado elEmpleado;
	
	public PrepararBebida(Empleado nuevoEmpleado){
		
		elEmpleado = nuevoEmpleado;
		
	}
	
	public void execute() {
		
		elEmpleado.work();
		
	}
	
}