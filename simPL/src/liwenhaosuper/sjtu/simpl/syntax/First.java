package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class First extends Expression{
	Expression e;
	
	public First(Expression e){
		this.e = e;
	}
	
	@Override
	public Value eval(RunTimeState rst){
		Value val = e.eval(rst);
		if(val instanceof PairValue){
			return ((PairValue)val).e1;
		}
		Util.fatal("Runtime Error!"+toString());
		return null;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		return new First(e.nestedReplace(sf));
	}
	public String toString(){
		return "fst " + e.toString();
	}
}