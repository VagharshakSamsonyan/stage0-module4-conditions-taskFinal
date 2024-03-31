package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public boolean swap(int first, int second) {

        System.out.println(second);

        // Perform the swap using bitwise XOR
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println(second);

        return first != second; // Return true if the values were different and swap was performed
    }
}
