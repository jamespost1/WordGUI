/**
 * 
 * @author James Post 
 * This UnsortedWordList extends the WordList class and uses
 * the append function to add a new WordNode to the WordList.
 * 
 */
public class UnsortedWordList extends WordList {
   /**
    * A new WordNode is created and added to the end of the UnsortedWordList.
    * 
    * @param s The data for the new WordNode to be constructed and appended
    */
   public void append(String s) {
      // uses single argument WordNode constructor
      WordNode n = new WordNode(s);
      last.next = n;
      last = n;
   } // append
} // UnsortedWordList
