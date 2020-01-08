pipeline {
    agent any
    stages {
        stage('Prepare-pipeline') {
            steps {
                bat "mvn clean"
            }
        }
        stage('Tests') {
            steps {
                bat "mvn test"
            }
        }


        stage('Preparing jar') {
            steps {
                bat "mvn package"
            }
        }

        stage('Deploy') {
            steps {
                bat "mvn package"
            }
        }
    }

    post {
        always {
            cleanWs() //not necessary here
        }
    }
}
