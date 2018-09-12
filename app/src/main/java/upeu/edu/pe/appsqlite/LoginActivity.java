package upeu.edu.pe.appsqlite;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private Button btn1;
    private TextView tv1;
    Typeface typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv1 = (TextView) findViewById(R.id.tvtitulo);
        typeface = Typeface.createFromAsset(this.getAssets(),"fonts/Sacramento-Regular.ttf");
        tv1.setTypeface(typeface);
        btn1 = (Button) findViewById(R.id.btnenviar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PrincipalActivity.class);
                startActivity(i);

            }
        });
    }
}
