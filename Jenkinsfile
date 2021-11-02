pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('measurement') {
            steps {
                measure VMs: 1, iterations: 5, warmup: 4, repetitions: 3
            }
        }
    }
}