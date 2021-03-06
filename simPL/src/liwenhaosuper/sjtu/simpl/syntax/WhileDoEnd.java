package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class WhileDoEnd extends Expression{
	Expression condition;
	Expression body;
	
	public WhileDoEnd(Expression e1,Expression e2){
		condition = e1;
		body = e2;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		return new WhileDoEnd(condition.nestedReplace(sf),body.nestedReplace(sf));
	}
	@Override
	public Value eval() throws SimPLFatalException{
		Value condv = condition.eval();
		if(condv instanceof BoolValue){
			BoolValue bval = (BoolValue)condv;
			while (bval.getBool()){
				if(!(body.eval() instanceof Nop)){
					Util.fatal("Type Error!"+body.toString()+" should be a unit type!");
				}
				bval = (BoolValue)condition.eval();
			}
			return new Nop();
		}
		Util.fatal("Runtime Error!"+toString());
		return null;
	}
	public String toString(){
		return "while " + condition.toString() + " do " + body.toString() + " end";
	}
}
