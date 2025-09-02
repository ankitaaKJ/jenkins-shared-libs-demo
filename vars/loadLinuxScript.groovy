def call(Map config = [:]) { 
  def scriptcontents = libraryResource "Dockerfile"    
  writeFile file: "${config.name}", text: scriptcontents 
} 