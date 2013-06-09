package liwenhaosuper.sjtu.simpl.syntax;

public class First extends Expression{
	Expression e;
	
	public First(Expression e){
		this.e = e;
	}
	
	public String toString(){
		return "fst " + e.toString();
	}
}