package org.d3ifxxxx.helloandroid.navigation

sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")
}