package kr.hs.emirim.hyeonjinmirim.friendsimulator.a_room;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onClick(View view ){
        switch(view.getId()){
            case R.id.button1 :
                Toast.makeText(this,"머임마", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2 :
                Toast.makeText(this,"노잼", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3 :
                Toast.makeText(this,"나 니혼진이야", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4 :
                Toast.makeText(this,"다이죠부해", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5 :
                Toast.makeText(this,"나 영어 못해서 일본어 해", Toast.LENGTH_SHORT).show();
                break;
            default :
                Toast.makeText(this,"무엇을 원하는 지 모르겠어요", Toast.LENGTH_SHORT).show();
                break;

        }
        if(view.getId()==R.id.button1){

        }


    }

}
