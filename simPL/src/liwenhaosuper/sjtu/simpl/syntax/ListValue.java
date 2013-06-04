package liwenhaosuper.sjtu.simpl.syntax;

public class ListValue extends Value{
	Value head;
	Value tail;
	
	public String toString(){
		return "[" + head.toString() + ", " + tail.toString() + "]";
	}
}