def gv

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
        stage('init'){
            steps{
                script{
                    gv = load 'script.groovy'
                }
            }
        }

        stage('build'){
            steps {
                script{
                    gv.buildApp()
                }
            }
        }

        stage('test'){
            when{
                expression{
                    params.EXEC_TESTS == true
                }
            }
            steps{
                script{
                    gv.testApp()
                }
            }
        }

        stage('deploy'){
            steps{
                script{
                    gv.deployApp()
                }
            }
        }
    }
}