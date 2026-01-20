pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Building the AI model...'
                bat 'echo Simulating model training > build.log'
            }
        }

        stage('Test') {
            steps {
                echo 'Validating model accuracy...'
                bat 'echo Accuracy check passed > test.log'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying model to production...'
                bat 'echo Model deployed successfully > deploy.log'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully 🚀'
            archiveArtifacts artifacts: '*.log'
        }

        failure {
            echo 'Pipeline failed ❌'
        }
    }
}
