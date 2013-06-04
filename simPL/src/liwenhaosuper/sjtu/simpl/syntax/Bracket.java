package liwenhaosuper.sjtu.simpl.syntax;

public class Bracket extends Expression{
	Expression e;
	
	public String toString(){
		return "(" + e.toString() + ")";
	}
}