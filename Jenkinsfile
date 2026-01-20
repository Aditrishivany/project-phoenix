pipeline {
    agent any

    parameters {
        choice(
            name: 'ENV',
            choices: ['DEV', 'STAGING', 'PROD'],
            description: 'Select environment'
        )

        string(
            name: 'VERSION',
            defaultValue: '1.0.0',
            description: 'Build or release version'
        )
    }

    stages {
        stage('Show Inputs') {
            steps {
                echo "Environment selected: ${ENV}"
                echo "Version: ${VERSION}"
            }
        }

        stage('Build') {
            steps {
                echo "Running build for version ${VERSION}"
                // Add your build steps here
            }
        }

        stage('Deploy') {
            steps {
                script {
                    if (ENV == 'DEV') {
                        echo "Deploying version ${VERSION} to DEV environment"
                    } 
                    else if (ENV == 'STAGING') {
                        echo "Deploying version ${VERSION} to STAGING environment"
                    } 
                    else if (ENV == 'PROD') {
                        echo "Deploying version ${VERSION} to PROD environment"
                    }
                }
            }
        }
    }
}
