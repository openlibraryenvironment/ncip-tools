#!groovy

node {

  stages {

    stage('Publish Artifact to Nexus') {
      steps {
        sh './gradlew uploadArchives --no-daemon'
      }
    }

  }

}
