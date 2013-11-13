import frontend.*;

public class Schemer2 
{
	public static void main(String[] args) 
	{
		Source source = new Source(args[0]);
		Scanner scanner = new Scanner(source);
		Parser2 parser = new Parser2(scanner);
		
		parser.parse();
	}
}
