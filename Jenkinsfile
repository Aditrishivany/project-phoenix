pipeline {
    agent any

    stages {

        stage('Build & Test') {
            steps {
                echo 'Running Maven build and unit tests...'
                dir('dosage-calculator') {
                    bat 'mvn clean test'
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application (simulated)...'
                bat 'echo Deployment successful > deploy.log'
            }
        }
    }

    post {
        success {
            echo 'Pipeline SUCCESS – all tests passed 🚀'
            archiveArtifacts artifacts: 'dosage-calculator/target/*.jar, deploy.log', allowEmptyArchive: true
        }

        failure {
            echo 'Pipeline FAILED – tests caught a bug ❌'
        }
    }
}
