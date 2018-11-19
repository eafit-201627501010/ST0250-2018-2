

public interface Empleado {
	
	public void work();
	
}

public class Cocinero implements Empleado {
	
	public void work() {
		
		System.out.println("Cocinando pedido");
		
	}
	
}

public class Bartender implements Empleado {
	
	public void work() {
		
		System.out.println("Preparando coctel");
		
	}
	
}