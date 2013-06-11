package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class IfThenElse extends Expression{
	Expression condition;
	Expression thenClause;
	Expression elseClause;
	
	public IfThenElse(Expression e1,Expression e2,Expression e3){
		condition = e1;
		thenClause = e2;
		elseClause = e3;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		return new IfThenElse(condition.nestedReplace(sf),thenClause.nestedReplace(sf),elseClause.nestedReplace(sf));
	}
	@Override
	public Value eval(RunTimeState rst) throws SimPLFatalException{
		Value condv = condition.eval(rst);
		if(condv instanceof BoolValue){
			if(((BoolValue)condv).getBool()){
				return thenClause.eval(rst);
			}else{
				return elseClause.eval(rst);
			}
		}
		Util.fatal("Runtime Error!"+toString());
		return null;
	}
	public String toString(){
		return "if " + condition.toString() + " then " + thenClause.toString() + " else " + elseClause.toString();
	}
}