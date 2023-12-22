package com.example.littlelemon

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonColor

@Composable
fun UpperPanel(context:Context) {
    Column(
        modifier = Modifier
            .padding(top = 16.dp)
            .background(LittleLemonColor.green)
    ) {
        Text(
            text = stringResource(id = R.string.title),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = LittleLemonColor.yellow,
            modifier = Modifier.padding(start = 16.dp)
        )
        Text(
            text = stringResource(id = R.string.location),
            fontSize = 24.sp,
            color = LittleLemonColor.cloud,
            modifier = Modifier.padding(start = 16.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(top = 20.dp, start = 16.dp, end = 16.dp)
        ) {
            Text(
                text = stringResource(id = R.string.description),
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .padding(bottom = 28.dp, end = 20.dp)
                    .fillMaxWidth(0.6f),
                color = LittleLemonColor.cloud
            )
            Image(
                painter = painterResource(id = R.drawable.upperpanelimage),
                contentDescription = "Upper Panel Image",
                modifier = Modifier.clip(RoundedCornerShape(10.dp))
            )
        }
        Button(
            onClick = {
                      Toast.makeText(context, "Order Take Away", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .padding(top = 20.dp, bottom = 20.dp, start = 16.dp, end = 16.dp)
        ) {
            Text(
                text = stringResource(id = R.string.order_button_text)
            )
        }
    }
}


@Composable
fun UpperPanelPreview(context: Context) {
    UpperPanel(context)
}
