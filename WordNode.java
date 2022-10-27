/**
 * 
 * @author James Post 
 * This WordNode class is used to instantiate nodes for the
 * WordList class. It uses one String for data and one WordNode object
 * to point to the next node.
 *
 */
public class WordNode {
   String data;
   WordNode next;

   /**
    * Constructor to create a WordNode with null data and null next
    */
   public WordNode() {
      data = null;
      next = null;
   } // constructor

   /**
    * Single argument constructor to create a WordNode with string data and null
    * next
    * 
    * @param d The data value for the new WordNode
    */
   public WordNode(String d) {
      data = d;
      next = null;
   } // single argument constructor
} // WordNode
