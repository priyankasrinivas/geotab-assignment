/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package geotab_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.Hashtable;

public class Main {
	static char key;
    static Hashtable<String, String> names = new Hashtable<>();
	static String[] results = new String[50];
	
	
	 public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
	        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Press ? to get instructions.");
	        String input = c.readLine();
	   try {
		   if (input.equals("?")) {
	            while (true) {
	            	System.out.println("Press c to get categories");
	            	System.out.println("Press r to get random jokes");
	                getEnteredKey(c.readLine());
	                if (key == 'c')
	                {
	                    getCategories();
	                    PrintResults();
	                    System.out.println("Want to specify a category? y/n");
	                    getEnteredKey(c.readLine());
	                    if (key == 'y') {
	                    	System.out.println("Enter a category;");
	                    	String category = c.readLine();
	                    	System.out.println("How many jokes do you want? (1-9)");
	                        int n = Integer.parseInt(c.readLine());
	                        getNames();
	                        getRandomJokes(category, n);
	                        PrintResults();
	                    }  else
	                    {
	                    	System.out.println("How many jokes do you want? (1-9)");
	                        int n = Integer.parseInt(c.readLine());
	                        getNames();
	                        getRandomJokes(null, n);
	                        PrintResults();
	                    }
	                }
	                if (key == 'r')
	                {
	                	System.out.println("Want to use a random name? y/n");
	                    getEnteredKey(c.readLine());
	                    if (key == 'y') {
	                        getNames();
	                    }else if (key == 'n') {
	                    	System.out.println("Enter a fullname: (ex: John Doe)");
	                    	String name = c.readLine();
	                    	getMyOwnName(name, null);
	                    	
	                    }
	                    System.out.println("Want to specify a category? y/n");
	                    getEnteredKey(c.readLine());
	                    
	                    if (key == 'y') {
	                        System.out.println("Enter a category:");
	                        getEnteredKey(c.readLine());
	                        String category = c.readLine();
	                        System.out.println("How many jokes do you want? (1-9)");
	                    	int n = Integer.parseInt(c.readLine());
	                        getRandomJokes(category, n);
	                        PrintResults();
	                    }else if (key =='n'){
	                    	System.out.println("How many jokes do you want? (1-9)");
	                    	int n = Integer.parseInt(c.readLine());
	                        getRandomJokes(null, n);
	                        PrintResults();
	                    }
	                    	
	                    }
	                
	                }
	                
	            }
	   }catch(IllegalArgumentException ex) {
		   System.out.println("Please enter a valid input");
		   ex.printStackTrace();
	   }
	        	
	   }
	        
	       
	        
	    
	    private static void PrintResults() {
	       System.out.println("[" +String.join(",", results) + "]");
	    }
	    
	    
	    private static void getEnteredKey(String k) {
	    	try {
	    		switch (k.substring(0,1))
		        {
		            case "c":
		                key = 'c';
		                break;
		            case "0" :
		                key = '0';
		                break;
		            case "1":
		                key = '1';
		                break;
		            case "2":
		                key = '2';
		                break;
		            case "3":
		                key = '3';
		                break;
		            case "4":
		                key = '4';
		                break;
		            case "5":
		                key = '5';
		                break;
		            case "6":
		                key = '6';
		                break;
		            case "7":
		                key = '7';
		                break;
		            case "8":
		                key = '8';
		                break;
		            case "9":
		                key = '9';
		                break;
		            case "r":
		                key = 'r';
		                break;
		            case "y":
		                key = 'y';
		                break;
		            default :
		                key = 'n';
		                break;
		        }
	    		
	    	}
	    	catch(StringIndexOutOfBoundsException e){
	    		System.out.println("Please enter a valid input");
	    	};
	        
	    }
	    private static void getRandomJokes(String category, int number) throws InterruptedException, IOException, URISyntaxException {
	    	
	        var var1 = names.entrySet().iterator().next();
	        new JsonFeed("https://api.chucknorris.io/jokes/random", number);
	        results = JsonFeed.getRandomJokes(var1.getKey(), var1.getValue(), category);
	    	
	    }

	    private static void getCategories() throws InterruptedException, IOException, URISyntaxException {
	        new JsonFeed("https://api.chucknorris.io/jokes/categories", 0);
	        results = JsonFeed.getCategories();
	    }

	    private static void getNames() throws InterruptedException, IOException, URISyntaxException {
	        new JsonFeed("https://www.names.privserv.com/api/", 0);
	        Dto dto = JsonFeed.getnames();
	        Main.names.put(dto.getName(), dto.getSurname());
	    	
	    }
	    
	    private static void getMyOwnName(String fullname, String category) throws InterruptedException, IOException , URISyntaxException{
	    	try {
		    	String [] splitting = fullname.split(" ");
		    	String var1 = splitting[0];
		    	String var2 = splitting[1];
		        new JsonFeed("https://api.chucknorris.io/jokes/random", 1);
		        Main.names.put(var1, var2);
	    		
	    	}catch(IllegalArgumentException ex){
	    		ex.printStackTrace();
	    	}
	    	
	    }
}
