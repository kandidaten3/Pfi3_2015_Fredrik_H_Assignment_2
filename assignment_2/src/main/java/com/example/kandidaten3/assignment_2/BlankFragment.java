package com.example.kandidaten3.assignment_2;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements View.OnClickListener {


    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        Button mButton = (Button) v.findViewById(R.id.ok_button);
        mButton.setOnClickListener(this);
        return v;
    }

    public void onClick(View v){
        getFragmentManager().beginTransaction().replace(R.id.container, new StartFragment()).commit();
    }


}
