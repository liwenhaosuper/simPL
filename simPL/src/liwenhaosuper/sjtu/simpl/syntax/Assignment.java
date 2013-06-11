package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.Memory;
import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class Assignment extends Expression{
	Expression var;
	Expression val;
	
	public Assignment(Expression var,Expression val){
		this.var = var;
		this.val = val;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		Assignment assign = new Assignment(var.nestedReplace(sf),val.nestedReplace(sf));
		return assign;
	}
	@Override
	public Value eval(RunTimeState rst) throws SimPLFatalException{
		Value va = val.eval(rst);
		Expression exp = var;
		if(!(var instanceof Variable)){
			Util.log("Assignment error: no support for nested/indirect assignment");
		}
		Memory.getInstance().set(rst.get(((Variable)exp).name), va);
		return new Nop();
	}
	
	public String toString(){
		return var.toString() + " := " + val.toString();
	}
}