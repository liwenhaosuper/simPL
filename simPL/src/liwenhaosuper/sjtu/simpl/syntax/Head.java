package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.util.Util;

public class Head extends Expression{
	Expression e;
	
	public Head(Expression e){
		this.e = e;
	}
	@Override
	public Value eval(RunTimeState rst){
		Value val = e.eval(rst);
		if(val instanceof ListValue){
			return ((ListValue)val).getHead();
		}
		Util.fatal("Runtime Error!"+toString());
		return null;
	}
	public String toString(){
		return "head " + e.toString();
	}
}