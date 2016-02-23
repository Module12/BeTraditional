package mobiletesting.betraditional;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Newarrivals extends AppCompatActivity {

    Button button9_sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newarrivals);
        button9_sbm =(Button)findViewById(R.id.button13);
        button9_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("mobiletesting.betraditional.Homepage");
                startActivity(intent);

            }
        });
    }
}
