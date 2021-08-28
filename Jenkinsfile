pipeline {
    agent { label 'master' }

        stages {

            stage ('Test') {

                steps {

                    echo "INGRESAR EN EL SH "

                    bat "gradle clean test --info"

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