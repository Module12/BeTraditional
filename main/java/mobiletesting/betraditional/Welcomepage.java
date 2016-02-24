package mobiletesting.betraditional;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcomepage extends AppCompatActivity {
    Button button_sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);
        button_sbm =(Button)findViewById(R.id.button);
        button_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("mobiletesting.betraditional.Homepage");
                startActivity(intent);
            }
        });
    }
}
