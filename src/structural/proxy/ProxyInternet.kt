package structural.proxy

class ProxyInternet: Internet {

    var internet = AccessToInternet()
    var bannedUrl: MutableList<String> = ArrayList()

    init {
        bannedUrl.add("twitter.com")
        bannedUrl.add("google.com")
        bannedUrl.add("facebook.com")
    }

    override fun connectTo(url: String) {
        if(bannedUrl.contains(url)){
            System.out.println("Intentado conectar con: $url")
            System.out.println("URL Bloqueada - Acceso denegado - Consulta con tu administrador")
        }else{
            internet.connectTo(url)
        }

    }
}