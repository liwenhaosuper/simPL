package liwenhaosuper.sjtu.simpl.syntax;

public class Sequence extends Expression{
	Expression e1;
	Expression e2;

	public String toString(){
		return e1.toString() + "; " + e2.toString();
	}
}