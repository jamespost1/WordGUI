/**
 * 
 * @author James Post 
 * This WordList class is used to instantiate a LinkedList
 * that works with WordNodes. It uses two WordNode objects first and
 * last.
 *
 */
public class WordList {
   WordNode first;
   WordNode last;

   /**
    * uses null WordNode constructor to make dummy node
    */
   public WordList() {
      WordNode ln = new WordNode();
      first = ln;
      last = ln;
   } // constructor
} // WordList
