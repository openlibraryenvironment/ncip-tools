#!groovy

node {

  stage ('checkout') {
    checkout scm
  }

  stage('Publish Artifact to Nexus') {
    sh 'ls -l'
    sh './gradlew uploadArchives --no-daemon'
  }

}
