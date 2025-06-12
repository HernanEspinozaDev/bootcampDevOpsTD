pipeline {
    agent any

    tools {
        // Estos nombres DEBEN coincidir con los que configuraste en "Global Tool Configuration"
        maven 'Maven 3.9.10'
        jdk 'JDK11'
    }

    stages {
        stage('Compilar') {
            steps {
                // Ejecutamos los comandos dentro de la carpeta del proyecto
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