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
        stage('push image to hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerpwd', variable: 'dockerpwd')]) {
                    sh 'docker login -u chsivakumarstocks -p ${dockerpwd}'
                    }
                    sh 'docker push chsivakumarstocks/payservice-image'
                }
            }
        }
    }
}