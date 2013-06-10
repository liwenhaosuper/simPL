package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class Second extends Expression{
	Expression e;
	
	public Second(Expression e){
		this.e = e;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		return new Second(e.nestedReplace(sf));
	}
	@Override
	public Value eval(RunTimeState rst){
		Value val = e.eval(rst);
		if(val instanceof PairValue){
			return ((PairValue)val).e2;
		}
		Util.fatal("Runtime Error!"+toString());
		return null;
	}
	
	public String toString(){
		return "snd " + e.toString();
	}
}