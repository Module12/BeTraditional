package mobiletesting.betraditional;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TheBestIn extends AppCompatActivity {

    Button button12_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_best_in);
        button12_sbm = (Button) findViewById(R.id.button19);
        button12_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "We will send you the catalogue", Toast.LENGTH_LONG).show();
            }
        });

    }
}





