pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
                echo "Commit Hash: ${env.GIT_COMMIT}"
            }
        }

        stage('Build') {
            steps {
                dir('delivery-tracker/app') {
                    bat '..\\gradlew.bat clean build'
                }
            }
        }

        stage('Package') {
            steps {
                dir('delivery-tracker/app') {
                    bat '..\\gradlew.bat distZip'
                }
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'delivery-tracker/app/build/distributions/*.zip',
                             fingerprint: true
        }
    }
}
