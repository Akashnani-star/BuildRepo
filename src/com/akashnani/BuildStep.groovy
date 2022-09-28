package com.akashnani
class BuildStep{
  def build(sc){
    sc.echo "buildied"
    hello = sc.sh returnStdout: true, script: "echo hello"
    sc.println hello
    sc.println sc.currentBuild
  }
  def buildVerify(sc){
    sc.echo "buildStepVerifying"
  }
}
