package ir.androidlife.separotrnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        textView.setText(convertText("13000000000"));

    }

    private String convertText(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        for(int i = stringBuilder.length() - 3; i > 0; i -=3) {
            stringBuilder.insert(i,",");
        }
        return stringBuilder.toString();
    }
}
