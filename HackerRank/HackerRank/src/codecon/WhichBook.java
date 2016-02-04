package codecon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
/*
 * You are trying to figure out what books to read. General recommendation systems don’t always get it right so you decide to give something else a try. Whenever a book is recommended to you, you will see if anyone in your extended social network has liked that book. If they did, you will read it. If not, you won’t bother. You are assuming everyone is using a system such as GoodReads so you can easily get the list of books that people like, as well as your friend graph off of Facebook.

You will need to write a program that given a social network, user book lists, a target user and the degrees of separation to check, will output how many books that user should read that they have not already read.

For example, given this social network:

Alice - Bob
Bob - Carol
Carol - Don
And this list of books:

Alice - The Hobbit, Lord of the Flies
Bob - Life of Pi, A Tale of Two Cities, Lord of the Flies
Carol - Anna Karenina, Solaris, 2001: A Space Odyssey
Don - Plato’s Republic, The Twelve Caesars
Asking how many books Alice should read with a degree of separation set to 1, the answer is 2, since Alice is connected to Bob, and she has already Lord of the Flies.

Asking how many books Alice should read with a degree of separation set to 2, is 5, (Life of Pi, A Tale of Two Cities, Anna Karenina, Solaris, 2001: A Space Odyssey), and with a degree of separation of 3 is 7 (Life of Pi, A Tale of Two Cities, Anna Karenina, Solaris, 2001: A Space Odyssey,Plato’s Republic, The Twelve Caesars).


Input Specifications

Your program will take from STDIN

The name of person to run comparison for.
A number D (0 ≤ N ≤ 10000) representing the degrees of separation.
A number N representing the number of social network links
A number M representing the number of users with a book list
N lines each representing a social network links. Each line will be of the format Name1|Name2 representing a link between Name1 and Name2. Names will be unique, can contain only printable ascii characters excluding '|', are case sensitive and will not exceed 100 characters.
M lines each representing a user's book list. Each line will be of the format Name|book1|book2…. Each book name will be in printable ascii excluding '|', case sensitive, and will not exceed 100 characters.

Output Specifications

Based on the input, print out the number of books the person should read. Print 0 if there are no books to be read.


Sample Input/Output

INPUT
Alice 2 3 4 Alice|Bob Bob|Carol Carol|Don Alice|The Hobbit|Lord of the Flies Bob|Life of Pi|A Tale of Two Cities|Lord of the Flies Carol|Anna Karenina|Solaris|2001: A Space Odyssey Don|Plato’s Republic|The Twelve Caesars 
OUTPUT
5
EXPLANATION
Alice knows Bob and has not read 2 of the 3 books on his list.
Bob knows Carol and Alice has not read any of the 3 books on her list.
2+3 = 5
 */


public class WhichBook {
	public static void main(String[] args)
    {

       Scanner in = new Scanner(System.in);
       String readerName =  in.next(); //get the reader name
       int d = in.nextInt(); //get the degree
       int n = in.nextInt(); //get social links
       int m = in.nextInt(); //get number of users
       HashSet<String> friendList = new HashSet<String>();
       friendList.add(readerName);
       while(n-- > 0) {
    	   HashSet<String> newSet = new HashSet();
    	   String names = in.next();
    	   StringTokenizer  st = new StringTokenizer(names,"|");
//    	   System.out.println(st.nextToken() + " : " + st.nextToken());
    	   while(st.hasMoreTokens()) {
    		   if(!newSet.contains(st.nextToken()) ) {	//add the names to nameSet
    			   newSet.add(st.nextToken());
    			   d--;
    		   } 
    	   }
    	   Iterator<String> it =  friendList.iterator();
    	   while(it.hasNext()) {
    		   if(newSet.contains(it.next()) && d > 0) {	//adds it to the friend list
    			   friendList.addAll(newSet);
    			   d--;
    		   }
    	   }
       }
       HashMap<String,HashSet<String>> hmBooksReaders = new HashMap<String,HashSet<String>>(); 
       in.nextLine();
       while(m-- > 0) {
    	   
    	   
    	   String names = in.nextLine();
    	   StringTokenizer  st = new StringTokenizer(names,"|");
    	   //first token is name
    	   String name = st.nextToken();
    	   while(st.hasMoreTokens()) {
    		   String book = st.nextToken();
    		   HashSet<String> readers;
    		   if(!hmBooksReaders.containsKey(book)) {
    			   hmBooksReaders.put(book, new HashSet<String>());
    		   }
    		   readers = hmBooksReaders.get(book);
    		   readers.add(name); //add reader to corresponding book
    		   hmBooksReaders.put(book, readers);
    	   }
       }
       Set books = hmBooksReaders.keySet();
       Iterator<String> it = books.iterator();
       int count=0;
       while(it.hasNext()) {
    	   HashSet readers = hmBooksReaders.get(it.next());
    	   if(!readers.contains(readerName)) {
    		   Iterator<String> itFriend = friendList.iterator();
    		   Boolean check = true;
    		   if(itFriend.hasNext() && check) {
    			   if(readers.contains(itFriend.next())) {
    				   count++;
    				   check = false;
    			   }
    		   }
    	   }
       }
       //print the result
       System.out.print(count);
       
//       while(in.hasNextLine()) 
//       {
//           System.out.println(in.nextLine());
//       }
       in.close();
    }
}
