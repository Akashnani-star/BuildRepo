package com.akashnani
class BuildStep{
  def build(sc){
    sc.echo "buildied"
  }
  def buildStepSuccess(sc){
    sc.echo "buildStepVerifying"
  }
}
