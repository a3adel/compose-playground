package com.example.homeincompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.homeincompose.home_screen.HomeUiStates
import com.example.homeincompose.usa_cases.GetTournamentUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(getTournamentsUseCase: GetTournamentUseCase) : ViewModel() {
    private val _loadingTournamentsState = MutableStateFlow(HomeUiStates.Loading)

    private val loadingTournamentsState: StateFlow<HomeUiStates> =
        _loadingTournamentsState.asStateFlow()

    fun getTournaments() {
        viewModelScope.launch {

        }
    }


}