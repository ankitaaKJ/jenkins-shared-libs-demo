def call(Map config = [:]) {
    sh " docker run -d -p 80:80 ${config.name}"
}

