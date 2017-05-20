package com.sree.prc.DemoProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {
	
	public static String testJoin1(){
		return String.join("-", "Sreekanth","Murali","Srinivas","Nagarjuna");
	}
	
	public static String testJoin2(String input){
		return String.join("+", Stream.of(input.split(" ")).collect(Collectors.toList()));
	}
	
	public static String testJoin3(){
		List<String> list=new ArrayList<>();
		list.add("Sreekanth");
		list.add("Murali");
		list.add("Srinivas");
		list.add("Nagarjuna");
		return String.join("/", list);
		}
	//Accepts null
	public static String testJoin4(){
		return String.join(".", "www","cutewebs","com", null);
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       System.out.println(testJoin1()); 
       System.out.println(testJoin2("Sreekanth Murali Srinivas Nagarjuna"));
       System.out.println(testJoin3());
       System.out.println(testJoin4());
        
    }
}
