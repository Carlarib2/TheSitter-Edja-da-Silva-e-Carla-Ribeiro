package pt.iade.thesitter;

import android.animation.RectEvaluator;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.animation.ObjectAnimator;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_main);

        // Referência à ImageView no layout pelo ID
        final ImageView myImageView = findViewById(R.id.logo_image_a);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, second.class);
                startActivity(intent);

                // Adiciona uma animação de transição
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                // Finaliza a atividade atual para que não seja empilhada de volta quando pressionar o botão "Voltar"
                finish();
            }
        }, 3000);

        // Esconde a ImageView antes de iniciar a animação
        myImageView.setVisibility(View.INVISIBLE);

        // Adiciona uma animação à ImageView após um pequeno atraso
        myImageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Verifica se a largura e altura da ImageView são diferentes de zero
                if (myImageView.getWidth() != 0 && myImageView.getHeight() != 0) {
                    // Torna a ImageView visível antes de começar a animação
                    myImageView.setVisibility(View.VISIBLE);

                    // Adiciona uma animação à ImageView
                    Rect originalClipBounds = new Rect(0, 0, myImageView.getWidth(), myImageView.getHeight());
                    myImageView.setClipBounds(originalClipBounds);

                    ObjectAnimator clipAnimator = ObjectAnimator.ofObject(
                            myImageView,
                            "clipBounds",
                            new RectEvaluator(),
                            new Rect(0, 0, 0, 0),  // Rect inicial (sem recorte)
                            originalClipBounds   // Rect final (toda a imagem)
                    );

                    clipAnimator.setDuration(3000);  // Define a duração desejada em milissegundos
                    clipAnimator.start();
                }
            }
        }, 500); // Aguarde 500 milissegundos antes de iniciar a animação
    }
}