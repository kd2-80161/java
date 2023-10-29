/**
 * 
 */
package sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class TerminalRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader fin=new FileReader("Buffer.txt")){
			try(BufferedReader brd =new BufferedReader(fin)){
				while(true) {
					String line = brd.readLine();
					if(line==null) {
						break;
					}
					System.out.println(line);
				}
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
