package com.example.goncharov1.data.mappers

import com.example.goncharov1.data.model.UserModel
import com.example.goncharov1.domain.entity.UserEntity

class UserMapperImpl : UserMapper {

    override fun toDomain(userModel: UserModel): UserEntity = with(userModel) {
        UserEntity(
            userName = name,
            lastName = lastName
        )
    }
}

interface UserMapper {

    fun toDomain(userModel: UserModel): UserEntity

}