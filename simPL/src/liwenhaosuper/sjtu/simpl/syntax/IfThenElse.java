package liwenhaosuper.sjtu.simpl.syntax;

public class IfThenElse extends Expression{
	Expression condition;
	Expression thenClause;
	Expression elseClause;
	
	public IfThenElse(Expression e1,Expression e2,Expression e3){
		condition = e1;
		thenClause = e2;
		elseClause = e3;
	}
	
	public String toString(){
		return "if " + condition.toString() + " then " + thenClause.toString() + " else " + elseClause.toString();
	}
}