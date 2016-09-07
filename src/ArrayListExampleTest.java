import java.util.*;
import java.io.*;

public class ArrayListExampleTest 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		new ArrayListExampleTest().run();

	}
	public void run()
	{
		ArrayList<String> aList = new ArrayList<String>();
		
		Scanner keyboardScanner = new Scanner(System.in),
				fileScanner = null;
		
		String inFilePath, word;
		
		try
		{
			System.out.print("\nPlease enter the path for the inpit file: ");
			inFilePath = keyboardScanner.nextLine();
			fileScanner = new Scanner (new File(inFilePath));
			while(fileScanner.hasNext())
			{
				word = fileScanner.next();
				System.out.print(word);
				aList.add(word);
			}
			
			System.out.print("\n\n Please enter the word you want to search for: ");
			word = keyboardScanner.next();
			
			if(aList.indexOf(word) >= 0)
				System.out.print(word + " was found.\n\n");
			else
				System.out.print(word + " was not found.\n\n");
				
			System.out.print("Please enter a word you want to remove: ");
			word = keyboardScanner.next();
			int removalCount =0;
			while(aList.remove(word))
				removalCount ++;
			if(removalCount ==0)
				System.out.println(word + " was not found, so not removed.\n\n");
			else if(removalCount == 1)
				System.out.println("The only instance of the " + word +
					" was removed");
			else
				System.out.println("All " + removalCount + " instances of " + 
			word + " were removed.\n\n");
			
			System.out.print("Please enter the word you want to append: ");
			word = keyboardScanner.next();
			aList.add(word);
			System.out.println(word + " was appended.\n\n");
			
			System.out.print("Please enter the word you want to upper case: ");
			word = keyboardScanner.next();
			int position = aList.indexOf(word);
			if(position >= 0)
			{
				aList.set(position, word.toUpperCase());
				System.out.println(word + " was converted to upper-case.\n\n");
			}
			else
				System.out.println(word + " was not found, so not upper-cased.\n\n");
			System.out.println("Here is the final version:\n" + aList);
		}
		catch (IOException e)
		{
			System.out.print(e);
		}
	}
		
}
			
	


