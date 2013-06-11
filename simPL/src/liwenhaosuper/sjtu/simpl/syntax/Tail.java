package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class Tail extends Expression{
	Expression e;	
	
	public Tail(Expression e){
		this.e = e;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		return new Tail(e.nestedReplace(sf));
	}
	@Override
	public boolean equals(Object obj){
		if( obj instanceof Expression){
			Value val;
			try {
				val = e.eval();
			
				if(val instanceof ListValue){
					return ((ListValue)val).getTail().equals(((Expression) obj).eval());
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
	public Value eval() throws SimPLFatalException{
		Value val = e.eval();
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