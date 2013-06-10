package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;

public class Pair extends Expression{
	Expression e1;
	Expression e2;
	
	public Pair(Expression e1,Expression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	@Override
	public Value eval(RunTimeState rst){
		if(e1==null||e2==null){
			return new Nil();
		}
		return new PairValue(e1.eval(rst),e2.eval(rst));
	}
	public String toString(){
		//System.out.println("(" + e1.toString() + ", " + e2.toString() + ")");
		//return eval().toString();
		return "(" + e1.toString() + ", " + e2.toString() + ")";
	}
}