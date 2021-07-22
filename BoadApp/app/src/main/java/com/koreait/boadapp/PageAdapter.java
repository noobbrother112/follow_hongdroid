package com.koreait.boadapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.koreait.boadapp.pages.ContentFragment;
import com.koreait.boadapp.pages.ListFragment;
import com.koreait.boadapp.pages.WriteFragment;

import org.jetbrains.annotations.NotNull;

public class PageAdapter extends FragmentStateAdapter {

    Fragment[] pages=new Fragment[3];

    public PageAdapter(@NonNull @NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        pages[0]=new ListFragment();
        pages[1]=new WriteFragment();
        pages[2]=new ContentFragment();

    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        return pages[position];
    }

    @Override
    public int getItemCount() {
        return pages.length;
    }
}
