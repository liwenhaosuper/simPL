package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.Memory;
import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class Variable extends Expression{
	String name;
	//Value val;
	public Variable(String nm){
		this.name = nm;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		if(!sf.contains(name)){
			return new Variable(name); 
		}
		Integer addr = sf.get(name);
		if(!Memory.getInstance().contains(addr)){
			return new Variable(name);
		}
		Value v = Memory.getInstance().getValue(addr);
		
		if(v == null || v instanceof AnonymousFunction){
			return new Variable(name);
		}
		else{
			return v;
		}
		
	}
	@Override
	public Value eval(RunTimeState rst) throws SimPLFatalException{
		Integer id = rst.get(name);
		if(id==null){
			Util.fatal("Runtime Error:"+name+" not defined!");
		}
		return Memory.getInstance().getValue(id);
	}
	public String toString(){
		return name;
	}
}