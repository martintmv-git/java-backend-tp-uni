package com.ThirdPerson.demo.Controller;

import com.ThirdPerson.demo.models.Dashboard;
import com.ThirdPerson.demo.models.ImageResponse;
import com.ThirdPerson.demo.services.DashboardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dashboard")
public class DashboardController {

    private DashboardService dashboardService;


    @GetMapping()
    public ResponseEntity<List<Dashboard>> getAllDashboards() throws Exception {
        List<Dashboard> dashboards = dashboardService.getAllDashboards();
        return ResponseEntity.ok().body(dashboards);
    }
    @GetMapping("/dashboard")
    public ResponseEntity<Dashboard> getDashboard(@RequestParam Long id) throws Exception {
        Dashboard dashboard = dashboardService.getDashboardById(id);
        return ResponseEntity.ok().body(dashboard);
    }
    @PostMapping
    public ResponseEntity<Dashboard> postDashBoard(@RequestBody Dashboard dashboard){

       Dashboard dashboard1 = dashboardService.saveDashboard(dashboard);
       return ResponseEntity.ok().body(dashboard1);
    }



}
