import com.akashnani.BuildStep
def call(){
  pipeline{
    agent any
    stages{
      stage("Build"){
        script{
          buildStep(this)
        }
      }
      post{
        success{
          script{
            buildStepSuccess(this)
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
