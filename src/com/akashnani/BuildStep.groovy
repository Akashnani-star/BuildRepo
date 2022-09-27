package com.akashnani
class BuildStep{
  def build(sc){
    sc.echo "buildied"
    println sc.currentBuild
  }
  def buildVerify(sc){
    sc.echo "buildStepVerifying"
  }
}
