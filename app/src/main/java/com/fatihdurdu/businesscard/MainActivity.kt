package com.fatihdurdu.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fatihdurdu.businesscard.ui.theme.BusinessCardTheme
import com.fatihdurdu.businesscard.ui.theme.MainColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CreateAllDesign()
                }
            }
        }
    }
}


@Composable
fun CreateAllDesign() {
    Surface(
        color = MainColor,
        modifier = Modifier
            .background(MainColor)
            .fillMaxHeight()
            .fillMaxWidth(),

        ) {
        Column(
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = CenterHorizontally
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = CenterHorizontally,
                modifier = Modifier.height(600.dp)
            ) {
                Image(
                    modifier = Modifier.size(150.dp),
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Card Image", colorFilter = ColorFilter.tint(Color.Green)

                )
                Text(
                    text = "android",
                    modifier = Modifier
                        .align(CenterHorizontally)
                        .offset(y = (-60).dp),
                    fontSize = 18.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold

                )
                Text(
                    text = "Fatih Durdu",
                    modifier = Modifier
                        .align(CenterHorizontally)
                        .offset(y = (-40).dp),
                    fontSize = 40.sp,
                    color = Color.White
                )
                Text(
                    text = "Android Developer",
                    modifier = Modifier
                        .align(CenterHorizontally)
                        .offset(y = (-40).dp),
                    color = Color.Green,
                    fontWeight = FontWeight.Bold
                )
            }

            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Divider(color = Color.LightGray)
                Row (Modifier.width(300.dp) ){
                    Icon(
                        Icons.Rounded.Phone,
                        contentDescription = "Phone Icon",
                        tint = Color.Green,
                        modifier = Modifier.width(50.dp).padding(5.dp)
                    )
                    Text(
                        text = "+90 530 774 6114",
                        modifier = Modifier.padding(8.dp),
                        color = Color.White
                    )

                }
                Divider(color = Color.LightGray)
                    Row (Modifier.width(300.dp)){
                    Icon(
                        Icons.Rounded.Share,
                        contentDescription = "Share Icon",
                        tint = Color.Green,
                        modifier = Modifier.width(50.dp).padding(5.dp)
                    )
                    Text(
                        text = "@FthDurdu",
                        modifier = Modifier.padding(8.dp),
                        color = Color.White
                    )
                }
                Divider(color = Color.LightGray)
                Row (Modifier.width(300.dp)){
                    Icon(
                        Icons.Rounded.Email,
                        contentDescription = "Email Icon",
                        tint = Color.Green,
                        modifier = Modifier.width(50.dp).padding(5.dp)

                    )
                    Text(
                        text = "mfdurdu@gmail.com",
                        modifier = Modifier.padding(8.dp),
                        color = Color.White
                    )
                }
            }


        }


    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        CreateAllDesign()
    }
}