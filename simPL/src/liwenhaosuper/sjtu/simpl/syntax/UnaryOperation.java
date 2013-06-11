package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class UnaryOperation extends Expression{
	public enum UnaryOperator{
		not, negative
	}
	public UnaryOperation(){
		
	}
	public UnaryOperation(Expression e,UnaryOperator op){
		this.e = e;
		this.op = op;
	}
	Expression e;
	UnaryOperator op;
	@Override
	public Expression nestedReplace(StateFrame sf){
		return new UnaryOperation(e.nestedReplace(sf),op);
	}
	@Override
	public Value eval() throws SimPLFatalException{
		Value v = e.eval();
		if(v instanceof BoolValue){
			if(((BoolValue)v).getBool()){
				return new BoolValue(false);
			}else{
				return new BoolValue(true);
			}
		}
		Util.fatal("Type error:"+toString0());
		return null;
	}
	@Override
	public String toString(){
		return toString0();
	}
	public String toString0(){
		String operator = "";
		switch(op){
		case not:
			operator = "~"; break;
		case negative:
			operator = "not "; break;
		}
		return operator + e.toString();
	}
}