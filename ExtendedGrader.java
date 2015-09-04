/*
 *  Project: ExtendedGrader.java
 * Description: A program that reports letter grades (and other things)
 * Author: Jaehyung Lim
 * Date: August 31, 2015
 */

import java.util.Scanner; // gets user input

class ExtendedGrader {

  public static void main( String[] args) {
 
    Scanner s = new Scanner( System.in);
    int grade;
    int skip;
    
    System.out.println( "Do you want the Grader (1) or Strings (2)?" );
    skip = s.nextInt(); // get user choice
    
    if(skip == 1) {
    System.out.println( "Enter your grade percentage: " );
    grade= s.nextInt(); // input the user grade
    
    //Extended else-if to oupput the letter grade
    if( grade > 90) { // if greater than 90%
      System.out.println( "You got an A!" );
      
    } else if ( grade >= 80 ) { // if less than 90% but greater than 80%
      System.out.println( "You got a B~" );
      
    } else if ( grade >= 70) { // if less than 80% but greater than 70%
      System.out.println( "You got a C." );
    
    } else if ( grade >= 60) { // if less than 70% but greater than 60%   
      System.out.println( "You got a D..." );
      
    } else {
      System.out.println( "You got an F. Loser..." );
    }
    
    
    
    /* Challenge: Create an if-else that tells the user congrats!"
     * if their grade is greater than 100 (bonus points). OR
     * "You're a normal student." if under 100.
     */
    
    if ( grade > 100) {
      System.out.println( " Congrats! You got bonus points!" );
      
    } else {
      System.out.println( " You're a normal student." );
    }
    
    
    /*
     * Challenge: Using an if-else, tell the user whether
     * their grade is "positive" or "negative" or "zero".
     */
    
    if ( grade > 0 ) {
      System.out.println( "Positive." );
    } else if ( grade == 0 ) {
      System.out.println( " You got a zero." );
    } else {
      System.out.println( "Negative." );
    }
    
    
    System.out.println( "From: Bill Smith" );
    System.out.println( "Address: Dell Computer, Bldg 13\n" );
    System.out.println( "To: Jack Jones\n" );
    System.out.println( "Message: Help! I'm trapped inside a computer!" );
                     
  
    
    
    //showing new commits
    System.out.println( "Modifying this program for GitHub.com" );
    }
    
    else{
      System.out.println( "Welcome to the String program!~" );
      
      // Number 1
      String s1 = "The number of rabbits is ";
      int argh = 129;
      String report = s1 + argh;
      System.out.println( report );
      
      // Number 2
      String p = "Groovy Dude";
      System.out.println( p.toUpperCase() );
      
      // Number 3
      String g = "Computer Science is for NERDS!";
      System.out.println( g.toLowerCase() );
      
      // Number 4
      String c;
      String m = "The Gettysburg Address";
      c = m.substring(4);
      System.out.println(c);
      
      
     // Number 5
     String b = "Four score and seven years ago,";
     String c1 = b.substring(7,12);
     System.out.println(c1); 
     
     // Number 6
     int count1;
     String s2 = "Surface tension";
     count1 = s2. length();
     System.out.println( count1 );
     // Number 7
     String m1 = "Look here!";
       System.out.println( "\"" + m1 + "\" has " + m1.length() + " character.");
     
     // Number 11
     String pq = "Eddie Haskel";
     int hm = pq.length();
     String ed = pq.substring( hm-4 );
     System.out.println( ed);
     
     // Number 12
     String monster = "Herman Munster";
     System.out.println( monster.substring( 5,6 ) );
     
    }
    
    
  } // end main method
  
  
} // end class