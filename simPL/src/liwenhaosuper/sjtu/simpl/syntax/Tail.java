package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.util.Util;

public class Tail extends Expression{
	Expression e;	
	
	public Tail(Expression e){
		this.e = e;
	}
	@Override
	public Value eval(RunTimeState rst){
		Value val = e.eval(rst);
		if(val instanceof ListValue){
			return ((ListValue)val).getTail();
		}
		Util.fatal("Runtime Error!"+toString());
		return null;
	}
	public String toString(){
		return "tail " + e.toString();
	}
}