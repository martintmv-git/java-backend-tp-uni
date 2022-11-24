package com.ThirdPerson.demo.services;

import com.ThirdPerson.demo.models.Dashboard;
import com.ThirdPerson.demo.repository.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService implements DashboardInterface{

    @Autowired
    private DashboardRepository dashboardRepository;

    @Override
    public Dashboard getDashboardById(Long id) {
      return dashboardRepository.findDashboardById(id);
    }

    @Override
    public Dashboard getDashboardByName(String name) {
        return dashboardRepository.findDashboardByName(name);
    }

    @Override
    public Dashboard saveDashboard(Dashboard dashboard) {
        return dashboardRepository.save(dashboard);
    }

    @Override
    public List<Dashboard> getAllDashboards() {
        return dashboardRepository.findAll();
    }


}
