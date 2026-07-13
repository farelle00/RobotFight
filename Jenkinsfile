pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Compilation du projet Maven'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Execution des tests unitaires'
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Pipeline execute avec succes'
        }
        failure {
            echo 'Le pipeline a echoue'
        }
    }
}
