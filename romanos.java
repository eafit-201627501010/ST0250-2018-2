
public class Context{
	
	protected String input;
	protected int output;

	public Context(String s){
		input = s;
	}
}

public sbstract class Expresion{
	
	public abstract String one();
	public abstract String four();
	public abstract String five();
	public abstract String nine();
	public abstract int multiplier();

	public void interpret(Context context){
		if(context.input.startsWith(nine())){
			context.output += (9* multiplier());
			context.input = context.input.substring(2);

		}else if(context.input.startsWith(four())){
			context.output += (4* multiplier());
			context.input = context.input.substring(2);

		}else if(context.input.startsWith(five())){
			context.output += (5* multiplier());
			context.input = context.input.substring(1);
		}
		while(context.input.startsWith(one())){
			context.output += (1* multiplier());
			context.input = context.input.substring(1);
		}

	}
}

	public class OneExpression extends Expression {
		public String one(){
			return "I";
		}
		public String four(){
			return "IV";
		}
		public String five(){
			return "V";
		}
		public String nine(){
			return "IX";
		}
		public int multiplier(){
			return 1;
		}

	}

	public class TenExpression extends Expression {
		public String one(){
			return "X";
		}
		public String four(){
			return "XL";
		}
		public String five(){
			return "L";
		}
		public String nine(){
			return "XL";
		}
		public int multiplier(){
			return 10;
		}

	}

	public class HundredExpression extends Expression {
		public String five(){
			return "D";
		}
		public String four(){
			return "CD";
		}
		public String nine(){
			return "CM";
		}
		public String one(){
			return "C";
		}
		public int multiplier(){
			return 100;
		}

	}

	public static void main(String[] args){
		String romano = "LXI";
		Context context = new Context(romano);
		// Construimos el arbol
		ArrayList<Expression> tree = new ArrayList<Expression>();
		tree.add(new HundredExpression());
		tree.add(new TenExpression());
		tree.add(new OneExpression());

		//lo interpretamos 

			Iterator<Expression> it = tree.iterator();
			while(it.hasNext()){
				Expression exp = it.next();
				exp.interpret(context);
			}

		//La construccion e interpretacion no la deberia hacer
		//el cliente, se deberia encapsular esa lógica en otra clase

		System.out.println(context.output);

	}