package day_task;
import java.util.Scanner;

public class Person {
    private int age;

        public Person(int initialAge) {
            if (initialAge < 0) {
                age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            } else {
                age = initialAge;
            }
        }
        public void yearPasses() {
            age++;
        }

        public void amIOld() {
            if (age < 13) {
                System.out.println("You are young.");
            } else if (age >= 13 && age < 18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt(); // size
            for (int i = 0; i < t; i++) {
                int age = scanner.nextInt();
                Person person = new Person(age);
                person.amIOld();
                for (int j = 0; j < 3; j++) {
                    person.yearPasses();
                }
                person.amIOld();
                System.out.println();
            }
            scanner.close();
        }
    }




    //import java.util.*;
//
//class Printer <T> {
//
//    /**
//    *    Method Name: printArray
//    *    Print each element of the generic array on a new line. Do not return anything.
//    *    @param A generic array
//    **/
//    public void printArray(T[] array) {
//        for (T element : array) {
//            System.out.println(element);
//        }
//    }
//}
//
//public class Generics {
//
//    public static void main(String args[]){
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        Integer[] intArray = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            intArray[i] = scanner.nextInt();
//        }
//
//        n = scanner.nextInt();
//        String[] stringArray = new String[n];
//        for (int i = 0; i < n; i++) {
//            stringArray[i] = scanner.next();
//        }
//
//        Printer<Integer> intPrinter = new Printer<Integer>();
//        Printer<String> stringPrinter = new Printer<String>();
//        intPrinter.printArray( intArray  );
//        stringPrinter.printArray( stringArray );
//        if(Printer.class.getDeclaredMethods().length > 1){
//            System.out.println("The Printer class should only have 1 method named printArray.");
//        }
//    }
//}


//import java.util.*;
//import java.io.*;
//class Node{
//    Node left,right;
//    int data;
//    Node(int data){
//        this.data=data;
//        left=right=null;
//    }
//}
//class Solution{
//
//	public static int getHeight(Node root){
//      if (root == null)
//            return -1;
//        int leftHeight = getHeight(root.left);
//        int rightHeight = getHeight(root.right);
//        return Math.max(leftHeight, rightHeight) + 1;
//    }
//
//    public static Node insert(Node root,int data){
//        if(root==null){
//            return new Node(data);
//        }
//        else{
//            Node cur;
//            if(data<=root.data){
//                cur=insert(root.left,data);
//                root.left=cur;
//            }
//            else{
//                cur=insert(root.right,data);
//                root.right=cur;
//            }
//            return root;
//        }
//    }
//	 public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int T=sc.nextInt();
//        Node root=null;
//        while(T-->0){
//            int data=sc.nextInt();
//            root=insert(root,data);
//        }
//        int height=getHeight(root);
//        System.out.println(height);
//    }
//}





//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//  public   static boolean isPrime(int n) {
//        if (n <= 1)
//            return false;
//        if (n <= 3)
//            return true;
//        if (n % 2 == 0 || n % 3 == 0)
//            return false;
//        for (int i = 5; i * i <= n; i += 6) {
//            if (n % i == 0 || n % (i + 2) == 0)
//                return false;
//        }
//        return true;
//    }
//
//
//
//    public static void main(String[] args) {
//       Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        for (int i = 0; i < t; i++) {
//            int n = scanner.nextInt();
//            if (isPrime(n)) {
//                System.out.println("Prime");
//            } else {
//                System.out.println("Not prime");
//            }
//        }
//        scanner.close();
//    }
//}



//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//
//    public static int calculateFine(int returnDay, int returnMonth, int returnYear, int dueDay, int dueMonth, int dueYear) {
//        if (returnYear < dueYear || (returnYear == dueYear && returnMonth < dueMonth) || (returnYear == dueYear && returnMonth == dueMonth && returnDay <= dueDay)) {
//            return 0;
//        } else if (returnYear == dueYear && returnMonth == dueMonth) {
//            return 15 * (returnDay - dueDay);
//        } else if (returnYear == dueYear) {
//            return 500 * (returnMonth - dueMonth);
//        } else {
//            return 10000;
//        }
//    }
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//
//         Scanner scanner = new Scanner(System.in);
//        int returnDay = scanner.nextInt();
//        int returnMonth = scanner.nextInt();
//        int returnYear = scanner.nextInt();
//        int dueDay = scanner.nextInt();
//        int dueMonth = scanner.nextInt();
//        int dueYear = scanner.nextInt();
//        int fine = calculateFine(returnDay, returnMonth, returnYear, dueDay, dueMonth, dueYear);
//        System.out.println(fine);
//        scanner.close();
//    }
//}




//import java.io.*;
//import java.util.*;
//
//class Node {
//	int data;
//	Node next;
//	Node(int d) {
//        data = d;
//        next = null;
//    }
//}
//
//class Solution {
//
//    public static  Node insert(Node head,int data) {
//         if (head == null) {
//            return new Node(data);
//        } else {
//            Node current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = new Node(data);
//            return head;
//        }
//    }
//
//	public static void display(Node head) {
//        Node start = head;
//        while(start != null) {
//            System.out.print(start.data + " ");
//            start = start.next;
//        }
//    }
//
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        Node head = null;
//        int N = sc.nextInt();
//
//        while(N-- > 0) {
//            int ele = sc.nextInt();
//            head = insert(head,ele);
//        }
//        display(head);
//        sc.close();
//    }
//}















//public static void checkMagazine(List<String> magazine, List<String> note) {
//     Map<String, Integer> wordFreq = new HashMap<>();
//        for (String word : magazine) {
//            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
//        }
//        for (String word : note) {
//            if (!wordFreq.containsKey(word) || wordFreq.get(word) == 0) {
//                System.out.println("No");
//                return;
//            } else {
//                wordFreq.put(word, wordFreq.get(word) - 1);
//            }
//        }
//
//        System.out.println("Yes");
//
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int m = Integer.parseInt(firstMultipleInput[0]);
//
//        int n = Integer.parseInt(firstMultipleInput[1]);
//
//        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .collect(toList());
//
//        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .collect(toList());
//
//        Result.checkMagazine(magazine, note);
//
//        bufferedReader.close();
//    }








///import java.io.*;
//import java.util.*;
//
//public class Solution {
//     private LinkedList<Character> stack;
//    private LinkedList<Character> queue;
//
//    public Solution() {
//        stack = new LinkedList<>();
//        queue = new LinkedList<>();
//    }
//
//    public void pushCharacter(char c) {
//        stack.push(c);
//    }
//
//    public void enqueueCharacter(char c) {
//        queue.add(c);
//    }
//    public char popCharacter() {
//        return stack.pop();
//    }
//
//    public char dequeueCharacter() {
//        return queue.remove();
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        scan.close();
//
//        // Convert input String to an array of characters:
//        char[] s = input.toCharArray();
//
//        // Create a Solution object:
//        Solution p = new Solution();
//
//        // Enqueue/Push all chars to their respective data structures:
//        for (char c : s) {
//            p.pushCharacter(c);
//            p.enqueueCharacter(c);
//        }
//
//        // Pop/Dequeue the chars at the head of both data structures and compare them:
//        boolean isPalindrome = true;
//        for (int i = 0; i < s.length/2; i++) {
//            if (p.popCharacter() != p.dequeueCharacter()) {
//                isPalindrome = false;
//                break;
//            }
//        }
//
//        //Finally, print whether string s is palindrome or not.
//        System.out.println( "The word, " + input + ", is "
//                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
//    }
//}