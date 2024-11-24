package com.hexaware.assignment1;

public class Project {
	private String projectId;
	private String projectName;
	private String projectHead;
	private int noOfResources;
	
	public Project() {
		
	}
	
	public Project(String projectId, String projectName, String projectHead, int noOfResources) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectHead() {
		return projectHead;
	}
	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}
	public int getNoOfResources() {
		return noOfResources;
	}
	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", noOfResources=" + noOfResources + "]";
	}
	
	public static void main (String[]args) {
		Project projectObj= new Project();
		projectObj.setProjectId("PR1");
		projectObj.setProjectName("Meta Project");
		projectObj.setProjectHead("Shivank");
		projectObj.setNoOfResources(10);
		
		System.out.println(projectObj);
		
	}
}
