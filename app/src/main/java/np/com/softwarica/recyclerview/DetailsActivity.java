package np.com.softwarica.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
    CircleImageView circleImg;
    TextView tvFullname, tvContact, tvEmail, tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circleImg = findViewById(R.id.imgProfile);
        tvFullname= findViewById(R.id.tvName);
        tvContact = findViewById(R.id.tvContact);
        tvAddress = findViewById(R.id.tvAddress);
        tvEmail = findViewById(R.id.tvEmail);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            circleImg.setImageResource(bundle.getInt("image"));
            tvFullname.setText("Name: "+bundle.getString("name"));
            tvContact.setText("Contact: "+bundle.getString("contact"));
            tvAddress.setText("Address: "+bundle.getString("address"));
            tvEmail.setText("Email: "+bundle.getString("email"));
        }
    }
}
