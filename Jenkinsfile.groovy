
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "chmod +x -R ${env.WORKSPACE}/../${env.JOB_NAME}@script"
                sh "${env.WORKSPACE}/../${env.JOB_NAME}@script/run.sh"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
