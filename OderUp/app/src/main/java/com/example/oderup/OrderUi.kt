package com.example.oderup

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun OrderScreen(navController: NavController){
    Order(navController)
}

@Composable
fun Order(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
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
                        navController.navigate("home")
                    }
            )

            Text(
                "Katogo (Offals)",
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

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        ){
            Image(
                painter = painterResource(R.drawable.rolex),
                contentDescription = "Order name",
                contentScale = ContentScale.Crop,

                modifier = Modifier
                    .fillMaxSize()
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.SpaceAround
        )
            {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Restaurant",
                tint = Color(0xFF2F3645)
            )
            Text(
                "Moonlight Restuarant",
                style = TextStyle(
                    color = Color(0xFF2F3645),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Text(
                "Kabale",
                style = TextStyle(
                    color = Color(0xFFA94A4A),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceAround
        )
        {

            Text(
                "Lunch :",
                style = TextStyle(
                    color = Color(0xFF914F1E),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Text(
                "UGX 5000",
                style = TextStyle(
                    color = Color(0xFF914F1E),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }

        Column (
            modifier = Modifier
                .padding(5.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.Start
        ) {
//            Text(
//                "Special Instructions",
//                style = TextStyle(
//                    color = Color.Black,
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold
//                )
//            )

            Spacer(Modifier.padding(5.dp))

            PromoDisplay()

            Spacer(Modifier.padding(15.dp))

            Text(
                "Ingredients",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Spacer(Modifier.padding(5.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .clip(RoundedCornerShape(16.dp))
            ){
                Text(
                    "Upon logging in, it is highly recommended to update the administrator's password with a strong one. " +
                            "\n" +
                            "Follow these steps to change the password:\n" +
                            "    Locate the option to change the password for the administrator account.\n",
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            horizontalArrangement = Arrangement.SpaceAround

        ) {
            Box(
                modifier = Modifier
                    .width(200.dp),
                contentAlignment = Alignment.Center

            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color(0xFF914F1E),
                            containerColor = Color.White
                        )
                    ){
                        Text(
                            "-",
                            style = TextStyle(
                                fontSize = 30.sp,

                            )
                        )
                    }

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color.White,
                            containerColor = Color(0xFF914F1E)
                        )
                    ){
                        Text(
                            "1"
                        )
                    }

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color(0xFF914F1E),
                            containerColor = Color.White
                        )
                    ){
                        Text(
                            "+",
                            style = TextStyle(
                                fontSize = 30.sp,

                                )
                        )
                    }






                }
            }

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor = Color(0xFF914F1E)
                )
            ){
                Text(
                    "ORDER ",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                )

                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = "Place Order",
                    tint = Color.White
                )
            }
        }

        Spacer(Modifier.padding(10.dp))


        Footer()
    }



}