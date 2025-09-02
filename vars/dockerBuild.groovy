def call(Map config = [:]) {
    loadLinuxScript(name: 'Dockerfile')
    sh "docker build -t myApacheImg."

}
