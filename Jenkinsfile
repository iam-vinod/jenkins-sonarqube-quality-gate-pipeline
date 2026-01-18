pipeline {
    agent any

    tools {
        jdk 'java-17'
        maven 'maven-3'
    }

    environment {
        SONARQUBE_ENV = 'sonarqube-server'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/iam-vinod/jenkins-sonarqube-quality-gate-pipeline.git'
            }
        }

        stage('Build & Test') {
            steps {
                dir('app') {
                    sh 'mvn clean verify'
                }
            }
        }

        stage('SonarQube Analysis') {
            steps {
                dir('app') {
                    withSonarQubeEnv("${SONARQUBE_ENV}") {
                        sh 'mvn sonar:sonar'
                    }
                }
            }
        }

        stage('Quality Gate') {
            steps {
                timeout(time: 5, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }

    post {
        success {
            echo '✅ Build succeeded and Quality Gate passed'
        }
        failure {
            echo '❌ Build failed or Quality Gate failed'
        }
    }
}

