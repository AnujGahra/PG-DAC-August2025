package stack;

import java.util.Stack;

public class Launch {

    public static void main(String[] args) {

        // ✅ Non-Generic Stack (not recommended)
        Stack stack1 = new Stack(); 

        // ✅ Generic Stack – Recommended
        Stack<Integer> stack2 = new Stack<>();

        // ✅ Wildcard Stack – can reference any type but read-only
        Stack<?> stack3 = new Stack<Object>();

        // -------------------------------
        // Demonstrating ALL key methods
        // -------------------------------

        // 1️⃣  push(E item)  → adds element on top
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        System.out.println("After push: " + stack2); // [10, 20, 30]

        // 2️⃣  peek() → view top element without removal
        System.out.println("Top element (peek): " + stack2.peek()); // 30

        // 3️⃣  pop() → remove & return top element
        System.out.println("Popped element: " + stack2.pop()); // 30
        System.out.println("After pop: " + stack2); // [10, 20]

        // 4️⃣  search(Object o) → 1-based position from top (returns -1 if not found)
        System.out.println("Search 10: " + stack2.search(10)); // position

        // 5️⃣  empty() → check if stack is empty
        System.out.println("Is stack empty? " + stack2.empty());

        // 6️⃣  size() → number of elements
        System.out.println("Size of stack: " + stack2.size());

        // 7️⃣  contains(Object o) → from Vector class
        System.out.println("Contains 20? " + stack2.contains(20));

        // 8️⃣  get(int index) → from Vector, random access
        System.out.println("Element at index 0: " + stack2.get(0));

        // 9️⃣  set(int index, E element) → replace value
        stack2.set(0, 99);
        System.out.println("After set index 0 to 99: " + stack2);

        // 🔟  addAll(Collection<? extends E>)
        Stack<Integer> extra = new Stack<>();
        extra.push(40);
        extra.push(50);
        stack2.addAll(extra);
        System.out.println("After addAll: " + stack2);

        // 11️⃣  remove(Object o) / remove(int index)
        stack2.remove((Integer)20);
        System.out.println("After remove 20: " + stack2);

        // 12️⃣  clear() → remove all elements
        stack2.clear();
        System.out.println("After clear: " + stack2);

        // Extra: isEmpty() (same as empty but from Collection)
        System.out.println("Is empty (isEmpty): " + stack2.isEmpty());
    }
}
