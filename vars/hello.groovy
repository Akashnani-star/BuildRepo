import com.akashnani.BuildStep

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
            script{
              buildStepSuccess(this)
            }
          }
        }
      }
    }
  }
}

def buildStep(script){
  new BuildStep().build(script)
}

def buildStepSuccess(script){
  new BuildStep().buildVerify(script)
}
