package android.example.healthcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int health_points = 0;
    public void Yes(View view){
        health_points += 1;
        String message = "Your healthPoints are "+health_points+"\n"+
                "You are healthier than before";
        display(message);
    }

    public void Sometimes(View view){
        String message = "Your healthPoints are "+health_points+"\n"+
                "You are same as healthy as before";
        display(message);
    }

    public void No(View view){
        health_points -= 1;
        String message = "Your healthPoints are "+health_points+"\n"+
                "You are less healthier than before";
        if(health_points<0){
            message = "YOur healthPoints are " + health_points + "\n"+
                    "You are not healthy";
        }
        display(message);
    }

    public void display(String message){
        TextView t = (TextView) findViewById(R.id.message_text_view);
        t.setText("" + message);
    }
}