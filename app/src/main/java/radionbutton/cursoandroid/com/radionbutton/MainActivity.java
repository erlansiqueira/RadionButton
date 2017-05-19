package radionbutton.cursoandroid.com.radionbutton;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radiogroup;
    private RadioButton radioButtonEscolhido;
    private Button botaoEscolhido;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiogroup = (RadioGroup) findViewById(R.id.radioGroupId);
        botaoEscolhido = (Button) findViewById(R.id.botaoId);
        texto = (TextView) findViewById(R.id.textoEscolher);

        botaoEscolhido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int idRadioButtonEscolhido = radiogroup.getCheckedRadioButtonId();
                if(idRadioButtonEscolhido >0 ) {
                    radioButtonEscolhido = (RadioButton) findViewById(idRadioButtonEscolhido);
                    texto.setText(radioButtonEscolhido.getText());                }

            }
        });
    }
}
