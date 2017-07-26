package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

public class dictionarypractice {

	public static void main(String[] args) {
		
		// English to Spanish Dictionary
		Map<String, String> englishSpanDictionary = new HashMap<String,String>();
		englishSpanDictionary.put("Monday", "Lunes");
		englishSpanDictionary.put("Tuesday", "Martes");
		englishSpanDictionary.put("Wednesday", "Miercoles");
		englishSpanDictionary.put("Thursday", "Jueves");
		englishSpanDictionary.put("Friday", "Viernes");
		englishSpanDictionary.put("Saturday", "Sabado");
		englishSpanDictionary.put("Sunday", "Domingo");
		
		System.out.println(englishSpanDictionary.get("Monday"));
		System.out.println(englishSpanDictionary.get("Tuesday"));
		System.out.println(englishSpanDictionary.get("Wednesday"));
		System.out.println(englishSpanDictionary.get("Thursday"));
		System.out.println(englishSpanDictionary.get("Friday"));
		
		//print out all keys
		System.out.println("=================================");
		System.out.println(englishSpanDictionary.keySet());
		System.out.println(englishSpanDictionary.values());
		
		//print out size
		System.out.println(englishSpanDictionary.size());
		
		
		//Shopping List
		Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oreos", Boolean.TRUE);
		shoppingList.put("Eggs", Boolean.FALSE);
		shoppingList.put("Sugar", false);
		//Retrieve items
		
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Sugar"));
		
		// Key-Value pairs Print out
		System.out.println(shoppingList.toString());
		//Clear out dictionary
		
		System.out.println(shoppingList.isEmpty());
		
	//	shoppingList.clear();
	
		System.out.println(shoppingList.isEmpty());
		
		shoppingList.remove("Eggs");
		System.out.println(shoppingList.toString());
		
		//Replace values for a certain key
		shoppingList.replace("Bread", Boolean.FALSE);
		
	}

}
