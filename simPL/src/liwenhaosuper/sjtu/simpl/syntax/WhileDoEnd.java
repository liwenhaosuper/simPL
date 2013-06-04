package liwenhaosuper.sjtu.simpl.syntax;

public class WhileDoEnd extends Expression{
	Expression condition;
	Expression body;
	
	public String toString(){
		return "while " + condition.toString() + " do " + body.toString() + " end";
	}
}
