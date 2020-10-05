package nl.pinxoft.jetpackdemo

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import nl.pinxoft.jetpackdemo.ui.JetpackDemoTheme

@Composable
fun OrderList(orders: List<Order>) {
    ScrollableColumn() {
        orders.forEach {
            Text(text = "${it.createdAt}")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OrderListPreview() {
    JetpackDemoTheme {
        OrderList(listOf(Order(), Order()))
    }
}