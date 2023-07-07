package in.nareshtech.batch19.tabnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 vp;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = findViewById(R.id.myviewpager);
        tabLayout = findViewById(R.id.tablayout);
        FragViewPagerAdapt fvpa = new FragViewPagerAdapt(this);
        vp.setAdapter(fvpa);

        new TabLayoutMediator(tabLayout, vp, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("RED"); break;
                    case 1:
                        tab.setText("GREEN"); break;
                    case 2:
                        tab.setText("BLUE"); break;
                }
            }
        }).attach();
    }

    //TODO 2: Add the screens that you want to swipe through.
    // TODO 3: Create a ViewPager adapter and implement the logic to swipe through the screens
    class FragViewPagerAdapt extends FragmentStateAdapter {

        public FragViewPagerAdapt(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0: return new RedFragment();
                case 1: return new GreenFragment();
                case 2: return new BlueFragment();
            }
            return null;
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }
}