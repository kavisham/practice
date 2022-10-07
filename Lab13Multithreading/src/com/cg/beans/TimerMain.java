package com.cg.beans;

public class TimerMain {
		public static void main(String args[]) {
			Timer t = new Timer();
			Thread th =  new Thread(t);
			
			while(true) {
				
				try {
					th.start();
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
}
