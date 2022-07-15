#!/usr/bin/env groovy

node {
	checkout scm
	
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