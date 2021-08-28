pipeline{
    agent{ label 'master' }
        stages{
            stage('test'){
                steps{
                    dir("API-REST_Service_Technical_Test"){
                        sh "gradle clean test --info"
                    }
                }
            }
            stage('Build application'){
                steps{
                    echo "prueba compilacion archivo Jenkinsfile"
                }
            }
        }
}