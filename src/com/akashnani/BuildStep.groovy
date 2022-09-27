package com.akashnani
class BuildStep{
  def build(sc){
    sc.echo "buildied"
    sc.echo sc.currentBuild
  }
  def buildVerify(sc){
    sc.echo "buildStepVerifying"
  }
}
