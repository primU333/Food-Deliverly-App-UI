package com.example.oderup

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
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun CheckOutScreen(navController: NavController){
    Checkout(navController)
}

@Composable
fun Checkout(navController: NavController){
    Column (
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
                        navController.navigate("home")
                    }
            )

            Text(
                "My Orders",
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

        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.Start
        ) {
            for (i in 1..4){
                OrderItem()
            }

            Spacer(Modifier.padding(10.dp))

            Bill("UGX 5000", "UGX 1000", "UGX 2000", "UGX 8000")

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
                    "Checkout",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp
                    )
                )
            }
        }


    }
}

@Composable
fun OrderItem(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Top

    ) {
        Box(
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color(0xFF914F1E)),
            contentAlignment = Alignment.Center

        ){
            Image(
                painter = painterResource(R.drawable.rolex),
                contentDescription = "Order name",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(75.dp)
                    .height(75.dp)
                    .clip(RoundedCornerShape(50.dp))
            )
        }

        Spacer(Modifier.padding(5.dp))

        Column {
            Text(
                "Ugandan Rolex",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                "Moonlight Restuarant Kabale",
                style = TextStyle(
                    color = Color.Gray,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Italic
                )
            )
            Text(
                "UGX 5000",
                style = TextStyle(
                    color = Color.Gray,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Row (
                modifier = Modifier
                    .padding(3.dp),
                horizontalArrangement = Arrangement.SpaceAround
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

        Spacer(Modifier.padding(5.dp))

        Icon(
            imageVector = Icons.Default.Delete,
            contentDescription = "Remove Order",
            tint = Color(0xFF914F1E)
        )
    }
}

@Composable
fun Bill(
        subTotal : String,
        totalAmount : String,
        taxesAmount : String,
        deliverlyFees : String,
    ){

    Column(
        modifier = Modifier
            .fillMaxSize()
//                    .padding()
    )  {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
            ) {
            Text(
                "Sub Total",
                style = TextStyle(
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
            Text(
                subTotal,
                style = TextStyle(
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )

        }

        Spacer(Modifier.padding(5.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
            ) {
            Text(
                "Taxes & Fees",
                style = TextStyle(
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
            Text(
                taxesAmount,
                style = TextStyle(
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )

        }
        Spacer(Modifier.padding(5.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
            ) {
            Text(
                "Deliverly Fees",
                style = TextStyle(
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
            Text(
                deliverlyFees,
                style = TextStyle(
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
        }

        Spacer(Modifier.padding(5.dp))

        Divider(thickness = 1.dp, color = Color.LightGray)
        Spacer(Modifier.padding(5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
            ) {
            Text(
                "Total",
                style = TextStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
            )
            Text(
                totalAmount,
                style = TextStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
            )
        }

        Spacer(Modifier.padding(5.dp))

    }
}


