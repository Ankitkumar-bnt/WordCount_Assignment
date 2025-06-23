
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class CharacterOccurrenceHelper {

	private String acceptFilePath()
	{
		
		String str = "";
		String path = "https://raw.githubusercontent.com/Ankitkumar-bnt/WordCount_Assignment/WordCount_Assign_1/InputFile.txt";
				
		try {
			URL url = new URL(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			while((line=reader.readLine())!=null)
			{
				str = str + line;
			}
			reader.close();
			return str;
		} catch (Exception e) {
			System.out.println("\nFile not found!\n");
			return "";
		}
	}
	
	private Map<Character, Integer> getOccurenceOfEachChar(String str)
	{
		char ch[] = str.toCharArray();
		
		List<Character> charList = new ArrayList<>();
		
		for(int i=0;i<ch.length;i++)
			charList.add(Character.toUpperCase(ch[i]));
		
		Map<Character, Integer> occurence = new HashMap<>();
		
		for(int i=0;i<charList.size()-1;i++) {			
			int count = 1;
			if(charList.get(i) != ' ' && (int)charList.get(i) != 10 && (int)charList.get(i) != 13) {
				for(int j=i+1;j<charList.size();j++){
					if(charList.get(i) == charList.get(j)){
						count++;
						charList.remove(j);
						j-=1;
					}
				}
				occurence.put(charList.get(i), count);
			}
		}
		return occurence;
	}
	
	public void printCharacters()
	{
		Map<Character, Integer> sortedChar = getOccurenceOfEachChar(acceptFilePath());
		
		boolean flag = false;
		System.out.println("Alphabates");
		for(Map.Entry<Character, Integer> x : sortedChar.entrySet()) {
			if(x.getKey() >= 'A' && x.getKey()<='Z') {
				flag = true;
				System.out.println(x.getKey()+" = "+x.getValue());
			}
		}
		if(!flag)
			System.out.println("Nil");
		
		flag=false;
		System.out.println("\nNumbers");
		for(Map.Entry<Character, Integer> x : sortedChar.entrySet()) {
			if(x.getKey() >= '0' && x.getKey()<='9') {
				flag = true;
				System.out.println(x.getKey()+" = "+x.getValue());
			}
		}
		if(!flag)
			System.out.println("Nil");
		
		flag=false;
		System.out.println("\nSpectial Characters");
		for(Map.Entry<Character, Integer> x : sortedChar.entrySet()) {
			if(!(x.getKey() >= 'A' && x.getKey()<='Z') && !(x.getKey() >= '0' && x.getKey()<='9')) {
				flag = true;
				System.out.println(x.getKey()+" = "+x.getValue());
			}
		}
		if(!flag)
			System.out.println("Nil");
	}

}
