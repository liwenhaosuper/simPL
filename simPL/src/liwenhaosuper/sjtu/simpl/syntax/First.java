package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class First extends Expression{
	Expression e;
	
	public First(Expression e){
		this.e = e;
	}
	@Override
	public boolean equals(Object obj){
		if( obj instanceof Expression){
			Value val;
			try {
				val = e.eval(Util.env());	
				if(val instanceof PairValue){
					return ((PairValue) val).getFirst().equals(((Expression) obj).eval(Util.env()));
				}
			} catch (SimPLFatalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	@Override
	public Value eval(RunTimeState rst) throws SimPLFatalException{
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