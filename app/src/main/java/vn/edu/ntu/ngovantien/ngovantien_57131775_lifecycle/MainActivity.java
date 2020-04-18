    package vn.edu.ntu.ngovantien.ngovantien_57131775_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

    public class MainActivity extends AppCompatActivity {
    TextView textTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate Called");
        textTime = findViewById(R.id.textTime);
        SimpleDateFormat spf = new SimpleDateFormat("HH:mm:ss");
        String strDate = spf.format(new Date());
        textTime.setText(strDate);
        Toast.makeText(getApplicationContext(),"onCreate",Toast.LENGTH_SHORT).show();
    }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d("LifeCycle","onRestart Called");
            Toast.makeText(getApplicationContext(),"onRestart",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.d("LifeCycle","onPause Called");
            Toast.makeText(getApplicationContext(),"onPause",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.d("LifeCycle","onResume Called");
            Toast.makeText(getApplicationContext(),"onResume",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d("LifeCycle","onStart Called");
            Toast.makeText(getApplicationContext(),"onStart",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.d("LifeCycle","onStop Called");
            Toast.makeText(getApplicationContext(),"onStop",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d("LifeCycle","onDestroy Called");
            Toast.makeText(getApplicationContext(),"onDestroy",Toast.LENGTH_SHORT).show();
        }
    }
