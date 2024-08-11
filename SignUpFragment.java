package com.example.geothermalversi20;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class SignUpFragment extends Fragment {

    Button signup;
    EditText username, email,confirmpass, pass, forgetpass;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup)  inflater.inflate(R.layout.signup_tab_fragment, container, false);

        username = root.findViewById(R.id.usermane);
        email = root.findViewById(R.id.email);
        pass = root.findViewById(R.id.pass);
        confirmpass = root.findViewById(R.id.confirmpass);
        signup = root.findViewById(R.id.signupbutton);

        username.setTranslationY(800);
        email.setTranslationY(800);
        pass.setTranslationY(800);
        confirmpass.setTranslationY(800);
        signup.setTranslationY(800);

        email.setAlpha(v);
        email.setAlpha(v);
        pass.setAlpha(v);
        confirmpass.setAlpha(v);
        signup.setAlpha(v);

        username.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        pass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        confirmpass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();
        signup.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(900).start();

        return root;

    }

}
