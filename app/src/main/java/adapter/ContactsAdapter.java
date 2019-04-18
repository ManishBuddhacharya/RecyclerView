package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import modal.Contacts;
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
        Contacts contact = contactLists.get(i);
        contactsViewHolder.imgProfile.setImageResource(contact.getImageId());
        contactsViewHolder.tvName.setText(contact.getName());
        contactsViewHolder.tvContact.setText(contact.getContact());
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
