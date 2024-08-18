package com.techcariernet.compose.basiccalculatorproject

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.techcariernet.compose.basiccalculatorproject.ui.theme.LightGrey
import com.techcariernet.compose.basiccalculatorproject.ui.theme.Orange


@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing: Dp = 8.dp,
    modifier: Modifier = Modifier,
    onAction: (CalculatorActions) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            ) //sonuc ile butonlar arası boşluk


            // 1. Satır
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                //ALL Clear
                CalculatorButton(
                    symbol = "AC", modifier = Modifier
                        .background(LightGrey)
                        .aspectRatio(2f)//normal butona göre 2 kat daha büyük olacak.)
                        .weight(2f),
                    onClick = {

                        onAction(CalculatorActions.Clear)
                    }
                )


                //Delete
                CalculatorButton(
                    symbol = "<-", modifier = Modifier
                        .background(LightGrey)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        onAction(CalculatorActions.Delete)
                    }
                )
                //  Divide
                CalculatorButton(
                    symbol = " / ", modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        Log.e("işlemler", "Bölme işlemi yapıldı.")
                        //     onAction(CalculatorActions.Operation(CalculatorOperation.Divide))
                    }
                )
            }
            // 2. Satır
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                //7
                CalculatorButton(
                    symbol = "7", modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        onAction(CalculatorActions.Number(7))
                    }
                )


                //8
                CalculatorButton(
                    symbol = "8", modifier = Modifier
                        .background(DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        onAction(CalculatorActions.Number(8))

                    }
                )
                //  9
                CalculatorButton(
                    symbol = "9", modifier = Modifier
                        .background(DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(9))

                    }
                )
                // X
                CalculatorButton(
                    symbol = "X", modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        Log.e("işlemler", "Çarpma işlemi tanımlanacak")
                        //     onAction(CalculatorActions.Operation(CalculatorOperation.Divide))
                    }
                )
            }
            // 3. Satır
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                //4
                CalculatorButton(
                    symbol = "4", modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        onAction(CalculatorActions.Number(4))
                    }
                )


                //5
                CalculatorButton(
                    symbol = "5", modifier = Modifier
                        .background(DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        onAction(CalculatorActions.Number(5))

                    }
                )
                //  6
                CalculatorButton(
                    symbol = "6", modifier = Modifier
                        .background(DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(6))

                    }
                )
                // X
                CalculatorButton(
                    symbol = "-", modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        Log.e("işlemler", "Çıkarma işlemi tanımlanacak")
                        //     onAction(CalculatorActions.Operation(CalculatorOperation.Subtract))
                    }
                )
            }

            // 4. Satır
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                //1
                CalculatorButton(
                    symbol = "1", modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        onAction(CalculatorActions.Number(1))
                    }
                )


                //2
                CalculatorButton(
                    symbol = "2", modifier = Modifier
                        .background(DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        onAction(CalculatorActions.Number(2))

                    }
                )
                //  3
                CalculatorButton(
                    symbol = "3", modifier = Modifier
                        .background(DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(3))

                    }
                )
                // +
                CalculatorButton(
                    symbol = "+", modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        Log.e("işlemler", "Çarpma işlemi tanımlanacak")
                           onAction(CalculatorActions.Operation(CalculatorOperation.Add))
                    }
                )
            }
            // 5. Satır
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                //0
                CalculatorButton(
                    symbol = "0", modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Number(0))
                    }
                )


                // =
                CalculatorButton(
                    symbol = "=", modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        onAction(CalculatorActions.Calculate)

                    }
                )
                //  .
                CalculatorButton(
                    symbol = ".", modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Decimal)

                    }
                )
            }

        }
    }
}
