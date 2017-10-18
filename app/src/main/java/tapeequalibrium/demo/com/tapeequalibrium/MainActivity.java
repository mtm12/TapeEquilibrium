package tapeequalibrium.demo.com.tapeequalibrium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] intArray = new int[]{3, 1, 2, 4};
        int n = 4;
        int[] sumArray = new int[n-1];
        int part1 = 0;
        int part2 = 0;
        int solution;

        for(int i=0; i<intArray.length-1; i++){
            part2=0;
            for(int j=i+1; j<intArray.length; j++){
                part2 = part2 + intArray[j];
            }
            //Log.d("tape1", String.valueOf(part2));
            part1=0;
            for(int k=0; k<i+1; k++){
                part1 = part1 + intArray[k];
            }
            //Log.d("tape1", String.valueOf(part1));
            sumArray[i] = Math.abs(part1-part2);
            Log.d("tape1", String.valueOf(sumArray[i]));
        }
        Arrays.sort(sumArray);
        solution = sumArray[0];
        Log.d("tape1", "Solution: " + String.valueOf(solution));
    }
}
