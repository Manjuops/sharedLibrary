// vars/helloWorld.groovy
def call() {
    pipeline {
        agent any
        
        stages {
            stage('Hello') {
                steps {
                    script {
                        echo 'Hello, World!'
                    }
                }
            }
        }
    }
}

