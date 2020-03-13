package com.example.RgPg.MainFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.RgPg.R;

public class QuestFragment extends Fragment {

    private QuestViewModel mViewModel;

    public static QuestFragment newInstance() {
        return new QuestFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.quest_fragment, container, false);
    }


}
