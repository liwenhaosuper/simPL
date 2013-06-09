package liwenhaosuper.sjtu.simpl.syntax;

public class ListValue extends Value{
	Value head;
	Value tail;
	
	public ListValue(Value v1,Value v2){
		this.head = v1;
		this.tail = v2;
	}
	
	public String toString(){
		return "[" + head.toString() + ", " + tail.toString() + "]";
	}
}