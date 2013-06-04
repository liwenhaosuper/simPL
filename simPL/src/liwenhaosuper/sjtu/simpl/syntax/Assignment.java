package liwenhaosuper.sjtu.simpl.syntax;

public class Assignment extends Expression{
	Expression var;
	Expression val;
	
	public String toString(){
		return var.toString() + " := " + val.toString();
	}
}