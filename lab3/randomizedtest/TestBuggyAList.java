package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
  public static void main(String[] args) {
      testThreeAddThreeRemove();
  }
  public void testThreeAddThreeRemove(){
      AListNoResizing<Integer> a = new AListNoResizing<>();
      BuggyAList<Integer> b = new BuggyAList<>();
      for(int i = 0; i<3; i++){
          a.addLast(i);
          b.addLast(i);
      }
      while(a.size()!=0&&b.size()!=0){
          if(a.getLast()==b.getLast()){
              a.removeLast();
              b.removeLast();
          }
          else{
              System.out.println("wrong");
          }
      }

  }

}
