package liwenhaosuper.sjtu.simpl.syntax;

public class IntValue extends Value{
	boolean isUndef;
	int value;

	public IntValue(int val){
		this.value = val;
	}
	
	public String toString(){
		if(isUndef)
			return "undef";
		else
			return String.valueOf(value);
	}
}