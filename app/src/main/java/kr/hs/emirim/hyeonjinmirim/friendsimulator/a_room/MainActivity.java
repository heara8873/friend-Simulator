package kr.hs.emirim.hyeonjinmirim.friendsimulator.a_room;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "아루미: Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate 메소드 호출~");
        setContentView(R.layout.activity_main);
        Log.d(TAG, "activity_main 레이어드 세팅~");
    }

    void onClick(View view ){
        Log.d(TAG,"onCreate 메소드 호출~");
        Log.d(TAG,"클릭된 뷰 id:"+view.getId());
        switch(view.getId()){
            case R.id.button1 :
                Log.d(TAG,"버튼 1 클릭");
                Toast.makeText(this,"머임마", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2 :
                Log.d(TAG,"버튼 2 클릭");
                Toast.makeText(this,"노잼", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3 :
                Log.d(TAG,"버튼 3 클릭");
                Toast.makeText(this,"나 니혼진이야", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4 :
                Log.d(TAG,"버튼 4 클릭");
                Toast.makeText(this,"다이죠부해", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5 :
                Log.d(TAG,"버튼 5 클릭");
                Toast.makeText(this,"나 영어 못해서 일본어 해", Toast.LENGTH_SHORT).show();
                break;
            default :
                Log.e(TAG,"모르는 버튼을 클릭했어요");
                Toast.makeText(this,"무엇을 원하는 지 모르겠어요", Toast.LENGTH_SHORT).show();
                break;

        }
        Log.d(TAG,"onClick메소드 무사 종료");




    }

}
