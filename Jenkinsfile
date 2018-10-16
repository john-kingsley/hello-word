#!/usr/bin/env groovy

def jenkinsFile
stage('Loading Jenkins file') {
  jenkinsFile = fileLoader.fromGit('Jenkinsfile', 'https://github.com/john-kingsley/hello-word.git', 'testrepo', null, '')
}

jenkinsFile.start()
