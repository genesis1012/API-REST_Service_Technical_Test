pipeline {
    agent { label 'master' }

        stages {

            stage ('Test') {

                steps {

                    echo "Ejecucion prueba de funcionamiento"

                    bat "gradle clean test"

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