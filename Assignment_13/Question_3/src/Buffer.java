/**
 * 
 */
package com.sunbeam;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.Writer;

public class Buffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		try(FileWriter fwr=new FileWriter("Buffer.txt")){
			try(BufferedWriter bwr=new BufferedWriter(fwr)){
				for(int i=1; i<=4; i++) {
					String line = sc.nextLine();
					
					bwr.write(line);
			bwr.newLine();
					}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
	}

}
