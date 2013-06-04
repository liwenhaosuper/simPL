package liwenhaosuper.sjtu.simpl.syntax;

public class PairValue extends Value{
	Value e1;
	Value e2;
	
	public String toString(){
		return "(" + e1.toString() + ", " + e2.toString() + ")";
	}
}