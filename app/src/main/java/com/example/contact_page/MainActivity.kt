package com.example.contact_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contact_page.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        val contact1=ContactData("https://images.unsplash.com/photo-1664575600397-88e370cb46b8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDR8fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60","Cynthia","07890456178","cynthia@gmail.com")
        val contact2=ContactData("https://images.unsplash.com/photo-1664575600397-88e370cb46b8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDR8fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60","Esther","0798679045" ,"esther@gmail.com")
        val contact3=ContactData("https://images.unsplash.com/photo-1664575600397-88e370cb46b8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDR8fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60","rebecca","07880923446","rebecca@gmail.com")
        val contact4=ContactData("https://images.unsplash.com/photo-1664575600397-88e370cb46b8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDR8fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60","joyce","0785734903","joyce@gmail.com")
        val contact5=ContactData("https://images.unsplash.com/photo-1664575600397-88e370cb46b8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDR8fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60","belyse","0789789012","belyse@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5)
        val contactAdapter=ContactAdapter(contactList)
        binding.rvRecycler.layoutManager=LinearLayoutManager(this)
        binding.rvRecycler.adapter=contactAdapter
    }
}