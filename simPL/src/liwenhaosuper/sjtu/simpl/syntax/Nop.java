package liwenhaosuper.sjtu.simpl.syntax;


public class Nop extends Value{
	public String toString(){
		return "()";
	}
	@Override
	public Value eval(){
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