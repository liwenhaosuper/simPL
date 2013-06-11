package liwenhaosuper.sjtu.simpl.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;

public class Util {
	public static void fatal(String msg) throws SimPLFatalException{
		//System.out.println(msg);
		throw new SimPLFatalException(msg);			
	}
	public static void log(String msg){
		if(outfile!=null){
			try {
				outfile.write(msg.getBytes());
				outfile.write('\n');
				outfile.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else
			System.out.println(msg);
	}
	private static FileOutputStream outfile;
	public static void loginit(String out){
		try {
			outfile = new FileOutputStream(out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void init(RunTimeState rt){
		rst = rt;
	}
	private static RunTimeState rst;
	public static RunTimeState env(){
		return rst;
	}
}
