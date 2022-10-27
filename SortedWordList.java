/**
 * 
 * @author James Post 
 * This SortedWordList extends the WordList class and uses
 * the add function to add a new WordNode to the correct alphabetical
 * position in the WordList.
 *
 */
public class SortedWordList extends WordList {
   /**
    * A new WordNode is created, and compared to each existing node to find its
    * position, and then inserted into the list.
    * 
    * @param a The data for the new WordNode to be constructed/inserted.
    */
   public void add(String a) {
// WordNode objects to track the new node (added), previous node, and current node for insertion
      WordNode added = new WordNode(a);
      WordNode previous = first;
      WordNode current = first.next;
// if the WordList is empty, make the new node the first (and last) node (after the dummy node) 
      if (current == null) {
         first.next = added;
         last = first.next;
         // return to end the method
         return;
      }
      // while the current node is not empty, iterate through the list
      while (current != null) {
         // check if the new node's data is alphabetically less than the current node and
         // swap
         if (((added.data).compareToIgnoreCase(current.data)) < 0) {
            previous.next = added;
            added.next = current;
            // return to end the method
            return;

         }
         // iterate through the list
         previous = current;
         current = current.next;
      }
      // adding to end of the list
      previous.next = added;
      last = previous.next;
   } // add
} // SortedWordList