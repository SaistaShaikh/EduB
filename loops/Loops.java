import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Loops{

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(20,30,40));
        Iterator itr = list.iterator();

        System.out.println("While Loop:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Advanced  For Loop:");
        for(int item: list){
            System.out.println(item);
        }
        System.out.println("For Loop:");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}