package kr.hs.emirim.hyeonjinmirim.friendsimulator.a_room;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onClick(int view ){
        Toast.makeText(this,"작동 해요~", Toast.LENGTH_SHORT).show();
    }

}
