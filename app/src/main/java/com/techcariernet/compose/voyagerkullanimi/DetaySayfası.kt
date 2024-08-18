package com.techcariernet.compose.voyagerkullanimi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen

class DetaySayfası(var ad: String, var yas: Int,var urun:Urunler) : Screen {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        Scaffold(topBar = { TopAppBar(title = { Text(text = "Detay Sayfa") }) }) { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
             Text(text = "$ad - $yas ${urun.ad},${urun.fiyat}")
            }
        }

    }

}

//class olusturup :Screen dönecek
//fun Content üzerine    @OptIn(ExperimentalMaterial3Api::class) @Composable
//fun content altına Scaffold dan itibaren alıyoruz.

//Bottom Bar eklendi..