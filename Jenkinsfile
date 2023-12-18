pipeline {
    agent any
    tools{
        maven 'M3.9.5'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/gittest-git/payservice']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    sh 'docker build -t chsivakumarstocks/payservice-image .'
                }
            }
        }
    }
}