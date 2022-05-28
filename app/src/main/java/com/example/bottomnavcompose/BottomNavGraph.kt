package com.example.bottomnavcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavcompose.screens.HomeScreen
import com.example.bottomnavcompose.screens.ProfileScreen
import com.example.bottomnavcompose.screens.SettingScreen

@Composable
fun BottomNavGraph(navController: NavController) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Setting.route){
            SettingScreen()
        }
    }

}