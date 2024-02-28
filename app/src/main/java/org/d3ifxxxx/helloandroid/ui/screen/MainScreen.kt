package org.d3ifxxxx.helloandroid.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.d3ifxxxx.helloandroid.R
import org.d3ifxxxx.helloandroid.ui.theme.HelloAndroidTheme

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MainScreen(){
        Scaffold (
            topBar = {
                TopAppBar(title = {
                    Text(text = stringResource(id = R.string.app_name))
                },
                    colors = TopAppBarDefaults.mediumTopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary,
                    )
                )
            }
        ){paddingValues -> ScreenContent(Modifier.padding(paddingValues))

        }
    }

    @Composable
    fun ScreenContent(modifier: Modifier){
        var berat by remember { mutableStateOf("") }
        var tinggi by remember { mutableStateOf("") }

        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = stringResource(id = R.string.bmi_intro),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.fillMaxWidth()
            )
            OutlinedTextField(value = berat,
                onValueChange = { berat = it},
                label = { Text(text = stringResource(id = R.string.berat_badan))},
                trailingIcon = { Text(text = "kg")},
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                ),
                modifier = Modifier.fillMaxWidth()
            )
            OutlinedTextField(value = tinggi,
                onValueChange = { tinggi = it},
                label = { Text(text = stringResource(id = R.string.tinggi_badan))},
                trailingIcon = { Text(text = "cm")},
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }

    @Preview(showBackground = true)
    @Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
    @Composable
    fun ScreenPreview() {
        HelloAndroidTheme {
            MainScreen()
        }
    }
