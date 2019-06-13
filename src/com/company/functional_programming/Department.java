package com.company.functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<TeamMember> teamMembers;

    public Department(String name) {
        this.name = name;
        teamMembers = new ArrayList<>();
    }

    public void addTeamMember(TeamMember teamMember){
        teamMembers.add(teamMember);
    }

    public List<TeamMember> getTeamMembers() {
        return teamMembers;
    }
}
