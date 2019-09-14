# chrome-reactive-kotlin

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/pl.wendigo/chrome-reactive-kotlin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/pl.wendigo/chrome-reactive-kotlin) [![Build Status](https://github.com/wendigo/chrome-reactive-kotlin/workflows/Test/badge.svg)](https://github.com/wendigo/chrome-reactive-kotlin/actions) [![Javadocs](https://www.javadoc.io/badge/pl.wendigo/chrome-reactive-kotlin.svg)](https://www.javadoc.io/doc/pl.wendigo/chrome-reactive-kotlin)

**chrome-reactive-kotlin** is a low level [Chrome DevTools Protocol](https://chromedevtools.github.io/debugger-protocol-viewer/) client written in [Kotlin](https://kotlinlang.org) and leveraging [RxJava2](https://github.com/ReactiveX/RxJava) for easy composability. 

Library exposes all protocol domains in a single, cohesive and highly composable API. It supports both headless and standalone Chrome versions and understands [BrowserContext](https://chromedevtools.github.io/debugger-protocol-viewer/tot/Target/) from [Target]((https://chromedevtools.github.io/debugger-protocol-viewer/tot/Target/)) domain.

For debugging purposes you can use my other project: [chrome-protocol-proxy](https://github.com/wendigo/chrome-protocol-proxy).

Please note that most up-to-date protocol is used at the moment.

**Documentation can be found on [https://wendigo.github.io/chrome-reactive-kotlin/](https://wendigo.github.io/chrome-reactive-kotlin/).**

# Usage

Add to your Kotlin or Java project (Gradle dependency): 

```compile group: 'pl.wendigo', name: 'chrome-reactive-kotlin', version: '0.5.+'```

# Example

Run headless chrome:

```
docker container run -d -p 9222:9222 zenika/alpine-chrome --no-sandbox --remote-debugging-address=0.0.0.0 --remote-debugging-port=9222 about:blank
```

And now execute:

```kotlin
import pl.wendigo.chrome.api.page.NavigateRequest

fun main() {
    val browser = Browser.connect("127.0.0.1:9222")
    val session = browser.headlessSession("about:blank")

    await {
        session.Page.enable()
    }

    await {
        session.Page.navigate(NavigateRequest(url = "https://github.com/wendigo/chrome-reactive-kotlin")).flatMap { (frameId) ->
            session.Page.frameStoppedLoading().filter {
                it.frameId == frameId
            }.take(1).singleOrError()
        }
    }

    session.close()
    browser.close()
}
```
