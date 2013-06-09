package liwenhaosuper.sjtu.simpl.syntax;

public class WhileDoEnd extends Expression{
	Expression condition;
	Expression body;
	
	public WhileDoEnd(Expression e1,Expression e2){
		condition = e1;
		body = e2;
	}
	
	public String toString(){
		return "while " + condition.toString() + " do " + body.toString() + " end";
	}
}
