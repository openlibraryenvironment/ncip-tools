pipeline {

  agent {
    label 'ncip-tools-agent'
  }

  triggers {
    cron('H */8 * * *') //regular builds
    pollSCM('* * * * *') //polling for changes, here once a minute
  }

  stages {

    stage('Publish Artifact to Nexus') {
      steps {
        sh './gradlew uploadArchives --no-daemon'
      }
    }

  }

}
