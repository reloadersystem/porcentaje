package resembrink.dev.porcentajeclas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvidafp, tvidrenta,tvseguro;
    TextView resultado;
    EditText etvalor;
    Button btcalculo;
    RadioGroup radioGroup;
    Double valorfinal;

    String renta,afp, seguro;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tvidafp=findViewById(R.id.idafp);
        tvidrenta=findViewById(R.id.idrenta);
        tvseguro= findViewById(R.id.idseguro);
        btcalculo= findViewById(R.id.btnCalcular);
        etvalor=findViewById(R.id.etsueldo);
        resultado=findViewById(R.id.tvresultado);

        radioGroup= findViewById(R.id.rgroupdscto);

        limpiar();






        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                switch(checkedId)
                {
                    case R.id.rbrenta:
                    {

                        double calculo= Double.parseDouble(etvalor.getText().toString());

                         renta= (calculo*0.10)+"";

                         valorfinal= calculo - Double.parseDouble(renta);

                        tvidrenta.setText(renta);
                        tvidafp.setText("");
                        tvseguro.setText("");
                        resultado.setText("");


                        break;
                    }

                    case R.id.rbafp:
                    {

                        double calculo= Double.parseDouble(etvalor.getText().toString());

                        afp= (calculo*0.07)+"";
                        valorfinal= calculo - Double.parseDouble(afp);

                        tvidrenta.setText("");
                        tvidafp.setText(afp);
                        tvseguro.setText("");
                        resultado.setText("");
                        break;

                    }

                    case R.id.rbseguro:
                    {
                        double calculo= Double.parseDouble(etvalor.getText().toString());

                        seguro= (calculo*0.05)+"";
                        tvidrenta.setText("");
                        tvidafp.setText("");
                        tvseguro.setText(seguro);
                        resultado.setText("");

                        valorfinal= calculo - Double.parseDouble(seguro);

                        break;
                    }
                }

            }
        });


        btcalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultado.setText(valorfinal+"");


            }
        });

    }

    private void limpiar() {



        etvalor.setText("");
        tvidrenta.setText("");
        tvidafp.setText("");
        tvseguro.setText("");






    }
}
