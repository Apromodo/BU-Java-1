package lab8;

import java.util.Scanner;

public class Soru1 {
	
	public static void main(String[] args) {
		int arr[] = { 2, 1, 7, 9, 6, 2, 8, 0 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int m = 0; i < n; i++) {
                System.out.print(arr[m] + " ");
            }
        }
	}
}


