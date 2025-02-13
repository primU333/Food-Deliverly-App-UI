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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun HomeScreen(navController: NavController){
    Home(navController)
}

@Composable
fun Home(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
            .verticalScroll(rememberScrollState()),
    ){

        HeaderContainer()
        Spacer(
            modifier = Modifier
                .padding(10.dp)
        )

        PromoDisplay()

        Spacer(
            modifier = Modifier
                .padding(10.dp)
        )

        SearchBar()
        Spacer(
            modifier = Modifier
                .padding(10.dp)
        )
        Row (
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Popular Orders",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Swipe for more"
            )
        }
        PopularOrders(navController)

        Spacer(
            modifier = Modifier
                .padding(10.dp)
        )
        Row (
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Recommended For You",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Swipe for more"
            )
        }
        RecommendedOrders(navController)

        Footer()

    }

}

@Composable
fun PromoDisplay(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(150.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFF3E7B27))
    ){
        Row (
            modifier = Modifier
                .padding(15.dp)
                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceAround
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    text = "#eatwelltoday",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.LightGray
                    )
                )
                Text(
                    text = "Do You have a 70% off meal Coupon?",
                    style = TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )

                Text(
                    text = "Promo Period",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Yellow
                    )
                )
            }

            Column (
                modifier = Modifier
                    .weight(1f)
            ) {
                Image(
                    painter = painterResource(R.drawable.juice),
                    contentDescription = "Promo Meal",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(start = 16.dp)
//                        .width(100.dp)
                        .height(150.dp)
                    //                    .clip(RoundedCornerShape(50.dp))
                )
            }
        }
    }
}

@Composable
fun SearchBar(){
//    var text by remember { mutableStateOf("") }

    Row (
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,

        ) {
        TextField(
            value = "",
            onValueChange = { },
            label = { Text("Find Your best Meal...") },
            modifier = Modifier
                .fillMaxWidth()
//                .height(80.dp)
                .background(Color.White)
            //        leadingIcon = Icon(),

        )


        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Search Icon"



        )

    }
}

@Composable
fun PopularOrders(navController: NavController){
    LazyRow (
        modifier = Modifier
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        items(count = 10){ i ->
            OrderCard(navController = navController,
                image = painterResource(R.drawable.katogo),
                name = "Katogo Burger",
                description = "Served with Juice",
                price = "5000"
            )
            Spacer(
                Modifier.padding(10.dp)
            )


        }
    }
}


@Composable
fun RecommendedOrders(navController: NavController){
    LazyRow (
        modifier = Modifier
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        items(count = 10){ i ->
            OrderCard(navController = navController,
                image = painterResource(R.drawable.rolex),
                name = "Rolex",
                description = "Served with Black",
                price = "4000"
            )
            Spacer(
                Modifier.padding(10.dp)
            )


        }
    }
}




@Composable
fun OrderCard(
    navController: NavController,
    image: Painter,
    name: String,
    description: String,
    price: String,

    ){
    Box(
        modifier = Modifier
            .width(300.dp)
//            .height(300.dp)
//            .clipToBounds()
        ,
//                                        .weight(1f)

        contentAlignment = Alignment.Center
    ){
        Column (
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize()
//                .height(350.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color(0xFF914F1E)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.padding(top=10.dp))
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = image,
                    contentDescription = name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        //                    .offset(y = (-20).dp)
                        .width(60.dp)
                        .height(60.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .clickable() {
                            //                                navController.navigate("product")
                        }
                )

                Image(
                    painter = image,
                    contentDescription = name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        //                    .offset(y = (-20).dp)
                        .width(120.dp)
                        .height(120.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .clickable() {
                            //                                navController.navigate("product")
                        }
                )

                Image(
                    painter = image,
                    contentDescription = name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        //                    .offset(y = (-20).dp)
                        .width(60.dp)
                        .height(60.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .clickable() {
                            //                                navController.navigate("product")
                        }
                )
            }
            Spacer(
                Modifier.padding(top=10.dp)
            )
            Text(
                name,
                style = TextStyle(
                    fontSize = 25.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(
                Modifier.padding(top=5.dp)
            )
            Text(
                description,
                style = TextStyle(
                    fontSize = 15.sp,
                    color = Color.LightGray,
                )
            )
            Spacer(
                Modifier.padding(top=10.dp)
            )
            Text(
                "UGX $price",
                style = TextStyle(
                    fontSize = 25.sp,
                    color = Color.Yellow,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(
                Modifier.padding(top=10.dp)
            )

            Button(
                onClick = {
                    navController.navigate("order")
                },
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor = Color(0xFFA94A4A)
                )
            ) {
                Text(
                    "DETAILS ",
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 25.sp
                    )
                )

                Icon(
                    imageVector = Icons.Default.ExitToApp,
                    contentDescription = "Order",
                    tint = Color.White
                )
            }
            Spacer(modifier = Modifier.padding(top=10.dp))


        }




    }
}
