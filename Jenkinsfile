pipeline {
    agent any

    tools {
        maven 'Maven 3.9.10'
        jdk 'JDK17'
    }

    stages {
        stage('Compilar') {
            steps {
                dir('saludoapp') {
                    sh 'mvn clean compile'
                }
            }
        }
        stage('Probar') {
            steps {
                dir('saludoapp') {
                    sh 'mvn test'
                }
            }
        }
        stage('Empaquetar') {
            steps {
                dir('saludoapp') {
                    sh 'mvn package'
                }
            }
        }
    }

    post {
        success {
            echo "🎉 El build fue exitoso"
        }
        failure {
            echo "💥 El build falló"
        }
    }
}