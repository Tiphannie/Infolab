package histogramm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RunLab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       
		File file = new File("/Users/tiphanniebyakuleka/Desktop/ReportTicketMachine.txt");
		Scanner scan = new Scanner(file); 
		
		String fileContent = "This is a new file made by me"; 
		
		while(scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n"); 
			//System.out.println(scan.nextLine()); 
		}
		
		FileWriter writer = new FileWriter("/Users/tiphanniebyakuleka/Desktop/NewFile.txt"); 
		writer.write(fileContent); 
		writer.close(); 
		scan.close(); 
	}
	
}
