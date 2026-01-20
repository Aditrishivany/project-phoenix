pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Building the AI model...'
                sh 'echo "Simulating model training"'
            }
        }

        stage('Test') {
            steps {
                echo 'Validating model accuracy...'
                sh 'echo "Accuracy check passed"'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying model to production...'
                sh 'echo "Model deployed successfully"'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully 🚀'
            archiveArtifacts artifacts: '**/*.log', allowEmptyArchive: true
        }

        failure {
            echo 'Pipeline failed ❌'
        }
    }
}
