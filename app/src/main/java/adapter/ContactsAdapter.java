package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import modal.Contacts;
import np.com.softwarica.recyclerview.DetailsActivity;
import np.com.softwarica.recyclerview.R;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>{

    Context mContext;
    List <Contacts> contactLists;

    public ContactsAdapter(Context mContext, List<Contacts> contactLists) {
        this.mContext = mContext;
        this.contactLists = contactLists;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact, viewGroup, false);
        return new ContactsViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {
        final Contacts contact = contactLists.get(i);
        contactsViewHolder.imgProfile.setImageResource(contact.getImageId());
        contactsViewHolder.tvName.setText(contact.getName());
        contactsViewHolder.tvContact.setText(contact.getContact());

        contactsViewHolder.imgProfile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(mContext, DetailsActivity.class);
            intent.putExtra("image", contact.getImageId());
            intent.putExtra("contact", contact.getContact());
            intent.putExtra("name", contact.getName());
            intent.putExtra("address", contact.getAddress());
            intent.putExtra("email", contact.getEmail());
            mContext.startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return contactLists.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imgProfile;
        TextView tvName, tvContact;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvContact = itemView.findViewById(R.id.tvContact);
        }
    }
}
