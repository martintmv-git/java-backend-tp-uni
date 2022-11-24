package com.ThirdPerson.demo.services;

import com.ThirdPerson.demo.models.Dashboard;

import java.util.List;

public interface DashboardInterface {

    public Dashboard getDashboardById(Long id);
    public Dashboard getDashboardByName(String name);
    public Dashboard saveDashboard(Dashboard dashboard);
    public List<Dashboard> getAllDashboards();

}
