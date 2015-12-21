package com.daseyffert.nerdlauncher;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Daniel on 12/21/2015.
 */
public class NerdLauncherFragment extends Fragment {

    private RecyclerView mRecyclerView;

    public static Fragment newInstance() {
        return new NerdLauncherFragment();
    }

    /**
     *Create the View for the Activity
     * @return the view that will be on the Fragment hosted by the Activity
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle onSavedInstanceState) {
        //inflate the view
        View view = inflater.inflate(R.layout.fragment_nerd_launcher, container, false);
        //Wire up all the widgets in the fragment view
        mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_nerd_launcher_recycler_view);
        //Configure the layout manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

}
