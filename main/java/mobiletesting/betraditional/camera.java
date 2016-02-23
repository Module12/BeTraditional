package mobiletesting.betraditional;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.File;


public class camera extends AppCompatActivity {
        ImageButton image_button;
        ImageView image_view;
        static final int CAMERA_REQUEST = 1;
        int n = 1000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_camera);
            image_button= (ImageButton)findViewById(R.id.imageButton);
            image_view= (ImageView)findViewById(R.id.imageView8);
            image_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    File file = getFile();
                    intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
                    startActivityForResult(intent, CAMERA_REQUEST);
                }
            });

        }
        private File getFile()
        {
            File folder = new File("sdcard/3D_TRY");
            if (!folder.exists())
            {
                folder.mkdir();
            }

            File imagefile = new File(folder,"image.jpg");
            return imagefile;
        }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            String path = "sdcard/3D_TRY/image.jpg";
            image_view.setImageDrawable(Drawable.createFromPath(path));
        }
    }

