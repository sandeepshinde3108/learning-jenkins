pipeline{
    agent any

    stages{
        stage('build'){
            steps{
                script{
                    def status = 2+2 > 3 ? 'True' : 'False'
                    echo status
                }

                echo 'building..'
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