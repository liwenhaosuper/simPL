package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class Pair extends Expression{
	Expression e1;
	Expression e2;
	
	public Pair(Expression e1,Expression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		return new Pair(e1.nestedReplace(sf),e2.nestedReplace(sf));
	}

	@Override
	public Value eval() throws SimPLFatalException{
		if(e1==null||e2==null){
			return new Nil();
		}
		return new PairValue(e1.eval(),e2.eval());
	}
	public String toString(){
		//System.out.println("(" + e1.toString() + ", " + e2.toString() + ")");
		//return eval().toString();
		return "(" + e1.toString() + ", " + e2.toString() + ")";
	}
}