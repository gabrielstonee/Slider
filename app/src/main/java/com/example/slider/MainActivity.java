package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
//        setButtonBackVisible(false);
//        setButtonNextVisible(false);
//        addSlide(new SimpleSlide.Builder()
//                .title("Titulo")
//                .description("descricao")
//                .image(R.drawable.um)
//                .background(android.R.color.holo_blue_dark)
//                .build()
//        );
//        addSlide(new SimpleSlide.Builder()
//                .title("Titulo")
//                .description("descricao")
//                .image(R.drawable.um)
//                .background(android.R.color.holo_orange_light)
//                .build()
//        );
        //agora utilizando fragment com sldes
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro)
                .build()
        );
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.holo_blue_dark)
                .fragment(R.layout.intro2)
                .build()
        );

    }
}