package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class ListValue extends Value{
	Value head;
	Value tail;
	
	public ListValue(Value v1,Value v2){
		this.head = v1;
		this.tail = v2;
		if(!(tail instanceof ListValue)&&!(tail instanceof Nil)){
			tail = new ListValue(tail,new Nil());			
		}
	}

	public Value getHead(){
		return head;
	}
	public Value getTail(){
		return tail;
	}
	public String toString(){
		return "[" + head.toString() + " " + tail.toString() + "]";
	}
	@Override
	public Value eval(){
		return this;
	}
	@Override
	public boolean equals(Object obj){
		if (obj instanceof ListValue){
			return head.equals(((ListValue)obj).getHead()) && tail.equals(((ListValue)obj).getTail());
		}
		return false;
	}
}