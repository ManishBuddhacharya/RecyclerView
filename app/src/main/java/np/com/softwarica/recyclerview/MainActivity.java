package np.com.softwarica.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import modal.Contacts;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvContact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvContact = findViewById(R.id.rvContact);
        List<Contacts> contactList = new ArrayList<>();
        contactList.add(new Contacts("Batman","9806151615", R.drawable.batman));
        contactList.add(new Contacts("Ironman","9806151615", R.drawable.ironman));
        contactList.add(new Contacts("Hulk","9806151612", R.drawable.hulk));
        contactList.add(new Contacts("Captain Marvel","9806151615", R.drawable.cm));
        contactList.add(new Contacts("Black Panther","9806151615", R.drawable.bp));
        contactList.add(new Contacts("Thor","9806151615", R.drawable.thor));
        contactList.add(new Contacts("Captain America","9806151615", R.drawable.ca));
        contactList.add(new Contacts("Spiderman","9806151615", R.drawable.spiderman));
        contactList.add(new Contacts("Loki","9806151615", R.drawable.loki));
        contactList.add(new Contacts("Black Widow","9806151615", R.drawable.bw));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactList);
        rvContact.setAdapter(contactsAdapter);
        rvContact.setLayoutManager(new LinearLayoutManager(this));
    }
}
