package pt.iade.thesitter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.Manifest;


public class profile_verification extends AppCompatActivity {

    ImageButton btnCam, btnPDF;
    private static final int CAMERA_REQUEST_CODE = 101;
    private static final int PDF_REQUEST_CODE = 102;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_profile_verification);


        btnCam = (ImageButton) findViewById(R.id.btnCam);
        btnPDF = (ImageButton) findViewById(R.id.btnPDF);


        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, CAMERA_REQUEST_CODE);
        }

        btnCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                //intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAMERA_REQUEST_CODE);
            }
        });

        btnPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openPDFSelector();
            }
        });

    }

    private void openPDFSelector() {
        //ToDo: Intent para selecionar um PDF
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("application/pdf");
        startActivityForResult(intent, PDF_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAMERA_REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            btnCam.setImageBitmap(bitmap);
        } else if (requestCode == PDF_REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            Uri selectedPdf = data.getData();
            handleSelectedPdf(selectedPdf);
        }
    }

    private void handleSelectedPdf(Uri pdfUri) {

      // Todo: ler o arquivo, visualizá-lo ou fazer upload
    }

    public void startSave2(View view){
        Intent intent = new Intent(this, parent_client_choice.class);
        startActivity(intent);
    }

    /*private void uploadFile(String filePath) {
        // Código para upload do arquivo
    }*/
}