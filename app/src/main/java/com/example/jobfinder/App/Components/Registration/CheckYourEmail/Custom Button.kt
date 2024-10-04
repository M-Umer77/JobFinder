package com.example.jobfinder.App.Components.Registration.CheckYourEmail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(12.dp), // Rounded corners as seen in the image
        modifier = modifier
            .fillMaxWidth()
            .height(50.dp), // Adjust height to match the image
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent) // No solid color, just gradient
    ) {
        // Gradient background for the button
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFF7B5CF5), // Left gradient color
                            Color(0xFFA992FF)  // Right gradient color
                        )
                    )
                )
                .clip(RoundedCornerShape(10.dp)), // Ensure the background follows the rounded corners
            contentAlignment = Alignment.Center // Center the text
        ) {
            Text(
                text = text,
                fontSize = 12.sp, // Adjust font size
                fontWeight = FontWeight(600),
                color = Color.White // White text color as seen in the image
            )
        }
    }
}
