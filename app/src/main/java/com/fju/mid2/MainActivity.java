package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static int FUNC_1 = 1;
    public final static int FUNC_3 = 3;
    public final static int FUNC_7 = 7;
    public final static int FUNC_8 = 8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void botton1 (View view){
        Intent intent = new Intent(this,Func1Activity.class);
        startActivityForResult(intent,FUNC_1);
    }
    public void botton2 (View view){
        Intent intent = new Intent(this,Func2Activity.class);
        startActivityForResult(intent,FUNC_1);
    }
    public void botton3 (View view){
        Intent intent = new Intent(this,Func3Activity.class);
        startActivityForResult(intent,FUNC_3);

    }
    public void botton4 (View view){
        Intent intent = new Intent(this,Func4Activity.class);
        startActivityForResult(intent,FUNC_1);
    }
    public void botton5 (View view){
        Intent intent = new Intent(this,Func5Activity.class);
        startActivityForResult(intent,FUNC_1);
    }
    public void botton6 (View view){
        Intent intent = new Intent(this,Func6Activity.class);
        startActivityForResult(intent,FUNC_1);
    }
    public void botton7 (View view){
        Intent intent = new Intent(this,Func7Activity.class);
        startActivityForResult(intent,FUNC_7);

    }
    public void botton8 (View view){
        Intent intent = new Intent(this,Func8Activity.class);
        startActivityForResult(intent,FUNC_8);

    }
    @Override
    public void onActivityResult (int requestCode, int resultCode , Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==FUNC_3){
            Toast.makeText(this,"特殊功能",Toast.LENGTH_SHORT).show();

        }else if(requestCode==FUNC_7){
            Toast.makeText(this,"特殊功能",Toast.LENGTH_SHORT).show();
        }else if(requestCode==FUNC_8){
            Toast.makeText(this,"特殊功能",Toast.LENGTH_SHORT).show();
        }else {
            finish();
        }

    }

}
