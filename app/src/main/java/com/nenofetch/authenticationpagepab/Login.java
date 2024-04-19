package com.nenofetch.authenticationpagepab;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Fragment {

    private EditText usernameText, passwordText;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.login, container, false);

        usernameText = view.findViewById(R.id.username_text);
        passwordText = view.findViewById(R.id.password_text);

        Button loginButton = view.findViewById(R.id.login_action);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                successActivity();
            }
        });

        return view;
    }


    public void successActivity() {
        Intent intent = new Intent(getActivity(), LoginBerhasil.class);
        intent.putExtra("username", usernameText.getText().toString());
        intent.putExtra("password", passwordText.getText().toString());
        startActivity(intent);
    }
}