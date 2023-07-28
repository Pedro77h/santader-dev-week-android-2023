package dio.me.presentation.components

import android.renderscript.Double2
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dio.me.presentation.theme.SantanderDevWeekTheme
import dio.me.presentation.theme.Spacing_2

@Composable
fun BalanceCard(modifier: Modifier = Modifier, balance: Double = 0.0, limit: Double = 0.0) {
    AppCard(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = Spacing_2)
    ) {
        Column(modifier = modifier.padding(Spacing_2)) {
            Row(modifier = modifier.fillMaxWidth()) {

            }
        }

    }

}

@Preview
@Composable
fun BalanceCardPreview() {
    SantanderDevWeekTheme {
        BalanceCard()
    }
}