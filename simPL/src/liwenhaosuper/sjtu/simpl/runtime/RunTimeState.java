package liwenhaosuper.sjtu.simpl.runtime;

public class RunTimeState {
	private StateFrame stFrame = null;
	private StateFrame snapshot = null;
	
	public RunTimeState()
	{
		stFrame = new StateFrame();
	}
	
	public void put(String id, int addr)
	{
		stFrame.put(id, addr);
	}
	
	public Integer get(String id)
	{
		return stFrame.get(id);
	}
	
	public void popin(StateFrame st)
	{
		stFrame = stFrame.onion(st); 
	}
	
	public void popout()
	{
		if(stFrame != null)
		{
			stFrame = stFrame.outerBlockState;
		}
	}
	
	public String toString()
	{
		return stFrame.toString();
	}
	
	public void print()
	{
		stFrame.print();
	}
	
	public void recover()
	{
		if( snapshot != null)
		{
			stFrame = snapshot;
		}
	}
	
	public boolean snapshotState()
	{
		if( snapshot == null)
		{
			snapshot = stFrame;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public StateFrame getCurrentState()
	{
		return stFrame;
	}
	
	public void recoverTo(StateFrame stFrame)
	{
		this.stFrame = stFrame;
	}
	
}
