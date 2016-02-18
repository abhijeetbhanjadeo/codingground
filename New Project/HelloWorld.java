import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(0,1,2));
        int idx = 0;
        ImmutableClass iC = new ImmutableClass(arrlist);
        System.out.println("IC::"+iC.getPanAtIndex(idx));
        int test = iC.getPanAtIndex(idx);
        test++;
        System.out.println("IC::"+iC.getPanAtIndex(idx)+" , value of test::"+test);
        List<Integer> templist = iC.getPan();
        templist.set(idx,5);
        //test1 = 5;
        System.out.println("IC::"+iC.getPanAtIndex(idx));
        
     }
}
