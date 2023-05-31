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
        val contact1=ContactData("Cynthia","07886060999","cynthia@gmail.com")
        val contact2=ContactData("Esther","0789554352","esther@gmail.com")
        val contact3=ContactData("Angeth","0782364352","rebecca@gmail.com")
        val contact4=ContactData("Joyce","0756364352","joyyce@gmail.com")
        val contact5=ContactData("Belyse","0782365352","belyse@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5)
        val contactAdapter=ContactAdapter(contactList)
        binding.rvRecycler.layoutManager=LinearLayoutManager(this)
        binding.rvRecycler.adapter=contactAdapter
    }
}