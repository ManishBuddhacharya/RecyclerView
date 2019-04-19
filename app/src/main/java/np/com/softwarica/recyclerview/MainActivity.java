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
        contactList.add(new Contacts("Batman","9806151615","Balaju","Abc@gmail.com", R.drawable.batman));
        contactList.add(new Contacts("Ironman","9806151615","Balasdd","bbb@gmail.com", R.drawable.ironman));
        contactList.add(new Contacts("Hulk","9806151612","Balkhiu","sdasadasd@gmail.com", R.drawable.hulk));
        contactList.add(new Contacts("Captain Marvel","9806151615","India","dsadasd@gmail.com", R.drawable.cm));
        contactList.add(new Contacts("Black Panther","9806151615","China","sadasdasd@gmail.com", R.drawable.bp));
        contactList.add(new Contacts("Thor","9806151615","Nepal","sadasdasd@gmail.com", R.drawable.thor));
        contactList.add(new Contacts("Captain America","9806151615","USA","sazdsadasd@gmail.com", R.drawable.ca));
        contactList.add(new Contacts("Spiderman","9806151615","Japan","sadsadsadas@gmail.com", R.drawable.spiderman));
        contactList.add(new Contacts("Loki","9806151615","Korea","asdfasdas@gmail.com", R.drawable.loki));
        contactList.add(new Contacts("Black Widow","9806151615","Canada","adasd@gmail.com", R.drawable.bw));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactList);
        rvContact.setAdapter(contactsAdapter);
        rvContact.setLayoutManager(new LinearLayoutManager(this));
    }
}
