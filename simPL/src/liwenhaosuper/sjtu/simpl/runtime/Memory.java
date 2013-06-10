package liwenhaosuper.sjtu.simpl.runtime;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import liwenhaosuper.sjtu.simpl.syntax.Value;
import liwenhaosuper.sjtu.simpl.util.Util;

public class Memory {
	private HashMap<Integer,Value> m;
	private int lastAddr = 0;
	
	private static Memory mem = null;
	private Memory(){
		m = new HashMap<Integer,Value>();
	}

	public static Memory getInstance()
	{
		if( mem == null )
		{
			mem = new Memory();
		}
		
		return mem;
	}
	
	private int getFreeAddr()
	{
		return ++lastAddr;
	}
	
	public int allocate(Value v)
	{
		int addr = getFreeAddr();
		m.put(addr, v);
		return addr;
	}
	
	public void dallocate(int addr)
	{
		m.remove(addr);
	}
	
	public void set(int addr, Value v)
	{
		if(m.containsKey(addr))
		{
			m.put(addr, v);
		}
		else
		{
			Util.fatal("memory error:addr["+addr+"] not find...");
		}
	}
	
	public Value getValue(int addr)
	{
		return m.get(addr);
	}
	
	public boolean contains(Integer addr)
	{
		return this.m.containsKey(addr);
	}
	
	public String toString()
	{
		String memMsg = "mem:";
		Set<Entry<Integer, Value>> set = m.entrySet();
		Iterator<Entry<Integer, Value>> it = set.iterator();
		while (it.hasNext()) {
			Entry<Integer, Value> entry = (Entry<Integer, Value>) it.next();
			memMsg += "<" + entry.getKey() + ","
					+ entry.getValue().toString() + ">,";
		}
		return memMsg;
	}
	
	public void clean()
	{
		this.m.clear();
	}
	
	public void print()
	{
		System.out.print(this.toString());
	}
	
}
