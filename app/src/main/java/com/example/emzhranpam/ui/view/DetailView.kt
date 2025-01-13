package com.example.emzhranpam.ui.view

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.emzhranpam.ui.navigasi.DestinasiDetail
import com.example.emzhranpam.ui.viewmodel.PenyediaViewModel
import kotlinx.coroutines.launch

//@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun DetailMahasiswaScreen(
//    onBack: () -> Unit,
//    nim: String,
//    modifier: Modifier = Modifier,
//    viewModel: DetailViewModel = viewModel(factory = PenyediaViewModel.Factory),
//    navController: NavHostController
//) {
//    val uiState by viewModel.detailUiState.collectAsState()
//    val coroutineScope = rememberCoroutineScope()
//    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
//
//    Scaffold(
//        modifier = modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
//        topBar = {
//            TopAppBar(scrollBehavior = scrollBehavior,
//                title = { Text("Tambah Mahasiswa") },
//                navigationIcon = {
//                    Button(onClick = onBack) {
//                        Text("Back")
//                    }
//                }
//            )
//        },
//        floatingActionButton = {
//            FloatingActionButton(
//                onClick = {
//                    navController.navigate("update_mhs/$nim")
//                },
//                shape = MaterialTheme.shapes.medium,
//                modifier = Modifier.padding(18.dp)
//            ) {
//                Icon(imageVector = Icons.Default.Edit, contentDescription = "Update Mahasiswa")
//            }
//        }
//    ) { innerPadding ->
//        DetailBody(
//            detailUiState = uiState,
//            onDeleteClick = {
//                coroutineScope.launch {
//                    onBack()
//                }
//            },
//            modifier = Modifier
//                .padding(innerPadding)
//                .verticalScroll(rememberScrollState())
//                .fillMaxWidth()
//        )
//    }
//}
//
//@Composable
//fun DetailBody(
//    detailUiState: DetailUiState,
//    onDeleteClick: () -> Unit,
//    modifier: Modifier = Modifier
//) {
//    when (detailUiState) {
//        is DetailUiState.Loading -> {
//            CircularProgressIndicator(modifier = modifier.fillMaxSize())
//        }
//        is DetailUiState.Error -> {
//            Text(
//                text = detailUiState.message,
//                color = Color.Red,
//                modifier = modifier.fillMaxSize().wrapContentSize(Alignment.Center)
//            )
//        }
//        is DetailUiState.Success -> {
//            val mahasiswa = detailUiState.mahasiswa
//            Column(
//                verticalArrangement = Arrangement.spacedBy(18.dp),
//                modifier = Modifier.padding(12.dp)
//            ) {
//                ComponentDetailMhs(judul = "Nama", isinya = mahasiswa.nama)
//                ComponentDetailMhs(judul = "Nama", isinya = mahasiswa.nim)
//                ComponentDetailMhs(judul = "NIM", isinya = mahasiswa.gender)
//                ComponentDetailMhs(judul = "Alamat", isinya = mahasiswa.alamat)
//                ComponentDetailMhs(judul = "Kenis Kelamin", isinya = mahasiswa.judulskripsi)
//                ComponentDetailMhs(judul = "Kelas", isinya = mahasiswa.kelas)
//                ComponentDetailMhs(judul = "Angkatan", isinya = mahasiswa.angkatan)
//                Spacer(modifier = Modifier.height(16.dp))
//                Button(
//                    onClick = onDeleteClick,
//                    shape = MaterialTheme.shapes.small,
//                    modifier = Modifier.fillMaxWidth()
//                ) {
//                    Text(text = "Hapus")
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun ComponentDetailMhs(
//    modifier: Modifier = Modifier,
//    judul: String,
//    isinya: String,
//){
//    Column(
//        modifier = modifier.fillMaxWidth(),
//        horizontalAlignment = Alignment.Start
//    ) {
//        Text(
//            text = "$judul : ",
//            fontSize = 19.sp,
//            fontWeight = FontWeight.Bold,
//            color = Color.Gray
//        )
//
//        Text(
//            text = isinya,
//            fontSize = 19.sp,
//            fontWeight = FontWeight.Bold
//        )
//    }
//}
