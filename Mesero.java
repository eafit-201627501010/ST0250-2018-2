// Invoker

public class Mesero{
	
	Orden laOrden;
	
	public Mesero(Orden nuevaOrden){
		
		laOrden = nuevaOrden;
		
	}
	
	public void entregarOrden(){
		
		laOrden.execute();
		
	}
	
	
}