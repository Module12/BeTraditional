package mobiletesting.betraditional;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Discover extends AppCompatActivity {
        Button button10_sbm;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_discover);
            button10_sbm =(Button)findViewById(R.id.button17);
            button10_sbm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent("mobiletesting.betraditional.trendsetter");
                    startActivity(intent);

                }
            });
        }
    }
