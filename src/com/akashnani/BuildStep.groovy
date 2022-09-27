package com.akashnani
class BuildStep{
  def build(sc){
    sc.echo "buildied"
    sc.println currentBuild
  }
  def buildVerify(sc){
    sc.echo "buildStepVerifying"
  }
}
