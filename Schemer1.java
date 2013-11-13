import frontend.*;

public class Schemer1 
{
	public static void main(String[] args) 
	{
		Source source = new Source(args[0]);
		Scanner scanner = new Scanner(source);
		Parser1 parser = new Parser1(scanner);
		
		parser.parse();
	}
}
