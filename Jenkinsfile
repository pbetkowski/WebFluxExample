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
                    sh './abc.sh'

                    sh './src/main/java/domain/cde.sh'
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
