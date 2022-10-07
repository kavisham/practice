package com.cg.beans;

public class Timer implements Runnable{
	public void run() {
		System.out.println(java.time.LocalDate.now());
	}
}
