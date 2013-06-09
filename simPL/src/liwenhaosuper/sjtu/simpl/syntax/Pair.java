package liwenhaosuper.sjtu.simpl.syntax;

public class Pair extends Expression{
	Expression e1;
	Expression e2;
	
	public Pair(Expression e1,Expression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	public String toString(){
		return "(" + e1.toString() + ", " + e2.toString() + ")";
	}
}