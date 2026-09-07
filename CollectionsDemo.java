/**
 * CptS 233 Homework #1 - Collections Demo
 * Demonstrates basic usage of List, Stack, and Queue from Java Collections Framework
 * 
 * @Name: Anisha Kasozi 
 * @Date: September 7, 2026
 */
import java.util.*;

public class CollectionsDemo {
    
    /**
     * Demonstrates List operations using ArrayList
     * Creates list, adds/removes elements, prints results
     */
    public static void demonstrateList() {
        System.out.println("=== LIST DEMONSTRATION (ArrayList) ===");
        
        // 1. Create collection with at least five strings
        List<String> list = new ArrayList<>(Arrays.asList(
            "Apple", "Banana", "Cherry", "Date", "Elderberry"
        ));
        System.out.println("Initial list: " + list);
        
        // 2. Add additional element
        list.add("Fig");
        System.out.println("After adding 'Fig': " + list);
        
        // 3. Remove an element
        list.remove("Cherry");
        System.out.println("After removing 'Cherry': " + list);
        
        // 4. Print elements
        System.out.println("Final list elements:");
        for (String fruit : list) {
            System.out.println("  - " + fruit);
        }
        System.out.println();
    }
    
    /**
     * Demonstrates Stack operations (LIFO)
     * Creates stack, pushes/pops elements, prints results
     */
    public static void demonstrateStack() {
        System.out.println("=== STACK DEMONSTRATION (LIFO) ===");
        
        // 1. Create collection with at least five strings
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        stack.push("Fifth");
        System.out.println("Initial stack: " + stack);
        
        // 2. Add additional element
        stack.push("Sixth");
        System.out.println("After pushing 'Sixth': " + stack);
        
        // 3. Remove an element (pop from top)
        String popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("After popping: " + stack);
        
        // 4. Print elements
        System.out.println("Final stack elements (top to bottom):");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println("  - " + stack.get(i));
        }
        System.out.println();
    }
    
    /**
     * Demonstrates Queue operations using LinkedList (FIFO)
     * Creates queue, adds/removes elements, prints results
     */
    public static void demonstrateQueue() {
        System.out.println("=== QUEUE DEMONSTRATION (FIFO) ===");
        
        // 1. Create collection with at least five strings
        Queue<String> queue = new LinkedList<>(Arrays.asList(
            "Task1", "Task2", "Task3", "Task4", "Task5"
        ));
        System.out.println("Initial queue: " + queue);
        
        // 2. Add additional element
        queue.offer("Task6");
        System.out.println("After offering 'Task6': " + queue);
        
        // 3. Remove an element (from front)
        String removed = queue.poll();
        System.out.println("Removed element: " + removed);
        System.out.println("After removal: " + queue);
        
        // 4. Print elements
        System.out.println("Final queue elements (front to back):");
        for (String task : queue) {
            System.out.println("  - " + task);
        }
        System.out.println();
    }
    
    /**
     * Main method - runs all demonstrations
     */
    public static void main(String[] args) {
        System.out.println("COLLECTIONS DEMO PROGRAM");
        System.out.println("========================\n");
        
        demonstrateList();
        demonstrateStack();
        demonstrateQueue();
        
        System.out.println("Program completed successfully!");
    }
}