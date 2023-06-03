package com.example.workoutplan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.workoutplan.data.Day
import com.example.workoutplan.data.MonthWorkOuts
import com.example.workoutplan.ui.theme.WorkoutPlanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorkoutPlanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WorkOutPlanApp()
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WorkOutPlanApp(){
    Scaffold(
        topBar = {
            TopUpBar(modifier = Modifier.fillMaxWidth())
        }
    ) {
        LazyColumn(
            modifier = Modifier.padding(it)
        ){
            items(MonthWorkOuts) { day ->
                DayCard(Day = day)
            }
        }
    }
}

@Composable
fun DayCard(Day: Day){
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
       modifier = Modifier
           .padding(16.dp)
           .animateContentSize(
               animationSpec = spring(
                   dampingRatio = 2f,
                   stiffness = Spring.StiffnessMediumLow
               )
           )

    ) {
        DayInfo(
            day = Day.day,
            title = Day.title,
            description = Day.description,
            photo = Day.image,
            modifier = Modifier
                .padding(16.dp)

        )
    }
}

@Composable
fun DayInfo(
    @StringRes day: Int,
    @StringRes title: Int,
    @StringRes description: Int,
    @DrawableRes photo: Int,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        Text(
            text = stringResource(id = day),
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onSurface
        )
        Text(
            text = stringResource(id = title),
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.onSurface
        )
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = photo),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { expanded = !expanded }
                ,

            )
        }
       if (expanded){
           Text(
               text = stringResource(id = description),
               style = MaterialTheme.typography.bodyMedium,
               color = MaterialTheme.colorScheme.onSurface
           )
       }
    }
}

@Composable
fun TopUpBar(modifier: Modifier = Modifier){
    Row(
        modifier = modifier
            .background(MaterialTheme.colorScheme.surface),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(id = R.string.top_bar),
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WorkoutPlanTheme(dynamicColor = false) {
        WorkOutPlanApp()
    }
}