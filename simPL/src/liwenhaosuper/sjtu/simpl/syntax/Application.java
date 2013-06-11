package liwenhaosuper.sjtu.simpl.syntax;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class Application extends Expression{
	Expression func;
	Expression param;

	public Application(Expression e1,Expression e2){
		this.func = e1;
		this.param = e2;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		Application app = new Application(func.nestedReplace(sf),param.nestedReplace(sf));
		return app;
	}
	@Override
	public Value eval(RunTimeState rst) throws SimPLFatalException{
		Value par = param.eval(rst);
		Value funcv = func.eval(rst);
		if(funcv instanceof AnonymousFunction){
			Value ret = ((AnonymousFunction)funcv).invokeFunc(par, rst).eval(rst);
			//Util.log("ret:"+ret.toString());
			return ret;
		}
		/*
		if(func instanceof Variable){
			Integer id = rst.get(((Variable)func).name);
			if(id==null){
				Util.fatal("Syntax Error:"+((Variable)func).name+" not defined!");
			}
			Value vfunc = Memory.getInstance().getValue(id);
			if(vfunc instanceof AnonymousFunction){
				Value v1 = ((AnonymousFunction)vfunc).invokeFunc(par, rst).eval(rst);
				return v1;
			}
		}else if(func instanceof AnonymousFunction){
			Value v2 = ((AnonymousFunction)func).invokeFunc(par, rst).eval(rst);
			return v2;
		}else if(func instanceof Application){
			Value vapp = func.eval(rst);
			Value v3 = new Application(vapp,par).eval(rst);
			return v3;
		}//FIXME: nested application!!!
		*/
		Util.fatal("Type error:"+func+"is not a function."+ toString());
		return null;
	}
	public String toString(){ 
		try {
			FileInputStream fin = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "(" + func.toString() + " " + param.toString() + ")";
	}
}