pipeline {
    agent any
    stages {
        stage('Prepare-pipeline') {
            steps {
                bat "mvn clean"
            }
        }

        stage('Deploy') {
            steps {
                script {
                    echo "Hello World"
                }
            }
        }
    }

    post {
        always {
            cleanWs() //not necessary here
        }
    }
}
