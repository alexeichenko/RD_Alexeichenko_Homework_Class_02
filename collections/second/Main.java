package collections.second;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        Random random = new Random();

        int iteration = 0;
        while (iteration < 1000) {
            int randomNumber = random.nextInt(50) + 1;
            hashSet.add(randomNumber);
            linkedHashSet.add(randomNumber);
            treeSet.add(randomNumber);
            iteration++;
        }
        System.out.println("HashSet numbers: " + hashSet + "\nLinkedHashSet numbers: " + linkedHashSet + "\nTreeSet numbers: " + treeSet);
    }
}
