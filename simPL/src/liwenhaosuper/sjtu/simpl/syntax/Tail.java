package liwenhaosuper.sjtu.simpl.syntax;

public class Tail extends Expression{
	Expression e;	
	
	public Tail(Expression e){
		this.e = e;
	}
	
	public String toString(){
		return "tail " + e.toString();
	}
}