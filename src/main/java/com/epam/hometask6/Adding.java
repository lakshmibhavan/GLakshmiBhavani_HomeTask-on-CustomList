package com.epam.hometask6;
import java.io.*; 
import java.util.*; 

public class Adding {
		public static void main(String[] args) 
		{ 
			// creating an Empty Integer List 
			List<Integer> arr = new ArrayList<Integer>(4); 

		
			arr.add(40); 
			arr.add(20); 
			arr.add(60); 
			arr.add(10); 

			System.out.println("List: " + arr); 

			try { 
	            int element = arr.get(3); 
	            System.out.println("The value at Index 3 is:"+element);
	        } 
	        catch (Exception e) { 
	            System.out.println(e); 
	        } 
			try { 
	            int element = arr.get(8); 
	            System.out.println("The value at Index 8 is:"+element);
	        } 
	        catch (Exception e) { 
	            System.out.println(e); 
	        } 
			arr.remove(new Integer(10)); 
	        arr.remove(new Integer(20)); 
	        System.out.println("The modified list is:"+arr);
	        System.out.println(arr.size());
	} 
}
