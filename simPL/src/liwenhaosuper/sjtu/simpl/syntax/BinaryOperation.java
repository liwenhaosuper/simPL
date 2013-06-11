package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class BinaryOperation extends Expression{
	public enum BinaryOperator{
		plus, minus, times, devide, biggerThan, lessThan, equal, and, or
	}
	
	Expression e1;
	Expression e2;
	BinaryOperator op;
	
	public BinaryOperation(){
		
	}
	public BinaryOperation(Expression ea,Expression eb,BinaryOperator o){
		this.e1 = ea;
		this.e2 = eb;
		this.op = o;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		//FIXME: should op be copied either?
		BinaryOperation bo = new BinaryOperation(e1.nestedReplace(sf),e2.nestedReplace(sf),op);
		return bo;
	}
	@Override
	public Value eval() throws SimPLFatalException{
		Value a = e1.eval();
		Value b = e2.eval();
		switch(this.op){
		case plus:
			if(a instanceof IntValue && b instanceof IntValue){
				return new IntValue(((IntValue)a).getInt()+((IntValue)b).getInt());
			}
		case minus:
			if(a instanceof IntValue && b instanceof IntValue){
				return new IntValue(((IntValue)a).getInt()-((IntValue)b).getInt());
			}
		case times:
			if(a instanceof IntValue && b instanceof IntValue){
				return new IntValue(((IntValue)a).getInt()*((IntValue)b).getInt());
			}
		case devide:
			if(a instanceof IntValue && b instanceof IntValue){
				if(((IntValue)b).getInt()==0){
					Util.fatal("Runtime error! divide by 0!"+toString());
				}
				return new IntValue(((IntValue)a).getInt()/((IntValue)b).getInt());
			}
		case biggerThan:
			if(a instanceof IntValue && b instanceof IntValue){
				if(((IntValue)a).getInt()> ((IntValue)b).getInt()){
					return new BoolValue(true);
				}else{
					return new BoolValue(false);
				}
			}
		case lessThan:
			if(a instanceof IntValue && b instanceof IntValue){
				if(((IntValue)a).getInt()< ((IntValue)b).getInt()){
					return new BoolValue(true);
				}else{
					return new BoolValue(false);
				}
			}
		case equal:
			if(a instanceof IntValue && b instanceof IntValue){
				if(((IntValue)a).getInt()==((IntValue)b).getInt()){
					return new BoolValue(true);
				}else{
					return new BoolValue(false);
				}	
			}
			if(a.equals(b)){
				return new BoolValue(true);
			}else{
				return new BoolValue(false);
			}
		case and:
			if(a instanceof IntValue && b instanceof IntValue){
				if((((IntValue)a).getInt()&((IntValue)b).getInt())!=0){
					return new BoolValue(true);
				}else{
					return new BoolValue(false);
				}
			}else if(a instanceof BoolValue && b instanceof BoolValue){
				return new BoolValue(((BoolValue)a).getBool()&&((BoolValue)b).getBool());
			}
		case or:
			if(a instanceof IntValue && b instanceof IntValue){
				if((((IntValue)a).getInt()|((IntValue)b).getInt())!=0){
					return new BoolValue(true);
				}else{
					return new BoolValue(false);
				}
			}else if(a instanceof BoolValue && b instanceof BoolValue){
				return new BoolValue(((BoolValue)a).getBool()||((BoolValue)b).getBool());
			}
		}
		Util.fatal("Type Error:"+toString0()+";"+a+":"+a.getClass()+";"+b+":"+b.getClass());
		return null;
	}
	@Override
	public String toString(){
		return toString0();
	}
	
	public String toString0(){
		String operator = "";
		switch(this.op){
		case plus:
			operator = "+"; break;
		case minus:
			operator = "-"; break;
		case times:
			operator = "*"; break;
		case devide:
			operator = "/"; break;
		case biggerThan:
			operator = ">"; break;
		case lessThan:
			operator = "<"; break;
		case equal:
			operator = "="; break;
		case and:
			operator = "and"; break;
		case or:
			operator = "or"; break;
		}
		return e1.toString() + " " + operator + " " + e2.toString();
	}
	
}