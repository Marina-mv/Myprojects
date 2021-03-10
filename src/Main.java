import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] array = {1,4,6,7,10,9,9};
	MergeSort sorter = new MergeSort();
	sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
