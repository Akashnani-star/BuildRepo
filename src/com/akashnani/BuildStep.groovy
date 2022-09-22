package com.akashnani
class BuildStep{
  def build(sc){
    sc.echo "buildied"
  }
  def buildVerify(sc){
    sc.echo "buildStepVerifying"
  }
}
