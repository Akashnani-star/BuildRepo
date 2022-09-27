import com.akashnani.BuildStep;
def call(){
  pipeline{
    agent any
    stages{
      stage("Build"){
        steps{
          echo "build"
          script{
            buildStep(this)
          }
        }
        post{
          success{
            echo "build success"
          }
        }
      }
    }
  }
}


def buildStep(sc){
   new BuildStep().build()
}
