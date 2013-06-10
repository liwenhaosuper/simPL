package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.util.Util;

public class PairValue extends Value{
	Value e1;
	Value e2;
	
	public PairValue(Value e1,Value e2){
		this.e1 = e1;
		this.e2 = e2;
		if(e1==null||e2==null){
			Util.fatal("Runtime Error:PairValue is null!");
		}
	}
	@Override
	public Value eval(RunTimeState rst){
		return this;
	}
	public Value getFirst(){
		return e1;
	}
	public Value getSecond(){
		return e2;
	}
	public String toString(){
		return "(" + e1.toString() + ", " + e2.toString() + ")";
	}
	@Override
	public boolean equals(Object obj){
		if(obj instanceof PairValue){
			if(((PairValue)obj).getFirst().equals(e1)&&((PairValue)obj).getSecond().equals(e2)){
				return true;
			}
		}
		return false;
	}
}