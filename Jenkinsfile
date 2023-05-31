pipeline{
    agent any

    tools {
        maven 'Maven-3.9.2'
    }

    stages{
        stage('build'){
            steps {
                echo 'building..'
                sh 'mvn compile'
            }
        }

        stage('test'){
            steps{
                echo 'testing..'
            }
        }

        stage('deploy'){
            steps{
                echo 'deploying..'
            }
        }
    }
}