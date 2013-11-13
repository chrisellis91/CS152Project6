package frontend;

import java.util.TreeMap;

import intermediate.*;
import backend.*;

/**
 * A simple Scheme parser.
 * @author Ronald Mak
 */
public class Parser2
{
	private Scanner scanner;
	private TreeMap<String, SymtabEntry> symtab;
	
	
	/**
	 * Constructor.
	 * @param scanner the simple Scheme scanner.
	 */
	public Parser2(Scanner scanner)
	{
		this.scanner = scanner;
		this.symtab = new TreeMap<String, SymtabEntry>();
	}
	
	/**
	 * The parse method.
	 * This version also enters identifiers and symbols into the symbol table.
	 */
	public void parse()
	{
		Token token;
		
		// Loop to get tokens until the end of file.
		while ((token = scanner.nextToken()).getType() != TokenType.EOF) {
			TokenType type = token.getType();
			
			// Enter identifiers and symbols into the symbol table.
			if ((type == TokenType.IDENTIFIER) ||
				(type == TokenType.SYMBOL)) 
			{
				String text = token.getText();
				symtab.put(text, new SymtabEntry(text));
			}
		}
		
		// Print the symbol table.
		SymbolTablePrinter symtabPrinter = new SymbolTablePrinter();
		symtabPrinter.print(symtab);
	}
}
