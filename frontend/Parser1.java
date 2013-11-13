package frontend;

/**
 * A simple Scheme parser.
 * @author Ronald Mak
 */
public class Parser1
{
	private Scanner scanner;
	
	/**
	 * Constructor.
	 * @param scanner the simple Scheme scanner.
	 */
	public Parser1(Scanner scanner)
	{
		this.scanner = scanner;
	}
	
	/**
	 * The parse method.
	 * This version simply loops to get the next token 
	 * from the scanner until the end of file.
	 */
	public void parse()
	{
		Token token;
		
		// Loop to get tokens until the end of file.
		while ((token = scanner.nextToken()).getType() != TokenType.EOF);
	}
}
