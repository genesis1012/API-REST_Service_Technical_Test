pipeline {
    agent { label 'master' }

        stages {
            stage ('Build application') {
                steps {
                    echo "Building.."
                }
            }
            stage ('Test application') {
                steps {
                    echo "Test application execution"

                    bat "gradle clean test --info"
                }
            }
            stage ('Deploy') {
                steps {
                    echo "Deploying...."
                }
            }
        }
}