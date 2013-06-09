package liwenhaosuper.sjtu.simpl.syntax;

public class UnaryOperation extends Expression{
	public enum UnaryOperator{
		not, negative
	}
	public UnaryOperation(){
		
	}
	public UnaryOperation(Expression e,UnaryOperator op){
		this.e = e;
		this.op = op;
	}
	Expression e;
	UnaryOperator op;

	public String toString(){
		String operator = "";
		switch(op){
		case not:
			operator = "~"; break;
		case negative:
			operator = "not "; break;
		}
		return operator + e.toString();
	}
}