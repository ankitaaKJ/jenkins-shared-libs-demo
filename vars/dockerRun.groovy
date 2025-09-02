def call(Map config = [:]) {
    sh "docker run -d $(config.name)"
}

