import org.company.app.App
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        BrowserViewportWindow("Compose App") {
            App()
        }
    }
}
