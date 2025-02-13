package com.gertec.solid_principios.model

interface ListUsers {
    fun getUsers(): List<User>
}

interface AddUser {
    fun addUser(user: User)
}