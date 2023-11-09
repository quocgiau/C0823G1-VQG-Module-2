package Furama.controllers;

import Furama.models.Facility;
import Furama.services.IFacilityService;
import Furama.services.impl.FacilityService;

import java.util.Map;

public class FacilityController {
    private IFacilityService iFacilityService = new FacilityService();

    public Map<Facility, Integer> getList() {
        return iFacilityService.getList();
    }

    public void add(Facility facility) {
        iFacilityService.add(facility);
    }

    public Map<Facility, Integer> showMaintenanceList() {
        return iFacilityService.showMaintenanceList();
    }

    public void delete(int id) {
        iFacilityService.delete(id);
    }
}
