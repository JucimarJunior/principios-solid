package com.gertec.solid_principios

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gertec.solid_principios.model.AddUser
import com.gertec.solid_principios.model.ListUsers
import com.gertec.solid_principios.model.User
import com.gertec.solid_principios.repository.UserRepository

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var userAdapter: UserAdapter
    private lateinit var listUsers: ListUsers
    private lateinit var addUser: AddUser
    private lateinit var btnAddUser: Button
//    private val userRepository = UserRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val repository = UserRepository()
        listUsers = repository
        addUser = repository

        val users = listUsers.getUsers()
        userAdapter = UserAdapter(users)
        recyclerView.adapter = userAdapter

        btnAddUser = findViewById(R.id.btn_add_user)

        btnAddUser.setOnClickListener {
            addUserApp()
        }

//        userAdapter = UserAdapter(users)
//        recyclerView.adapter = userAdapter
    }

    private fun addUserApp() {
        addUser.addUser(User(3, "Julius"))

        val updatedUsers = listUsers.getUsers()
        userAdapter.updateList(updatedUsers)
    }
}