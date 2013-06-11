package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.Memory;
import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
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
	public Value eval(){
		return this;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		AnonymousFunction func = new AnonymousFunction(arg,body.nestedReplace(sf));
		return func;
	}
	@Override
	public boolean equals(Object obj){
		return false;
	}
	public Value invokeFunc(Value val) throws SimPLFatalException{
		StateFrame nst = new StateFrame();
		int addr = Memory.getInstance().allocate(val);
		nst.put(arg.name, addr);
		Util.env().popin(nst);
		Value bd = body.eval();
		
		if(bd instanceof AnonymousFunction){
			//TODO: FIXME
			//Util.log("before:"+bd);
			StateFrame sf = new StateFrame();
			sf.put(arg.name, addr);
			bd = (AnonymousFunction)bd.nestedReplace(sf);
			//Util.log("after:"+bd);
		}
		Util.env().popout();
		return bd;
	}
	public String toString(){
		return "fun " + arg.toString() + " -> " + body.toString();
		//return eval().toString();
	}
}