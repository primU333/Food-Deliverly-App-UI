package com.example.oderup

import androidx.annotation.ColorInt
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Atm
import androidx.compose.material.icons.filled.Autorenew
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Start
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun PaymentScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())

    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFF914F1E)),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Go Back",
                tint = Color.White,
                modifier = Modifier
                    .clickable(){
                        navController.navigate("checkout")
                    }
            )

            Text(
                "Complete Payment",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "Go Back",
                tint = Color.White
            )
        }

        Spacer(Modifier.padding(10.dp))
        PaymentMethods(navController)

        Spacer(Modifier.padding(30.dp))

        Box(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ){
            Row(
                modifier = Modifier
                    .padding(10.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Bill("UGX 15000", "UGX 25000", "UGX 5000", "5000")
            }
        }

        Spacer(Modifier.padding(10.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color(0xFF131010)
            ),
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .height(70.dp)
        ) {
            Text(
                "Pay Now ",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
            )

            Icon(
                imageVector = Icons.Filled.Start,
                contentDescription = "Start Payment",
                tint = Color.White
            )
        }
    }
}

@Composable
fun PaymentMethods(navController: NavController){
    Column {
        Box(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .height(70.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ){
            Row (
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Filled.Money,
                    contentDescription = "Cash",
                    tint = Color(0xFF914F1E),
                    modifier = Modifier
                        .size(40.dp)
                        .fillMaxHeight()
                )

                Text(
                    "Cash Payment",
                     style = TextStyle(
                         color = Color.Gray,
                         fontSize = 25.sp

                     )
                )
            }
        }

        Box(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .height(70.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ){
            Row (
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Filled.Autorenew,
                    contentDescription = "Bank Transfer",
                    tint = Color(0xFF914F1E),
                    modifier = Modifier
                        .size(40.dp)
                        .fillMaxHeight()
                )

                Text(
                    "Bank Transfer",
                     style = TextStyle(
                         color = Color.Gray,
                         fontSize = 25.sp

                     )
                )
            }
        }

        Box(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .height(70.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ){
            Row (
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Filled.CreditCard,
                    contentDescription = "Credit Card",
                    tint = Color(0xFF914F1E),
                    modifier = Modifier
                        .size(40.dp)
                        .fillMaxHeight()
                )

                Text(
                    "Credit Card / Visa",
                     style = TextStyle(
                         color = Color.Gray,
                         fontSize = 25.sp

                     )
                )
            }
        }
    }
}