package sg.edu.rp.c346.id19020844.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;
    ImageView ivGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alContactList = new ArrayList<>();

        lvContact = findViewById(R.id.listViewContacts);
        ivGender = findViewById(R.id.imageViewGender);
        alContactList.add(new Contact("Mary", 65, 65442334, 'f'));
        alContactList.add(new Contact("Ken", 65, 97442437, 'm'));

        caContact = new CustomAdapter(this, R.layout.row, alContactList);
        lvContact.setAdapter(caContact);
    }
}
