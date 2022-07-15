#!/usr/bin/env groovy

node {
	checkout scm
	echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
	
	stage('Build') {
		echo 'Building....'
	}
	stage('Test') {
		echo 'Building....'
	}
	stage('Deploy') {
		echo 'Deploying....'
		if (currentBuild.result == null || currentBuild.result == 'SUCCESS') { 1
			echo 'Deployed sucessfully....'
		}
	}
 	

}