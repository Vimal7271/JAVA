import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(array));

        int rotation = 2; 
        rotateLeft(array, rotation);
        System.out.println("Array after rotating left by " + rotation + " positions: " + Arrays.toString(array));

        rotateRight(array, rotation);
        System.out.println("Array after rotating right by " + rotation + " positions: " + Arrays.toString(array));
    }

    public static void rotateLeft(int[] array, int positions) {
        int length = array.length;
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[(i + length - positions) % length] = array[i];
        }
        System.arraycopy(temp, 0, array, 0, length);
    }

    public static void rotateRight(int[] array, int positions) {
        int length = array.length;
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[(i + positions) % length] = array[i];
        }
        System.arraycopy(temp, 0, array, 0, length);
    }
}