pipeline {
    agent any

      parameters {
                string(name: 'CURRENT_VINTAGE', description: 'Current vintage')
            }
    stages {
        stage('Prepare-pipeline') {
            steps {
                echo "${CURRENT_VINTAGE}"
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
