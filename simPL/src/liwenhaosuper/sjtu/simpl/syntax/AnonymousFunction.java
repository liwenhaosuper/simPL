package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.Memory;
import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class AnonymousFunction extends Value{
	Variable arg;
	Expression body;
	
	public AnonymousFunction(Variable arg,Expression body){
		this.arg = arg;
		this.body = body;
	}
	@Override
	public Value eval(RunTimeState rst){
		return this;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		AnonymousFunction func = new AnonymousFunction((Variable)arg.nestedReplace(sf),body.nestedReplace(sf));
		return func;
	}
	public Value invokeFunc(Value val,RunTimeState rst){
		StateFrame nst = new StateFrame();
		int addr = Memory.getInstance().allocate(val);
		nst.put(arg.name, addr);
		rst.popin(nst);
		Value bd = body.eval(rst);
		if(bd instanceof AnonymousFunction){
			//TODO: FIXME
			//Util.log("Nested AnonymousFunction is a bug!!!");
			StateFrame sf = new StateFrame();
			sf.put(arg.name, addr);
			bd = (Value)bd.nestedReplace(sf);
		}
		rst.popout();
		return bd;
	}
	
	public String toString(){
		return "fun " + arg.toString() + " -> " + body.toString();
		//return eval().toString();
	}
}