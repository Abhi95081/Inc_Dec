package com.example.inc_dec

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Dox() {
    var dox by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp), // Add padding to the entire layout
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Card for better appearance
        Card(
            modifier = Modifier.padding(16.dp), // Padding around the card
        ) {
            Column(
                modifier = Modifier.padding(16.dp), // Padding inside the card
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // Display the current value of dox
                Text(
                    text = "Value: $dox",
                    fontSize = 24.sp, // Larger font size
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(16.dp)) // Spacer for better spacing

                // Increment Button
                Button(
                    onClick = { dox++ },
                    colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF4CAF50), // Green button
                        contentColor = Color.White
                    ),
                    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 12.dp)
                ) {
                    Text(text = "Increment", fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.height(16.dp)) // Spacer for better spacing

                // Decrement Button
                Button(
                    onClick = { dox-- },
                    colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFF44336), // Red button
                        contentColor = Color.White
                    ),
                    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 12.dp)
                ) {
                    Text(text = "Decrement", fontSize = 18.sp)
                }
            }
        }
    }
}
