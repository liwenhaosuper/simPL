package liwenhaosuper.sjtu.simpl.syntax;

public class Second extends Expression{
	Expression e;
	
	public Second(Expression e){
		this.e = e;
	}
	
	public String toString(){
		return "snd " + e.toString();
	}
}