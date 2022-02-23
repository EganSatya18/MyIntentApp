package www.smktelkommalang.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObjectActivity extends AppCompatActivity {

    public static String EXTRA_PERSON = "extra_person";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        if(getIntent()!=null){
            TextView tvObject = (TextView) findViewById(R.id.tv_object);
            Person manusia = getIntent().getParcelableExtra(EXTRA_PERSON);
            String text = "Name :"+manusia.getName()+"Email :"+manusia.getEmail()+"Age :"+manusia.getAge()+"City :"+manusia.getCity();
            tvObject.setText(text);
        }
    }
}