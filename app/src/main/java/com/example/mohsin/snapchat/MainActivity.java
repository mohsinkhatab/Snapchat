package com.example.mohsin.snapchat;

        import android.support.v4.content.ContextCompat;
        import android.support.v4.view.ViewPager;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

        import com.example.mohsin.snapchat.Adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View background=(View)findViewById(R.id.am_view);
        ViewPager vp=(ViewPager)findViewById(R.id.am_viewpager);
        final int BlueColore= ContextCompat.getColor(this,R.color.Light_Blue);
        final int PurpleColor=ContextCompat.getColor(this,R.color.purple);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
if (position==0){
    background.setBackgroundColor(BlueColore);
    background.setAlpha(1-positionOffset);
}else if (position==1){
    background.setBackgroundColor(PurpleColor);
    background.setAlpha(positionOffset);
}
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}
