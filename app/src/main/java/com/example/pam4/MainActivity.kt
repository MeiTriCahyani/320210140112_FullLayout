package com.example.pam4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam4.ui.theme.PAM4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAM4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    homescreen()
                }
            }
        }
    }
}

@Composable
fun homescreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "MEI APP",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold

        )
        Spacer(modifier = Modifier.padding(10.dp))
        BoxHeader()
        Spacer(modifier = Modifier.padding(13.dp))
        Location()
        Spacer(modifier = Modifier.padding(13.dp))
        Keterangan()


    }
}

@Composable
fun BoxHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan))
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth())
        {
            Image(painter = painterResource(id = R.drawable.background),
                contentDescription ="", modifier = Modifier.size((200.dp))
            )
            Text(text = "Rain", fontSize = 20.sp,
                modifier = Modifier.padding(10.dp),
                fontWeight = FontWeight.Bold)

        }

    }
}

@Composable
fun Location(){
    Text(text = "19°C", fontSize = 40.sp, fontWeight = FontWeight.Bold)
    Row (verticalAlignment = Alignment.CenterVertically){
        Image(painter = painterResource(id = R.drawable.location), contentDescription = "",
            modifier = Modifier.size(40.dp))
        Spacer(modifier = Modifier.padding(3.dp))
        Text(text = "Yogyakarta", fontSize = 40.sp, fontWeight = FontWeight.Bold)
    }
    Spacer(modifier = Modifier.padding(3.dp))
    Text(text = "Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        fontSize = 15.sp,
        color = Color.Gray)

}


@Composable
fun Keterangan(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan))
    {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        ){
            Row (){
                Text(text = "Humidity")



            }
            Row(){

            }

        }
    }



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PAM4Theme {
        homescreen()
    }
}