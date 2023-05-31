pipeline{
    agent any

    tools {
        maven 'Maven-3.9.2'
    }

    environment {
        APP_VERSION = '1.3.0'
    }

    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'version choices')
        booleanParam(name: 'EXEC_TESTS', defaultValue: true, description: 'turn on or off tests')
    }

    stages{
        stage('build'){
            steps {
                echo 'building..'
                echo "building version ${APP_VERSION}"
                sh 'mvn compile'
            }
        }

        stage('test'){
            when{
                expression{
                    EXEC_TESTS
                }
            }
            steps{
                echo 'testing..'
                echo "testing version ${APP_VERSION}"
            }
        }

        stage('deploy'){
            steps{
                echo 'deploying..'
            }
        }
    }
}