package dio.me.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dio.me.data.model.Feature
import dio.me.presentation.theme.SantanderDevWeekTheme
import dio.me.data.mock.Mocks
import dio.me.presentation.theme.Spacing_2

@Composable
fun MenuItems(
    modifier: Modifier = Modifier, features: List<Feature> = emptyList()
) {
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(Spacing_2)
    ) {
        items(features) { feature ->
            AppCard(
                modifier = modifier.size(width = 110.dp, height = 96.dp)
            ) {
                Column(
                    modifier = modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SvgImage(url = feature.icon)
                    Text(
                        text = feature.description,
                        modifier = modifier.padding(top = Spacing_2)
                    )
                }
            }

        }
    }
}


@Preview
@Composable
fun MenuItemsPreview() {
    SantanderDevWeekTheme {
        MenuItems(features = Mocks.featureList)
    }
}