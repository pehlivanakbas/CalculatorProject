package com.techcariernet.compose.voyagerkullanimi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import com.techcariernet.compose.voyagerkullanimi.ui.theme.VoyagerKullanimiTheme
//nesne transferinde navigation yapısı oldukça zorlasıyor
//jetpackCompose da  basit bir nesne transferi yoktur.
//voyager kütüphanesinde nasıl kolaylastırıyor onu görecegiz.
//Scaffold =sayfanın sabitleenmesini yapar
//App bar hep yukarda-bottom bar hep assagıda gibi uygulama içerisinde hep aynı yerde durmasını saglar Fab button da Scaffolda
//Surface yüzey ile ilgili yapı Tema-Arkaplan gibi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VoyagerKullanimiTheme {
                BottomBarSayfa()

            }
        }
    }
}


