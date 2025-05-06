pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/твой-репозиторий.git'
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
