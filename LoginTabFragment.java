package com.example.geothermalversi20;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {

    Button login, guest;
    EditText email,forgotpass, pass, forgetpass;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup)  inflater.inflate(R.layout.login_tab_fragment, container, false);


        email = root.findViewById(R.id.email);
        pass = root.findViewById(R.id.pass);
        forgotpass = root.findViewById(R.id.forgotpass);
        login = root.findViewById(R.id.loginbutton);
        guest = root.findViewById(R.id.guestbutton);

        email.setTranslationY(800);
        pass.setTranslationY(800);
        forgotpass.setTranslationY(800);
        login.setTranslationY(800);
        guest.setTranslationY(800);

        email.setAlpha(v);
        pass.setAlpha(v);
        forgotpass.setAlpha(v);
        login.setAlpha(v);
        guest.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        pass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        forgotpass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        login.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();
        guest.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(900).start();

        return root;

    }
}
