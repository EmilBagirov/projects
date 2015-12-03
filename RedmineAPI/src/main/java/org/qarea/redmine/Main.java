package org.qarea.redmine;

import com.taskadapter.redmineapi.*;
import com.taskadapter.redmineapi.bean.Issue;
import com.taskadapter.redmineapi.bean.IssueFactory;
import com.taskadapter.redmineapi.bean.User;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        String uri = "http://www.hostedredmine.com";
        String apiAccessKey = "d8cc21f0b29aff001cbee9f034312404b782b022";
        String projectKey = "deviceassignment";
        String userName = "Emil";
        Integer queryId = null; // any

        RedmineManager mgr = RedmineManagerFactory.createWithApiKey(uri, apiAccessKey);
        IssueManager issueManager = mgr.getIssueManager();
        List<Issue> issues = issueManager.getIssues(projectKey, queryId);

        Issue issue = issueManager.getIssueById(498283);
        System.out.println("Device's parameters: "+issue);

        User currentUser = mgr.getUserManager().getCurrentUser();
        User noUser = mgr.getUserManager().getUserById(1);

        String selectedUser = currentUser.toString();

        if (selectedUser.contains(userName.substring(1))) {
            System.out.println("device is assigned to you. Starting unassign process...");
            issue.setAssignee(noUser);
            issueManager.update(issue);
            System.out.println();
            System.out.println(currentUser+" is unassigned from the "+issue+" device");
        }

        else {
            issue.setAssignee(currentUser);
            issueManager.update(issue);
            System.out.println();
            System.out.println(currentUser + " is assigned to the " + issue + " device");
        }
    }
}
