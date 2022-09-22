import com.akashnani.BuildStep

pipeline{

  agent any
  stages{
    stage("Build"){
      script{
        buildStep()
      }
    }
    post{
      success{
        script{
          buildStepSuccess()
        }
      }
    }
  }

}

def buildStep(){
  new BuildStep().build()
}

def buildStepSuccess(){
  new BuildStep().buildVerify()
}
