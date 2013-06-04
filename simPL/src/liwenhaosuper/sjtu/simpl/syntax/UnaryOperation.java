package liwenhaosuper.sjtu.simpl.syntax;

public class UnaryOperation extends Expression{
	enum UnaryOperator{
		not, negative
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