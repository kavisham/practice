package com.cg.beans;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyDataThread {
		public static void main(String args[]) {
			try {
				FileInputStream fi = new FileInputStream("source.txt");
				FileOutputStream fo = new FileOutputStream("target.txt");
				int i = fi.read();
				int count=0;
				while(i!=-1 && count<10) {
					fo.write(i);
					System.out.println((char)i);
					if(count==9) {
						Thread.sleep(4000);
						count=-1;
					}
					i = fi.read();
					count++;
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
}
