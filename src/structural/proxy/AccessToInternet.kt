package structural.proxy

class AccessToInternet: Internet {
    override fun connectTo(url: String) {
        System.out.println("Conectando a: $url")
    }
}