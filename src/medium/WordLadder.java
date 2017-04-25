package medium;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WordLadder {

	//BFS
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    	Deque<String> queue = new LinkedList<>();
    	Set<String> visited = new HashSet<>();
    	queue.addLast(beginWord);
    	queue.addLast(null); //Ending flag for current level
    	visited.add(beginWord);
    	int level = 1;
    	while(!queue.isEmpty()){
    		String str = queue.poll();
    		if(str != null){
    			for(int i = 0; i < str.length(); ++i){
    				char[] letters = str.toCharArray();
    				for(char c = 'a'; c <= 'z'; ++c){
    					letters[i] = c;
    					String newWord = new String(letters);
    					//if(newWord.equals(endWord) && wordList.contains(newWord)) return level + 1;
    					if(wordList.contains(newWord) && !visited.contains(newWord)){
    						queue.addLast(newWord);
    						visited.add(newWord);
    						if(newWord.equals(endWord)) return level + 1;
    					}
    				}
    			}
    		}else{
    			level++;
    			if(!queue.isEmpty()) queue.addLast(null); //Add level ending flag
    		}
    	}
    	return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
