package nyc.c4q.helenchan.binary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] anArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        binarySearch(anArray, 20);
    }

    public int binarySearch(int[] array, int target) {
        int guess;
        int min = 0;
        int max = array.length - 1;

        do {
            guess = (max + min) / 2;
            if (max < min) {
                return -1;
            }

            if (array[guess] == target) {
                return guess;

            }
            if (array[guess] < target) {
                min = guess + 1;

            }
            else {
                max = guess - 1;

            }

        }
        while (guess != target);
        return guess;
    }
}