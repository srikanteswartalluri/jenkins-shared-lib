def call(Map config=[:], Closure body) {
    node {
        pipeline{
            agent any
            stages{
                stage("reservation"){
                    steps{
                        echo "reserve"
                    }
                }
                stage("installation"){
                    steps{
                        echo "installation"
                    }
                }
                stage("configuration"){
                    steps{
                        echo "configuration"
                    }
                }
                body()
            }
            post{
                always{
                    echo "cleanup"
                }
                success{
                    echo "success"
                }
            
            }
        }

    }
}