#!/usr/bin/env groovy

node {
	checkout scm
	
	stage('Build') {
		echo 'Building....'
		sh 'make'
		archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
	}
	stage('Test') {
		echo 'Building....'
	}
	stage('Deploy') {
		echo 'Deploying....'
	}
 	

}