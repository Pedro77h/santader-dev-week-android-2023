package dio.me.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dio.me.data.mock.Mocks
import dio.me.data.model.News
import dio.me.presentation.theme.SantanderDevWeekTheme

@Composable
fun NewsPagerApp(
    modifier: Modifier = Modifier,
    news: List<News> = emptyList()
) {
    Column() {

    }
}

@Preview
@Composable
fun NewsPagerAppPreview() {
    SantanderDevWeekTheme() {
        NewsPagerApp(news = Mocks.newsList)
    }
}