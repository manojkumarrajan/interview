package com.informatica.alog.sdet;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 *  @author marajan
 */

public class MostFrequentWords {

	static HashMap <String, Integer> unsortedMap = new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		String fileName = "C:\\Manoj\\Manoj\\workspace\\Algorithms\\file.txt";

		ArrayList<String> fileContents = readFile(fileName);
		String [] list = fileContents.get(0).split(",");
		storeInMap(list);
		System.out.println("Print before sort");
		printMap(unsortedMap);
		Map<String, Integer> sortedMap= sortMapByValue(unsortedMap);
		System.out.println("Print after sort");
		printMap(sortedMap);
	}
	
	
	public static void storeInMap(String [] list){
		int value = 1;
		for(String s : list){
			if(!unsortedMap.containsKey(s)){
				unsortedMap.put(s, value);
			}else{
				unsortedMap.put(s, unsortedMap.get(s)+1 );
			}
		}
	}
	
	
	public static void printMap(Map <String, Integer> hsmap){
		for(Map.Entry<String, Integer> entry : hsmap.entrySet()){
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}
	}
	
	
	

	@SuppressWarnings("unused")
	public static ArrayList<String> readFile(String fileName) {
		String str = "";
		ArrayList<String> rows = new ArrayList<String>();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(new File(fileName)));

			if (br != null) {
				while ((str = br.readLine()) != null) {
					rows.add(str);
				}
			} else {
				System.out.println("File Not Found");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return rows;
	}
	
	
	//Map ---> List<Map> (LinkedList<Map> ---> Collections.sort() --> List<Map> (Sorted) ---> LinkedHashMap
	
	 private static Map<String, Integer> sortMapByValue(Map<String, Integer> unsortMap) {

	        
	       // 2. Sort list with Collections.sort(), provide a custom Comparator
	       //    Try switch the o1 o2 position for a different order
	        Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		};
			/* Get Set from Map.entrySet(); */
			Set<Entry<String, Integer>> set = unsortedMap.entrySet();
			/*Create List from Set */
			List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
			//or do below
			//List<Entry<String,Integer>> list = new LinkedList<Entry<String, Integer>(unsortedMap.entrySet());
	        Collections.sort(list, valueComparator);

	        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
	        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
	        for (Map.Entry<String, Integer> entry : list) {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }

	        return sortedMap;
	    }
	
	

}

