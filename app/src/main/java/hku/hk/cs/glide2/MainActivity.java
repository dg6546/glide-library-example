package hku.hk.cs.glide2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView1 = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView5 = findViewById(R.id.imageView5);
        ImageView imageView6 = findViewById(R.id.imageView6);
        ImageView imageView7 = findViewById(R.id.imageView7);
        ImageView imageView8 = findViewById(R.id.imageView8);
        ImageView imageView9 = findViewById(R.id.imageView9);
//Ex1 load image
//a. by URL
        Glide.with( this )
                .load("https://i0.wp.com/appsnipp.com/wp-content/uploads/2019/01/glide_library.png")
                .into(imageView1);
//b. by resource ID
        Glide.with( this )
                .load(R.mipmap. ic_launcher)
                .into(imageView2);
//Ex2 Resize image
        Glide.with( this )
                .load( "https://i0.wp.com/appsnipp.com/wp-content/uploads/2019/01/glide_library.png" )
                .override( 300 , 150 )
                .into(imageView5);
//Ex3 Error-handling
        Glide.with( this )
                .load( "abc" ) //the loaded data is intentionally wrong
                .error(R.drawable. ic_launcher_foreground)
                .into(imageView6);
//Ex4 Load gif by URL
        Glide.with( this )
                .asGif()
                .load("https://miro.medium.com/max/1313/1*TA_uzgvd_SGh0rxlKQ4d6Q.gif")
                .into(imageView7);
//Ex5 Image Crop
        Glide.with( this )
                .load( "https://i0.wp.com/appsnipp.com/wp-content/uploads/2019/01/glide_library.png" )
                .centerCrop()
                .into(imageView8);
//Ex6 Transformation
        Glide.with( this )
                .load( "https://i0.wp.com/appsnipp.com/wp-content/uploads/2019/01/glide_library.png" )
                .transform( new CenterInside(), new RoundedCorners(200))
                .into(imageView9);
    }
}