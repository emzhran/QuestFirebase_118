package com.example.emzhranpam.ui.viewmodel

import android.net.http.HttpException
import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.emzhranpam.model.Mahasiswa
import com.example.emzhranpam.repository.RepositoryMhs
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.io.IOException

//sealed class DetailUiState {
//    data class Success(val mahasiswa: Mahasiswa) : DetailUiState()
//    data class Error(val message: String) : DetailUiState()
//    object Loading : DetailUiState()
//}
//
//@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
//class DetailViewModel(
//    savedStateHandle: SavedStateHandle,
//    private val mhs: RepositoryMhs
//) : ViewModel() {
//    private val _nim: String = checkNotNull(savedStateHandle["nim"])
//
//    private val _detailUiState = MutableStateFlow<DetailUiState>(DetailUiState.Loading)
//    val detailUiState: StateFlow<DetailUiState> = _detailUiState.asStateFlow()
//
//    init {
//        getMahasiswaByNim(_nim)
//    }
//
//    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
//    private fun getMahasiswaByNim(nim: String) {
//        viewModelScope.launch {
//            _detailUiState.value = DetailUiState.Loading
//            _detailUiState.value = try {
//                val mahasiswa = mhs.getMhs(nim)
//                DetailUiState.Success()
//            } catch (e: IOException) {
//                DetailUiState.Error("Terjadi kesalahan jaringan")
//            } catch (e: HttpException) {
//                DetailUiState.Error("Terjadi kesalahan server")
//            }
//        }
//    }
//}
