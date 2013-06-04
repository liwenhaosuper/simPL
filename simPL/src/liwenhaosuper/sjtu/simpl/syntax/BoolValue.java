package liwenhaosuper.sjtu.simpl.syntax;

public class BoolValue extends Value{
	boolean value;

	public String toString(){
		if(value)
			return "true";
		else
			return "false";
	}
}