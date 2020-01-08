pipeline {
    agent any
    stages {
        stage('Prepare-pipeline') {
            steps {
                bat "mvn clean -f WebFluxExample"
            }
        }
        stage('Tests') {
            steps {
                bat "mvn test -f WebFluxExample"
            }
        }


        stage('Preparing jar') {
            steps {
                bat "mvn package -f WebFluxExample"
            }
        }

        stage('Deploy') {
            steps {
                bat "mvn package -f WebFluxExample"
            }
        }
    }

    post {
        always {
            cleanWs() //not necessary here
        }
    }
}
