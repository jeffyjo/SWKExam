package _4_Collection_Stack_Queue_And_Map;

import java.util.*;

/**
 * Created by jeffjorgensen on 29/12/2016.
 */
public class RunStack {
    public static void main(String[] args) {
        int one = 1;
        int twelve = 12;

        //Stack is a class, queue is an interface
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new PriorityQueue<>();

        //stack methods
        stack.push(one);
        stack.push(twelve);

        System.out.println(stack);

        int a = stack.peek();
        System.out.println(a);

        stack.pop();
        System.out.println(stack);

        System.out.println("_______________");

        //Queue methods
        queue.add(one);
        queue.add(twelve);

        System.out.println(queue);

        int b = queue.peek();
        System.out.println(b);

        System.out.println(queue);

        int c = queue.poll();
        System.out.println(c);

        System.out.println(queue);

        System.out.println("___________________");

        //Map with grades
        Map<Integer, List<String>> map = new HashMap<>();
        List<String> listOf12 = new ArrayList<>();
        List<String> listOf2 = new ArrayList<>();

        listOf12.add("Jeff");
        listOf12.add("Casper");

        listOf2.add("Jeff");

        map.put(12, listOf12);
        map.put(2, listOf2);

        listOf2.remove("Jeff");
        listOf2.add("Jeffff");
        map.put(2, listOf2);

        System.out.println(map);

    }
}
