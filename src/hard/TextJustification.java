package hard;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

    public static List<String> textWrapper(String[] words, int maxWidth) {
    	List<String> result = new ArrayList<>();
    	if(words == null || words.length == 0){
    		StringBuilder empty = new StringBuilder();
    		for(int i = 0; i < maxWidth; ++i)
    			empty.append(" ");
    		result.add(empty.toString());
    		return result;
    	}
    	int lineLength = 0, startIndex = 0, endIndex = 0;
    	while(startIndex < words.length){
    		int lengthDiff = 0;
    		//Decide the start index and end index for each line
    		for(int i = startIndex; i < words.length; ++i){
    			int wordLength = words[i].length() + 1;
        		if(wordLength + lineLength < maxWidth + 1)
        			lineLength += wordLength;
        		else if(wordLength + lineLength > maxWidth + 1){
        			//pad spaces for this amount
        			lengthDiff = maxWidth - lineLength + 1; 
        			endIndex = i - 1;
        			break;
        		}    			
        		else{
        			endIndex = i;
        			break;
        		}
        		if(i == words.length - 1) {
        			lengthDiff = maxWidth - lineLength + 1;
        			endIndex = i;
        		}
    		}
    		lineLength = 0;
    		//Initial a new line
    		StringBuilder line = new StringBuilder();
    		int spacePerWord = 0, tail = 0;
    		if(endIndex - startIndex - 1 > 0){
    			spacePerWord = lengthDiff / (endIndex - startIndex - 1);
        		tail = lengthDiff - spacePerWord * (endIndex - startIndex - 1);	
    		}else spacePerWord = lengthDiff;	
    		for(int j = startIndex; j <= endIndex; ++j){
    			//Pad spaces between the words
    			if(lengthDiff == 0){
    				line.append(j == endIndex ? words[j] : words[j] + " ");	
    			}else{
    				if(j < endIndex - 1){
    					line.append(words[j]);
    					for(int k = 0; k <= spacePerWord; ++k)
    						line.append(" ");
    				}else if(j == endIndex - 1){
    					line.append(words[j]);
    					for(int k = 0; k <= tail; ++k)
    						line.append(" ");
    				}else {
    					line.append(words[j]);
    					for(int k = 0; k < spacePerWord; ++k)
    						line.append(" ");
    				}
    			}
    		}
    		result.add(line.toString());
    		startIndex = endIndex + 1;
    	}	
    	return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[]{"Listen","to","many,","speak","to","a","few."};
		List<String> result = textWrapper(words, 6);
		for(String str : result)
			System.out.println(str);	
	}

}
