package nq.vu.a20170827_final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Chan vay", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Chan vay2222", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Chan vay2222222", Toast.LENGTH_SHORT).show();
    }
}
