#!/usr/bin/env groovy

node {
	checkout scm
	
	stage('Build') {
		echo 'Building....'
		archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
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