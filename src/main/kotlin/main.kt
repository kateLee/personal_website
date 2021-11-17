import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
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
        width(100.vw)
        height(100.vh)
        display(DisplayStyle.Flex)
        alignContent(AlignContent.Center)
        justifyContent(JustifyContent.Center)
        flexWrap(FlexWrap.Wrap)
    } } ) {
        Div {
            H1(attrs = {
                style {
                    color(Color.palegoldenrod)
                    display(DisplayStyle.Block)
                    padding(32.px)
                }
            }) {
                Text("Kate Lee")
            }
            links()
        }
    }
}
@Composable
fun links() {
    Div(attrs = {
        style {
            display(DisplayStyle.Flex)
            alignContent(AlignContent.Center)
            justifyContent(JustifyContent.Center)
            flexWrap(FlexWrap.Wrap)
        }
    }) {
        MaterialIconLink("book", "https://www.tenlong.com.tw/products/9789864348978")
        MaterialIconLink("rss_feed", "https://vocus.cc/user/@kate")
    }
}

@Composable
fun MaterialIcon(name: String) {
    I(attrs = { classes("material-icons") }) { Text(value = name) }
}
@Composable
fun MaterialIconLink(name: String, href: String) {
    A(attrs = {
        href(href)
        target(ATarget.Blank)
    }) {
        MaterialIcon(name)
    }
}

