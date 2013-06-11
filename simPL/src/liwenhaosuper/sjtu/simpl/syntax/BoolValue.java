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
	public boolean equals(Object obj){
		if(obj instanceof BoolValue){
			return value == ((BoolValue)obj).value;
		}
		return false;
	}
	@Override
	public Value eval(){
		return this;
	}
	public String toString(){
		if(value)
			return "true";
		else
			return "false";
	}
}