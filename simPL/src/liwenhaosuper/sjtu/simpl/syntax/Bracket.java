package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;

public class Bracket extends Expression{
	Expression e;
	
	public Bracket(Expression e){
		this.e = e;
	}
	
	@Override
	public Value eval(RunTimeState rst){
		return e.eval(rst);
	}
	
	public String toString(){
		return "(" + e.toString() + ")";
	}
}