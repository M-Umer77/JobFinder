package com.example.jobfinder.App.UI.ApplyJob

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.NotificationsNone
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobfinder.R


@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = {
            BottomAppBar(containerColor = Color.White,

                content = {
                    Icon(
                        Icons.Default.Home, "Home Icon",
                        modifier = Modifier.padding(start = 28.dp),
                        tint = Color.Black,
                    )
                    Spacer(Modifier.weight(1f))
                    Icon(
                        Icons.Default.Share, "Share Icon",
                        tint = Color.Black,
                    )
                    Spacer(Modifier.weight(1f))
                    Icon(
                        Icons.Default.AddCircle, "AddCircle Icon",
                        tint = Color.Black,
                    )
                    Spacer(Modifier.weight(1f))
                    Icon(
                        Icons.Default.Chat, "Chat Icon",
                        tint = Color.Black,
                    )
                    Spacer(Modifier.weight(1f))
                    Icon(
                        Icons.Default.Save, " IcoSaven",
                        modifier = Modifier.padding(end = 28.dp),
                        tint = Color.Black,
                    )
                }
            )
        }
    ) {
        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFF9F9F9))
                .verticalScroll(scrollState)
        ) {
            Box(
                modifier = Modifier
                    .padding(it)
                    .clip(
                        shape = RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp)
                    )
                    .fillMaxWidth()
                    .height(220.dp)
                    .paint(
                        painterResource(id = R.drawable.topbar),
                        contentScale = ContentScale.FillBounds
                    )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 28.dp)
                        .padding(top = 10.dp)
                )

                {
                    Row(
                        modifier = Modifier.fillMaxWidth()

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.iconnotifications),
                            contentDescription = "Menu Icon",
                            modifier = Modifier
                                .padding(top = 3.dp)
                                .size(31.dp)
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                        ) {
                            Text(
                                modifier = Modifier.padding(top = 10.dp, end = 7.dp),
                                text = "Hai, Brandone!",
                                fontWeight = FontWeight(600),
                                fontSize = 14.sp,
                                color = Color.White,
                            )

                            IconButton(
                                onClick = { }) {
                                Image(
                                    painter = painterResource(id = R.drawable.profilepic),
                                    contentDescription = "Profile Picture",
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Find the job you've always \ndreamed of",
                        color = Color.White,
                        fontWeight = FontWeight(700),
                        fontSize = 20.sp,
                    )

                    Spacer(modifier = Modifier.height(10.dp))
                    var SearchBar by remember { mutableStateOf("") }
                    Row(modifier = Modifier.fillMaxWidth()) {
                        TextField(modifier = Modifier
                            .width(350.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .height(55.dp)
                            .background(color = Color.White),
                            value = SearchBar,
                            onValueChange = {
                                SearchBar = it
                            },
                            maxLines = 1,
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color.Transparent,
                                focusedContainerColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,

                                ),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Search,
                                    contentDescription = "Search Icon",
                                    tint = Color(0xFFA0A7B1),
                                    modifier = Modifier.size(30.dp)
                                )
                            },

                            placeholder = {
                                Text(
                                    text = "Search",
                                    color = Color(0xFFA0A7B1),
                                    fontWeight = FontWeight(400),
                                    fontSize = 14.sp,
                                )
                            }
                        )

                        Box(
                            modifier = Modifier
                                .padding(start = 30.dp, top = 2.dp)
                                .clickable {

                                }
                                .clip(shape = RoundedCornerShape(10.dp))
                                .height(50.dp)
                                .width(50.dp)
                                .background(color = Color(0xFFFF9228)),
                            contentAlignment = Alignment.Center,
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.iconfilter),
                                contentDescription = "Menu Icon",
                                modifier = Modifier
                                    .height(30.dp)
                                    .width(30.dp)
                            )
                        }
                    }

                }
            }


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 28.dp)
            )
            {

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = "Specialization",
                        fontSize = 16.sp,
                        fontWeight = FontWeight(700),
                    )
                    Text(
                        text = "View All",
                        fontWeight = FontWeight(400),
                        fontSize = 12.sp,
                        color = Color(0xFFAAA6B9),
                    )
                }

                Spacer(modifier = Modifier.height(15.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                )
                {
                    Box(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(25.dp))
                            .height(137.dp)
                            .width(124.dp)
                            .background(Color.White)
                    ) {

                    }

                    Box(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(25.dp))
                            .height(137.dp)
                            .width(124.dp)
                            .background(Color.White)
                    ) {

                    }

                    Box(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(25.dp))
                            .height(137.dp)
                            .width(124.dp)
                            .background(Color.White)
                    ) {

                    }

                }

                Spacer(modifier = Modifier.height(15.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                )
                {
                    Box(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(25.dp))
                            .height(137.dp)
                            .width(124.dp)
                            .background(Color.White)
                    ) {

                    }

                    Box(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(25.dp))
                            .height(137.dp)
                            .width(124.dp)
                            .background(Color.White)
                    ) {

                    }

                    Box(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(25.dp))
                            .height(137.dp)
                            .width(124.dp)
                            .background(Color.White)
                    ) {

                    }

                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Job Recommendation",
                        fontSize = 16.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF150B3D),
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(25.dp))
                            .height(150.dp)
                            .width(450.dp)
                            .background(Color.White)
                    ) {

                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(25.dp))
                            .height(150.dp)
                            .width(450.dp)
                            .background(Color.White)
                    ) {

                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(25.dp))
                            .height(150.dp)
                            .width(450.dp)
                            .background(Color.White)
                    ) {

                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(25.dp))
                            .height(150.dp)
                            .width(450.dp)
                            .background(Color.White)
                    ) {

                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}





