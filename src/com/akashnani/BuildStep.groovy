package com.akashnani
class BuildStep{
  def build(sc){
    sc.echo "buildied"
    sc.println sc.currentBuild
  }
  def buildVerify(sc){
    sc.echo "buildStepVerifying"
  }
}
