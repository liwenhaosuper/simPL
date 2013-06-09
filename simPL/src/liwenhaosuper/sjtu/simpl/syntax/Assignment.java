package liwenhaosuper.sjtu.simpl.syntax;

public class Assignment extends Expression{
	Expression var;
	Expression val;
	
	public Assignment(Expression val,Expression var){
		this.var = var;
		this.val = val;
	}
	
	public String toString(){
		return var.toString() + " := " + val.toString();
	}
}