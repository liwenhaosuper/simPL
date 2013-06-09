package liwenhaosuper.sjtu.simpl.syntax;

public class Application extends Expression{
	Expression func;
	Expression param;

	public Application(Expression e1,Expression e2){
		this.func = e1;
		this.param = e2;
	}
	
	public String toString(){
		return "(" + func.toString() + " " + param.toString() + ")";
	}
}