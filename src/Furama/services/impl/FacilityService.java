package Furama.services.impl;

import Furama.models.Facility;
import Furama.repositories.IFacilityRepository;
import Furama.repositories.impl.FacilityRepository;
import Furama.services.IFacilityService;

import java.util.Map;

public class FacilityService implements IFacilityService {
    private IFacilityRepository iFacilityRepository = new FacilityRepository();

    @Override
    public Map<Facility, Integer> getList() {
        return iFacilityRepository.getList();
    }

    @Override
    public void add(Facility facility) {
        iFacilityRepository.add(facility);
    }

    @Override
    public Map<Facility, Integer> showMaintenanceList() {
        return iFacilityRepository.showMaintenanceList();
    }

    @Override
    public void delete(int id) {
        iFacilityRepository.delete(id);
    }
}
