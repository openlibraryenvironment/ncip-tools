#!groovy

node {

  stage('Publish Artifact to Nexus') {
    sh './gradlew uploadArchives --no-daemon'
  }

}
