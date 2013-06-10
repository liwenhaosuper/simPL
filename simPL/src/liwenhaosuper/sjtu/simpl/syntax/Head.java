package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class Head extends Expression{
	Expression e;
	
	public Head(Expression e){
		this.e = e;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		return new Head(e.nestedReplace(sf));
	}
	@Override
	public Value eval(RunTimeState rst){
		Value val = e.eval(rst);
		if(val instanceof ListValue){
			return ((ListValue)val).getHead();
		}
		Util.fatal("Type Error! in "+toString()+": "+e.toString()+" is not a list type");
		return null;
	}
	public String toString(){
		return "head " + e.toString();
	}
}