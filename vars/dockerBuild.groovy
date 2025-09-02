def call(Map config = [:]) {
    loadLinuxScript(name: 'Dockerfile')
    sh "docker build -t myApacheImg ."
    dockerRun(name: 'myApacheImg')
}


