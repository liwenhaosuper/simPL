package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
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
	public boolean equals(Object obj){
		if( obj instanceof Expression){
			Value val;
			try {
				val = e.eval(Util.env());
				
				if(val instanceof ListValue){
					return ((ListValue)val).getHead().equals(((Expression) obj).eval(Util.env()));
				}else{
					Util.fatal("Type Error! in "+toString()+": "+e.toString()+" is not a list type");
				}
			} catch (SimPLFatalException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return false;
	}
	@Override
	public Value eval(RunTimeState rst) throws SimPLFatalException{
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