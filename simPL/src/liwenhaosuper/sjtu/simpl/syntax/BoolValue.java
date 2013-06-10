package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;

public class BoolValue extends Value{
	boolean value;

	public BoolValue(boolean v){
		this.value = v;
	}
	public boolean getBool(){
		return value;
	}
	@Override
	public Value eval(RunTimeState rst){
		return this;
	}
	public String toString(){
		if(value)
			return "true";
		else
			return "false";
	}
}