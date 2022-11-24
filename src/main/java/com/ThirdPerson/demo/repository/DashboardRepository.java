package com.ThirdPerson.demo.repository;

import com.ThirdPerson.demo.models.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DashboardRepository extends JpaRepository<Dashboard, Long> {

    public Dashboard findDashboardById(Long id);
    public Dashboard findDashboardByName(String name);

}
