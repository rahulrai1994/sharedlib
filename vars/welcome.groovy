def call(){
cleanWs()
checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rahulrai1994/maven-java.git']]])
}
