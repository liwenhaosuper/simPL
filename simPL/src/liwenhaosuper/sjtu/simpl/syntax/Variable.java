package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.Memory;
import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.util.Util;

public class Variable extends Expression{
	String name;
	//Value val;
	public Variable(String nm){
		this.name = nm;
	}
	//public void setVal(Value val){
	//	this.val = val;
	//}
	@Override
	public Value eval(RunTimeState rst){
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