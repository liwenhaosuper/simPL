package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.util.Util;

public class Application extends Expression{
	Expression func;
	Expression param;

	public Application(Expression e1,Expression e2){
		this.func = e1;
		this.param = e2;
	}
	@Override
	public Value eval(RunTimeState rst){
		Value par = param.eval(rst);
		if(func instanceof AnonymousFunction){
			return ((AnonymousFunction)func).invokeFunc(par, rst);
		}
		Util.fatal("Runtime error:"+toString());
		return null;
	}
	public String toString(){
		return "(" + func.toString() + " " + param.toString() + ")";
	}
}