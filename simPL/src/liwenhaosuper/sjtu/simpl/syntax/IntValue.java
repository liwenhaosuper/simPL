package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;

public class IntValue extends Value{
	boolean isUndef;
	int value;

	public IntValue(int val){
		this.value = val;
	}
	public int getInt(){
		return value;
	}

	@Override
	public Value eval(RunTimeState rst){
		return this;
	}
	public String toString(){
		//System.out.println("IntValue:");
		if(isUndef)
			return "undef";
		else
			return String.valueOf(value);
	}
	@Override
	public boolean equals(Object obj){
		if (obj instanceof IntValue){
			return value == ((IntValue)obj).getInt();
		}
		return false;
	}
}