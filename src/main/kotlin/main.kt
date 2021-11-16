import androidx.compose.runtime.*
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.attr
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        Body()
    }
}

@Composable
fun Body() {
    Div( attrs = { style {
        backgroundColor(Color.black )
        width(100.vh)
        height(100.vh)
    } } ) {
        Span(
            attrs = { style {
                color(Color.palegoldenrod )
                textAlign("center")
            }  } // inline style
        ) {
            Text("Kate Lee")
        }
        Br {}
        A (attrs = {
            href("https://www.tenlong.com.tw/products/9789864348978")
            target(ATarget.Blank) } ) {
            Text("Book")
        }
    }
}
