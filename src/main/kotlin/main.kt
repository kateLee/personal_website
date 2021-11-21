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
            name()
            links()
        }
    }
}
@Composable
fun name() {
    H1(attrs = {
        style {
            color(Color.palegoldenrod)
            padding(32.px)
            textAlign("center")
        }
    }) {
        Text("Kate Lee")
    }
}
@Composable
fun links() {
    Div(attrs = {
        style {
            alignContent(AlignContent.Center)
            justifyContent(JustifyContent.Center)
            flexWrap(FlexWrap.Wrap)
        }
    }) {
        SocialIconLink("book", "https://www.tenlong.com.tw/products/9789864348978")
        SocialIconLink("pencil", "https://vocus.cc/user/@kate")
        SocialIconLink("github", "https://github.com/kateLee/")
        SocialIconLink("code", "https://github.com/kateLee/personal_website")
        SocialIconLink("facebook", "https://www.facebook.com/yinyinlee.101")
        SocialIconLink("twitter", "https://twitter.com/YinYin_Kate_Lee")
        SocialIconLink("linkedin", "https://www.linkedin.com/in/kateleex")
        SocialIconLink("stack-overflow", "https://stackoverflow.com/users/5060406/kate-lee")
        SocialIconLink("android", "javascript:alert(\"Coming soon!\")")
        SocialIconLink("calendar", "javascript:alert(\"Coming soon!\")")
    }
}
@Composable
fun SocialIcon(name: String) {
    I(attrs = {
        classes("fa", "fa-$name")
        style {
            fontSize(32.px)
            padding(16.px)
        }
    })
}
@Composable
fun SocialIconLink(name: String, href: String) {
    A(attrs = {
        href(href)
        target(ATarget.Blank)
        style {
            color(Color.palegoldenrod)
        }
    }) {
        SocialIcon(name)
    }
}
