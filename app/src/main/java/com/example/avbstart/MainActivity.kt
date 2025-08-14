package com.example.avbstart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.avbstart.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()
            Scaffold(

                topBar = {
                    Box(
                        modifier = Modifier
                            .background(color = myBackground)
                    )
                },
                bottomBar = {
                    Box(
                        modifier = Modifier
                            .background(color = myBackground)
                    )
                }

                 
            ) { innerPadding ->
                NavHost(
                    navController = navController,
                    startDestination = "MainScreen",
                    modifier = Modifier
                        .padding(paddingValues = innerPadding)
                ) {
                    composable(route = "MainScreen") {
                        MainScreen(
                            navController,
                            innerPadding = innerPadding
                        )
                    }
                    composable(route = "RegistrationStep1") {
                        ScreenRegistrationStep1(navController)
                    }
                    composable(route = "RegistrationStep2") {
                        ScreenRegistrationStep2()
                    }
                }
            }
        }
    }
}
