def call(Map config=[:], Closure body) {
    node {
        stage("reservation"){
            echo "reserve"
        }
        stage("installation"){
            echo "installation"
        }
        stage("configuration"){
            echo "configuration"
        }
        body()
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