package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;

public class Nil extends Value{
	public String toString(){
		return "nil";
	}
	public Value eval(RunTimeState rst){
		return this;
	}
	public boolean equals(Object obj){
		if(obj instanceof Nil){
			return true;
		}
		return false;
	}
}