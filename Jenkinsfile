pipeline {
    agent { label 'master' }

        stages {

            stage ('test') {
                steps {

                    echo "INGRESAR EN EL SH"

                    sh "gradle clean test --info"

                }
            }

            stage ('Build application') {
                steps {
                    echo "prueba compilacion archivo Jenkinsfile"
                }
            }

            stage ('create image') {
                steps {
                    echo "create image"
                }
            }
        }
}