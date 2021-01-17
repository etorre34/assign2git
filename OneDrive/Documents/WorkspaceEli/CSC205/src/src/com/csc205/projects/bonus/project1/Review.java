package src.com.csc205.projects.bonus.project1;

import java.io.File;

public class Review {

	private boolean findDirectory(File sourceDir, String TargetDirectiorty) {
		
		boolean fileFound = false;
		file[] files = sourceDir.listFiles();
		for (File file : files) {
			
			if (file.isFile()) {
				
			}
			
			if (file.isDirectory()) {
				String directoryname = file.getName();
				if (tar)
			}
		}
		//line 23, findDirectory(file, targetDirectory); = recursion line method is being called
		//base cases: String directoryName = file.getName();
		//base cases can be explicit and ineplicit
		//Always need a base case
		//No base case means StackOverflowError
		
	}
	
}
