package com.gertec.solid_principios.repository

import com.gertec.solid_principios.model.AddUser
import com.gertec.solid_principios.model.ListUsers
import com.gertec.solid_principios.model.User

//class UserRepository {
//    fun getUsers(): List<User> {
//        return listOf(
//            User(1, "Jucimar"),
//            User(2, "Sara"),
//            User(3, "Vanessa")
//        )
//    }
//}

class UserRepository : ListUsers, AddUser {
    private val userList = mutableListOf(
        User(1, "Junior"),
        User(2, "Estevão")
    )

    override fun getUsers(): List<User> = userList

    override fun addUser(user: User) {
        userList.add(user)
    }
}