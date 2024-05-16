package com.example.storeapp.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.storeapp.viewModel.LoginViewModel

@Composable
fun Login(loginViewModel: LoginViewModel, modifier: Modifier){
    Surface(modifier = modifier) {
        LoginBody(loginViewModel)
    }
}

@Composable
fun LoginBody(loginViewModel: LoginViewModel){
    val username by loginViewModel.username.collectAsState("")
    val password by loginViewModel.password.collectAsState("")

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier =Modifier.fillMaxSize())
    {
        TextField(
            value = username,
            onValueChange = {loginViewModel.updateLogin(it,password)},
            label = { Text(text = "User") })
        Spacer(modifier = Modifier.size(10.dp))
        TextField(
            value = password,
            onValueChange = {loginViewModel.updateLogin(username, it)},
            label = { Text(text = "Pass")})
        Spacer(modifier = Modifier.size(10.dp))
        Button(onClick = { loginViewModel.loginInit() }) {
            Text(text = "AGREE")
        }
    }
}