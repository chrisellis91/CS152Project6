CS152Project6
=============

CS152 project 6: The Scheme interpreter


CS 152 / SE 152 
Programming Language Paradigms 
Fall Semester 2013 
 
Department of Computer Science 
San Jose State University 
Prof. Ron Mak 
Assignment #6 
Assigned: Tuesday, October 29 
Due: Monday, November 18 at 11:59 pm 
 Team assignment, 100 points max 
Scheme interpreter 
Use Java to write a Scheme interpreter that can execute a limited set of programs. 
Expand upon your work from Assignment #5. 
 
Process special forms such as define, lambda, let, let*. Create a separate symbol table 
for each scope. Maintain a symbol table stack during parsing. Ensure that symbols are 
declared before they’re used. 
 
Maintain a runtime stack and a runtime display. Evaluate symbols and list expressions. 
Don’t evaluate quoted symbols and lists. 
 
Handle procedure calls, parameter passing, and return values. 
 
Print values returned to the top level. 
