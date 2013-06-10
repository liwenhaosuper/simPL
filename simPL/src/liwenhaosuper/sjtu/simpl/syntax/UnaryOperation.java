package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
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
	public Value eval(RunTimeState rst){
		Value v = e.eval(rst);
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