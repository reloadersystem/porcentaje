package resembrink.dev.porcentajeclas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvidafp, tvidrenta,tvseguro;
    TextView resultado;
    EditText etvalor;
    Button btcalculo;


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


        tvidafp=findViewById(R.id.idafp);
        tvidrenta=findViewById(R.id.idrenta);
        tvseguro= findViewById(R.id.idseguro);
        btcalculo= findViewById(R.id.btnCalcular);
        etvalor=findViewById(R.id.etsueldo);
        resultado=findViewById(R.id.tvresultado);


        btcalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //String calculo= etvalor.getText().toString();


                double calculo= Double.parseDouble(etvalor.getText().toString());

                String renta= (calculo*0.10)+"";

                String afp= (calculo*0.07)+"";

                String seguro= (calculo*0.15)+"";

                tvidrenta.setText(renta);
                tvidafp.setText(afp);
                tvseguro.setText(seguro);

                Double valorfinal= calculo - ((calculo*0.10)+ (calculo*0.07) + (calculo*0.05));

                resultado.setText(valorfinal+"");

            }
        });

    }
}
