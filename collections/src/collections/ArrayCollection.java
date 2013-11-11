package collections;

import java.util.*;

public class ArrayCollection {
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for(int i=0; i<=3;i++){
			numbers.add(i);
			//System.out.println(numbers.get(i));
		}
		
		for(Integer val: numbers){
			System.out.println(val);
		}
		 
		
		numbers.remove(numbers.size()-1);
		numbers.remove(0);
		
		for(Integer val: numbers){
			System.out.println(val);
		}
		
		List<String> list = new LinkedList<String>();
		
		list.add("saqib");
		list.add("arfa");
		list.add("hassan");
		list.add("mahnoor");
		
		for(String l: list)
		{
			System.out.println(list.get(l));
		}

	}

}
