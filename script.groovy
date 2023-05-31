def buildApp(){
    echo 'building..'
    echo "building version ${APP_VERSION}"
    sh 'mvn compile'
}

def testApp(){
    echo 'testing..'
    echo "testing version ${APP_VERSION}"
}

def deployApp(){
    echo 'deploying app'
}

return this