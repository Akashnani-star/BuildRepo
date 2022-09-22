package com.akashnani
class BuildStep{
  def build(sc){
    sc.echo "buildied"
  }
  def buildVeirfy(sc){
    sc.echo "buildStepVerifying"
  }
}
