package com.example.contact_page

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.contact_page.databinding.ContactListsBinding

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
//        binding.ivAvatar.text=currentContact.avatar
        binding.tvDisplayName.text=currentContact.displayName
        binding.tvPhoneNumber.text=currentContact.phoneNumber
        binding.tvEmail.text =currentContact.email
    }
}
class ContactViewHolder( var binding:ContactListsBinding):ViewHolder(binding.root)
