package liwenhaosuper.sjtu.simpl.runtime;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

import liwenhaosuper.sjtu.simpl.util.Util;

public class StateFrame {
	private HashMap<String,Integer> env;
	
	public StateFrame outerBlockState = null;
	
	public StateFrame(){
		env = new HashMap<String,Integer>();
		outerBlockState = null;
	}
	
	public void put(String id, Integer addr)
	{
		env.put(id, addr);
	}
	
	public StateFrame onion(StateFrame state)
	{
		state.outerBlockState = this;
		return state;
	}
	
	public Integer get(String id)
	{
		StateFrame st = this;
		Integer addr;
		try{
			while(st != null)
			{
				addr = st.env.get(id);
				if(addr == null)
					st = st.outerBlockState;
				else
					return addr;
			}
		}catch(StackOverflowError e){
			Util.log(toString());
			throw e;
		}
		
		return null;
	}
	
	public boolean contains(String id)
	{
		StateFrame st = this;
		while(st != null)
		{
			if(st.env.containsKey(id))
				return true;
			else
				st = st.outerBlockState;
		}
		return false;
	}
	
	public void set_or_add(String id, int addr)
	{
		StateFrame st = this;
		while(st != null)
		{
			Integer t = st.env.get(id);
			if(t == null)
				st = st.outerBlockState;
			else
				break;
		}
		
		//if some outer block typemap contains id
		if(st != null)
		{
			st.env.put(id, addr);
		}
		else
		{
			this.env.put(id, addr);
		}
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	public String toString()
	{
		String stateMsg = "{";

		StateFrame st = this;
		while (st != null) {
			Set set = st.env.entrySet();
			Iterator it = set.iterator();
			while (it.hasNext()) {
				Entry<String, Integer> entry = (Entry<String, Integer>) it.next();
				stateMsg += "<" + entry.getKey() + ","
						+ entry.getValue().toString() + ","
						+ Memory.getInstance().getValue(entry.getValue()).toString()+">,";
			}

			st = st.outerBlockState;
		}
		stateMsg += "}";
		return stateMsg;
	}
	
	public static void main(String args[])
	{
		StateFrame tm1 = new StateFrame();
		tm1.put("x", 1);
		tm1.put("y", 2);
		
		tm1.print();
		
		StateFrame tm2 = new StateFrame();
		tm2.put("z", 3);
		
		tm2.print();
		
		tm1 = tm1.onion(tm2);
		
		tm1.print();
		
		System.out.print(tm1.get("z"));
	}
}
