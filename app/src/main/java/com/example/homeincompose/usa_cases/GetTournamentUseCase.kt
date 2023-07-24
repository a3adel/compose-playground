package com.example.homeincompose.usa_cases

import com.example.homeincompose.data.DataRepository

class GetTournamentUseCase(private val repo: DataRepository) {
    suspend operator fun invoke() =
        repo.getTournaments()

}