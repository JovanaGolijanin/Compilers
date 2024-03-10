package AST;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Block extends ASTNode{
	private ArrayList statementsAndExpressions = new ArrayList();
	
	public void addStatement(Statement dec) {
		statementsAndExpressions.add(dec);
	}
	
	public void addExpression(Expression exp) {
		statementsAndExpressions.add(exp);
	}
	
	public void translate(BufferedWriter out) throws IOException
	{
		for(int i = 0 ; i < statementsAndExpressions.size(); i++) {
			Object current = statementsAndExpressions.get(i);
			
			if(current instanceof Statement) {
				((Statement) current).translate(out);
			}else if(current instanceof Expression){
				((Expression) current).translate(out);
			}
		}
		
	}
}
