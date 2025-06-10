package com.davi.dev.blazebird.presentation.screen.splash

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.wear.tooling.preview.devices.WearDevices.SMALL_ROUND
import com.davi.dev.blazebird.R
import com.davi.dev.blazebird.presentation.navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun AnimatedSplashScreen(navController: NavHostController) {
    LaunchedEffect(key1 = true) {
        delay(4000)
        navController.popBackStack()
        navController.navigate(Routes.GAME_SCREEN)
    }
    Splash()
}

@Composable
fun Splash() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_logo_v2),
            contentDescription = "Bird icon",
            modifier = Modifier
                .fillMaxSize()
        )
    }
}

@Composable
@Preview(device = SMALL_ROUND, showBackground = true, showSystemUi = true)
fun SplashScreenPreview() {
    Splash()
}

@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES, device = SMALL_ROUND, showBackground = true, showSystemUi = true)
fun SplashScreenDarkPreview() {
    Splash()
}