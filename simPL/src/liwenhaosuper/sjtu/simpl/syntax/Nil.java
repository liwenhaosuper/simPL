package liwenhaosuper.sjtu.simpl.syntax;


public class Nil extends Value{
	public String toString(){
		return "nil";
	}
	@Override
	public Value eval(){
		return this;
	}
	public boolean equals(Object obj){
		if(obj instanceof Nil){
			return true;
		}
		return false;
	}
}