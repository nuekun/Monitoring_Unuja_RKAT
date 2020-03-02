package id.ac.unuja.monitoringunuja.Utils;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import id.ac.unuja.monitoringunuja.Fragments.AccFragment;
import id.ac.unuja.monitoringunuja.Menunggu.MenungguFragment;
import id.ac.unuja.monitoringunuja.Fragments.TolakFragment;

public class TabAdapter extends FragmentPagerAdapter {
    private Context context;
    public TabAdapter(@NonNull FragmentManager fm, Context context) {
        //noinspection deprecation
        super(fm);
        this.context = context;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MenungguFragment();
        }else if (position == 1) {
            return new AccFragment();
        } else return new TolakFragment();

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Menunggu";
        }else if (position == 1){
            return "ACC";
        }  return "Tolak";
    }



    @Override
    public int getCount() {
        return 3;
    }
}