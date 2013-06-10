package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.Memory;
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
		if(func instanceof Variable){
			Integer id = rst.get(((Variable)func).name);
			Value vfunc = Memory.getInstance().getValue(id);
			if(vfunc instanceof AnonymousFunction){
				return ((AnonymousFunction)vfunc).invokeFunc(par, rst);
			}
		}else if(func instanceof AnonymousFunction){
			return ((AnonymousFunction)func).invokeFunc(par, rst);
		}else if(func instanceof Application){
			Value vapp = func.eval(rst);
			return new Application(vapp,par).eval(rst);
		}//FIXME: nested application!!!
		
		Util.fatal("Type error:"+func+"is not a function."+ toString());
		return null;
	}
	public String toString(){
		return "(" + func.toString() + " " + param.toString() + ")";
	}
}