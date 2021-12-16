import java.util.Scanner;

/**
 * A program to carry on conversations with a human user.
 * This version:
 *
 *  Uses advanced search for keywords 
 *
 *  Will transform statements as well as react to keywords
 *
 * 
 *
 */
public class Magpie4
{
  
  


/**Gets default greeting
 */
  public String getGreeting()
  {
  return "Hello, let's talk.";
  }




/**gives a response to the user statement using a conditional to determine it
 */
  public String getResponse(String statement)
  {
  
//gives initial value to string response
  String response = "";

//Asks user to say something if typed nothing
    if (statement.length() == 0)
    {
    response = "Say something, please.";
    }
  
//Responses which are strings based on keywords
    else if (findKeyword(statement, "no") >= 0)
    {
      response = "Why so negative?";
    }
    else if (findKeyword(statement, "mother") >= 0
    || findKeyword(statement, "father") >= 0
    || findKeyword(statement, "sister") >= 0
    || findKeyword(statement, "brother") >= 0)
    {
      response = "Tell me more about your family.";
    }
// Responses which require transformations
    else if (findKeyword(statement, "I want to", 0) >= 0)
    {
      response = transformIWantToStatement(statement);
    }
    else if (findKeyword(statement, "I want", 0) >= 0)
    {
      response = transformIWantStatement(statement);
    }
    else
    {
// Look for a two word (you <something> me) or (I <something> you)
// pattern, otherwise returns random response
    
      int psnOfYou = findKeyword(statement, "you", 0);
      int psnOfI = findKeyword(statement, "I", 0);

      if (psnOfYou >= 0&& findKeyword(statement, "me", psnOfYou) >= 0)
      {
        response = transformYouMeStatement(statement);
      }
      else if (psnOfI>= 0 && findKeyword(statement, "you", psnOfI) >= 0)
      {
        response= transformISomethingYouStatement(statement);
      }
      else
      {
        response = getRandomResponse();
      }
    }
//returns the response
  return response;
  }




/**
 * Take a statement with "I want to <something>." and transform it into 
 * "What would it mean to <something>?"
 */
  private String transformIWantToStatement(String statement)
  {

//  Remove the final period, if there is one
    statement = statement.trim();
    String lastChar = statement.substring(statement.length() - 1);
    if (lastChar.equals("."))
    {
      statement = statement.substring(0, statement.length() - 1);
    }
//finds the part of statement that is after keyword(s) and adds it to the string that is returned
    int psn = findKeyword (statement, "I want to", 0);
    String restOfStatement = statement.substring(psn + 9).trim();
    return "What would it mean to " + restOfStatement + "?";
  }



  /**
   * Take a statement with "I want <something>." and transform it into 
   * "Would you really be happy if you had <something>?"
   */
  private String transformIWantStatement(String statement)
  {
//  Remove the final period, if there is one
    statement = statement.trim();
    String lastChar = statement.substring(statement.length() - 1);
    if (lastChar.equals("."))
    {
      statement = statement.substring(0, statement.length() - 1);
    }
//finds the part of statement that is after keyword(s) and adds it to the string that is returned
    int psn = findKeyword (statement, "I want", 0);
    String restOfStatement = statement.substring(psn + 7).trim();
    return "Would you really be happy if you had " + restOfStatement + "?";
  }



  /**
   * Take a statement with "I <something> you." and transform it into 
   * "Why do you <something> me?"
   */
  private String transformISomethingYouStatement(String statement)
  {
//  Remove the final period, if there is one
    statement = statement.trim();
    String lastChar = statement.substring(statement.length() - 1);
    if (lastChar.equals("."))
    {
      statement = statement.substring(0, statement.length() - 1);
    }
//finds the part of statement that is between keyword(s) and adds it to the string that is returned
    int psnOfI = findKeyword (statement, "I", 0);
    int psnOfYou = findKeyword(statement, "you", 0);
    String restOfStatement = statement.substring(psnOfI + 2, psnOfYou).trim();
    return "Why do you " + restOfStatement + " me?";
  }



  
/**
 * Take a statement with "you <something> me" and transform it into 
 * "What makes you think that I <something> you?"
 */
  private String transformYouMeStatement(String statement)
  {
//  Remove the final period, if there is one
    statement = statement.trim();
    String lastChar = statement.substring(statement.length() - 1);
    if (lastChar.equals("."))
    {
      statement = statement.substring(0, statement.length() - 1);
    }
//finds the part of statement that is between keyword(s) and adds it to the string that is returned
    int psnOfYou = findKeyword (statement, "you", 0);
    int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
    String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
    return "What makes you think that I " + restOfStatement + " you?";
  }




/**Searches for a word or words in a phrase, will check it's not
 *  the substring of a longer string, and returns the index of the first occurence of that word or words
 */
  private int findKeyword(String statement, String goal, int startPos)
  {
    String phrase = statement.trim();
//  The only change to incorporate the startPos is in the line below
    int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
//  Refinement--make sure the goal isn't part of a word 
    while (psn >= 0) 
    {
//  Find the string of length 1 before and after the word
      String before = " ", after = " "; 
      if (psn > 0)
      {
        before = phrase.substring (psn - 1, psn).toLowerCase();
      }
      if (psn + goal.length() < phrase.length())
      {
        after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
      }
//  If before and after aren't letters, we've found the word
      if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 
      0))  //  before is not a letter
      && ((after.compareTo ("a") < 0 ) || 
      (after.compareTo("z") > 0)))
      {
        return psn;
      }
/*  The last position didn't work, so let's find the next, if 
there is one.*/
      psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
    }
    return -1;
  }




/**
 * If findKeyword method is called without a third parameter, the startPos, will call the method with 
 * a startPos of 0.
 *
 */
  private int findKeyword(String statement, String goal)
  {
    return findKeyword (statement, goal, 0);
  }




/**
 * Pick a default non- commital response to use if nothing else fits.
 */
  private String getRandomResponse()
  {
    final int NUMBER_OF_RESPONSES = 4;
    double r = Math.random();
    int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
    String response = "";
    if (whichResponse == 0)
    {
      response = "Interesting, tell me more.";
    }
    else if (whichResponse == 1)
    {
      response = "Hmmm.";
    }
    else if (whichResponse == 2)
    {
      response = "Do you really think so?";
    }
    else if (whichResponse == 3)
    {
      response = "You don't say.";
    }
    return response;
  }

}