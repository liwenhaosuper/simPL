package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;

public class Nop extends Value{
	public String toString(){
		return "()";
	}
	public Value eval(RunTimeState rst){
		return this;
	}
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Nop){
			return true;
		}
		return false;
	}
}