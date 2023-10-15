import java.util.*;

public class ArrayShuffle{
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		Random rand = new Random();
		for (int i=0;i<a.length;i++){
			int ri = rand.nextInt(a.length);
			int temp = a[ri];
			a[ri] = a[i];
			a[i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}