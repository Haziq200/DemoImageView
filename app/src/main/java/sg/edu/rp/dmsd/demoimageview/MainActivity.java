package sg.edu.rp.dmsd.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivday2;
    ImageView ivday3;
    ImageView ivday4;
    ImageView ivday5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        ivday2 = findViewById(R.id.imageView2);
        ivday2.setImageResource(R.drawable.day2);

        ivday3 = findViewById(R.id.imageView3);
        ivday3.setImageResource(R.drawable.day3);

        ivday4 = findViewById(R.id.imageView4);
        ivday4.setImageResource(R.drawable.day4);

        ivday5 = findViewById(R.id.imageView5);
        ivday5.setImageResource(R.drawable.day5);
    }
}
