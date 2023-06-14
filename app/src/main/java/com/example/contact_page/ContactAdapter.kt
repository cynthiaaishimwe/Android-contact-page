package com.example.contact_page

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.contact_page.databinding.ContactListsBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactAdapter(var ContactList:List<ContactData>) : RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListsBinding .inflate(LayoutInflater.from(parent.context),parent ,false)
        return ContactViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return ContactList.size


    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact =ContactList.get(position)
        var  binding=holder.binding
        binding.ivContact.tag=currentContact.avatar
        binding.tvDisplayName.text=currentContact.displayName
        binding.tvPhoneNumber.text=currentContact.phoneNumber
        binding.tvEmail.text =currentContact.email

        binding.tvbtn.setOnClickListener {
            val intent = Intent(holder.itemView.context, AddMainActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }

        Picasso
            .get()
            .load(currentContact.avatar)
            .resize(80, 80)
            .centerCrop()
            .centerInside()
            .transform(CropCircleTransformation())
            .into(binding.ivContact)
    }
}
class ContactViewHolder( var binding:ContactListsBinding):ViewHolder(binding.root)
