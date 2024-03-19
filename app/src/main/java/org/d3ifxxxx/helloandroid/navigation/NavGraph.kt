package org.d3ifxxxx.helloandroid.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.d3ifxxxx.helloandroid.ui.screen.MainScreen

@Composable
fun SetupNavGraph(navHostController: NavHostController = rememberNavController()){
    NavHost(navController = navHostController,
        startDestination = Screen.Home.route){
        composable(route = Screen.Home.route){
            MainScreen()
        }
    }
}