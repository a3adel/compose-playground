package com.example.homeincompose.usa_cases

import com.example.homeincompose.data.DataRepository

class GetHeaderImagesUseCase(private val repo:DataRepository) {
    suspend fun invoke() = repo.provideHomeHeaderImages()
}