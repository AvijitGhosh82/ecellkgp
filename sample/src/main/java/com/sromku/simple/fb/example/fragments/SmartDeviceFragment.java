package com.sromku.simple.fb.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.sromku.simple.fb.example.R;

public class SmartDeviceFragment extends BaseFragment {

    private final static String EXAMPLE = "Smart Device - Connect";

    private TextView mConnectResult;
    private TextView mAuthResult;
    private Button mConnectButton;
    private Button mAuthButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(EXAMPLE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_smart_device, container, false);
        mConnectResult = (TextView) view.findViewById(R.id.result_connect);
        mConnectButton = (Button) view.findViewById(R.id.button_connect);
        mAuthResult = (TextView) view.findViewById(R.id.result_poll);
        mAuthButton = (Button) view.findViewById(R.id.button_poll);


        return view;
    }
}
