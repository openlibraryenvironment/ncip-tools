#!groovy

node {

  stage('Publish Artifact to Nexus') {
    sh 'ls -l'
    sh './gradlew uploadArchives --no-daemon'
  }

}
